package carisma.check.iotcomponents;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;

import carisma.core.analysis.AnalysisHost;
import carisma.core.analysis.result.AnalysisResultMessage;
import carisma.core.analysis.result.StatusType;
import carisma.core.checks.CheckParameter;
import carisma.core.checks.CarismaCheckWithID;

import carisma.profile.umlsec.iotcomponents.UMLsec;
import carisma.profile.umlsec.iotcomponents.UMLsecUtil;



/** Contains a Simple CARiSMA Check which returns all elements of a given Model.
 *
 */

public class IoTComponentsCheck implements CarismaCheckWithID {
	
	// Check IDs
	public static final String CHECK_ID = "carisma.check.iotcomponents"; //$NON-NLS-1$
	public static final String PARAM_CONFIGURATION = "carisma.check.iotcomponents.configuration"; //$NON-NLS-1$
	public static final String CHECK_NAME = "IoT Components"; //$NON-NLS-1$

	public static final UMLsec[] GOALS = { 	UMLsec.CONFIDENTIALITY_IOTCOMP, 
											UMLsec.INTEGRITY_IOTCOMP, 
											UMLsec.AVAILABILITY_IOTCOMP,
											UMLsec.TRANSPARENCY_IOTCOMP,
											UMLsec.UNLINKABILITY_IOTCOMP,
											UMLsec.INTERVENABILITY_IOTCOMP};
	
	AnalysisHost host;
	int numOfElements = 0;
	
	@Override
	public boolean perform(Map<String, CheckParameter> parameters, AnalysisHost host) {
		this.host = host;
		this.numOfElements = 0;
		Resource currentModel = host.getAnalyzedModel();
		if (currentModel.getContents().isEmpty()) {
			host.addResultMessage(new AnalysisResultMessage(StatusType.WARNING, "Empty model"));
			return false;
		}
		
		if (currentModel.getContents().get(0) instanceof Package) {
			Package model = (Package) currentModel.getContents().get(0);
			printContent(model, "");
			
			// Check if Goals are applied to parts of the Model
			if (!checkIsApplicable(model, false)) {
				host.addResultMessage(new AnalysisResultMessage(StatusType.WARNING, "No verifiable Goals"));
				return false;// No goal's => Check not applicable => Fail
			}
			host.appendLineToReport("------------------------------------------------------------------------------------");
			host.appendLineToReport("Goals detected");
			host.appendLineToReport("------------------------------------------------------------------------------------\n");
			
			
			Map<UMLsec, List<Stereotype>> mapping = generateFulfillmentMapping(model);
			//Enrich model
			enrichModel(model, mapping);
			host.appendLineToReport("------------------------------------------------------------------------------------");
			host.appendLineToReport("Model after adding stereotypes based on names :");
			printContent(model, "");
			
			//Check which Goals are fulfilled
			
			boolean returnBool = true;
			HashMap<UMLsec, HashMap<Element, Boolean>> fullfilment = new HashMap<>();
			for (UMLsec umLsec : GOALS) {
				HashMap<Element, Boolean> goalFulfillment = checkGoalFulfillment(model, umLsec, mapping);
				fullfilment.put(umLsec, goalFulfillment);
				
				//Generate Message
				if(goalFulfillment.isEmpty()) {
					host.addResultMessage(new AnalysisResultMessage(StatusType.INFO, umLsec.toString() + " not applied to model"));
				}else if(! goalFulfillment.keySet().stream().map(x -> goalFulfillment.get(x)).toList().contains(false)) {
					host.addResultMessage(new AnalysisResultMessage(StatusType.INFO, umLsec.toString() + " fulfilled" ));
				}else {
					if(umLsec.equals(UMLsec.INTERVENABILITY_IOTCOMP)) {
						host.addResultMessage(new AnalysisResultMessage(StatusType.WARNING, umLsec.toString() + " not fulfilled but the Profile doesn`t provied Stereotypes to fulfill the  it"));
					}else {
						host.addResultMessage(new AnalysisResultMessage(StatusType.ERROR, umLsec.toString() + " not fulfilled" ));
						returnBool = false;//unfulfilled always contains INTERVENABILITY_IOTCOMP if its in the model => set returnBool to false
					}
				}
			}
			
			// Make recomendations
			HashMap<UMLsec, List<Element>> unfulfilled = spotUnfulfilledGoals(fullfilment);

			if(unfulfilled.isEmpty()) {
				return true;//No improvements needed => check not successful
			}
			
			recommendImprovements(model, unfulfilled, mapping);
			
			
			
			return returnBool;//Improvements needed => check not successful
		}
		
		host.addResultMessage(new AnalysisResultMessage(StatusType.WARNING, "Content is not a model!"));
		return false;
	}
	
	public void printContent(Element element, String indent) {
		numOfElements++;
		host.appendToReport(indent+element.eClass().getName()+": ");
		if (!element.getAppliedStereotypes().isEmpty()) {
			host.appendToReport("<<");
			for (Stereotype st : element.getAppliedStereotypes()) {
				host.appendToReport(st.getName()+",");
			}
			host.appendToReport(">> ");
		}
		if (element instanceof NamedElement) {
			NamedElement namedElement = (NamedElement)element;
			host.appendToReport(namedElement.getName());
		}
		host.appendLineToReport("");
		for (Element child : element.allOwnedElements()) {
			printContent(child, indent+"  ");
		}
	}

	@Override
	public String getCheckID() {
		return CHECK_ID;
	}

	@Override
	public String getName() {
		return CHECK_NAME;
	}

	
	/**
	 * Checks if at least one Element in the Model has one of the goal stereotypes applied
	 * @param element - Model 
	 * @param value
	 * @return
	 */
	private boolean checkIsApplicable(Element element, boolean value) {
		EList<Stereotype> appliedStereotypes = element.getAppliedStereotypes();
		for (Stereotype stereotype : appliedStereotypes) {
			for (UMLsec umLsec : GOALS) {
				if(umLsec.isEqual(stereotype)) {
					return true;
				}
			}
		}
		for (Element child : element.allOwnedElements()) {
			value = value || checkIsApplicable(child, value);
		}
		return value;
	}
	
	/**
	 * If the name of a class in the model contains the the name of a stereotype 
	 * the stereotype with the same name is applied to the class for the 
	 * duration of the check
	 * @param model
	 * @param mapping
	 */
	private void enrichModel(Package model, Map<UMLsec, List<Stereotype>> mapping) {
		//Generate list of all classes in the model
		List<Element> classes = model.getOwnedElements().stream().filter(x -> x instanceof Class || x instanceof Interface).toList();	
		//Generate list of all stereotypes in the fulfillment mapping
		List<Stereotype> stereotypes=mapping.values().stream().flatMap(Collection::stream).collect(Collectors.toList()).stream().distinct().toList();
		for (Element element : classes) {
			List<Stereotype> applyStereotypes = new LinkedList<Stereotype>();
			String className = ((NamedElement) element).getName();
			
			for (Stereotype stereotype : stereotypes) {
				if(className.equals(stereotype.getName())|| className.toLowerCase().contains(stereotype.getName().toLowerCase())) {
					applyStereotypes.add(stereotype);					
				}				
			}
			
			if(!applyStereotypes.isEmpty()) {
				host.appendLineToReport("Applying Stereotypes " + applyStereotypes.stream().map(x -> x.getName()).toList().toString() + 
						 " to " + element.eClass().getName() + " because of the Name " + ((NamedElement) element).getName());
				applyStereotypes.forEach(x -> element.applyStereotype(x));
			}					
		}
	}

	/**
	 * Loads all stereotypes from the applied profile and checks for each GOAL
	 * which stereotypes fulfill the goal
	 * 
	 * @param model
	 * @return Map with goals as key and a list of all stereotypes which fulfill the goal as value
	 */
	private Map<UMLsec , List<Stereotype>> generateFulfillmentMapping(Package model){
		Map<UMLsec, List<Stereotype>> mapping = new HashMap<UMLsec, List<Stereotype>>();
		Profile profile = model.getAllAppliedProfiles().stream().filter(x -> UMLsec.DESCRIPTOR.getProfileName().equals(x.getName())).toList().get(0);
		List<Stereotype> allStereotypes = profile.allApplicableStereotypes();
		for (UMLsec umLsec : GOALS) {
			List<Stereotype> stereotypes = new LinkedList<Stereotype>();
			for (Stereotype element : allStereotypes) {
				if ((!umLsec.isEqual(element) )&& stereotypeFulfillsGoal(element, umLsec)) {
					stereotypes.add(element);
				}
			}
			mapping.put(umLsec, stereotypes);
		}
		return mapping;
	}
	
	/**
	 * 
	 * @param model - the model
	 * @param goal - a goal stereotype to check fulfillment for
	 * @param mapping - a mapping with the goal stereotypes as keys and
	 * a list containing all stereotypes which fulfill the goal stereotypes as vale
	 * @return A map with the key being a class which applies the goal stereotype and
	 * the value as boolean if the goal is fulfilled
	 */
	private HashMap<Element, Boolean> checkGoalFulfillment(Package model, UMLsec goal, Map<UMLsec , List<Stereotype>> mapping){
		host.appendLineToReport("------------------------------------------------------------------------------------");
		host.appendLineToReport("Checking for " + goal.toString() + " fulfillment");
		HashMap<Element, Boolean> result = new HashMap<Element, Boolean>();
		List<Element> annotatedElements = UMLsecUtil.getStereotypedElements(model, goal);
		for (Element element : annotatedElements) {
			boolean stereotypeFulfillment=false;
			if (element instanceof Class) {
				stereotypeFulfillment = element.getAppliedStereotypes().stream().map(x -> mapping.get(goal).contains(x)).toList().contains(true);//Fulfills Goal itself
				 
				if(!stereotypeFulfillment) {// check associated classes
					for (Association association : ((Class) element).getAssociations()) {
						List<Element> members = association.getRelatedElements();
						for (Element member : members) {
							EList<Stereotype> s = member.getAppliedStereotypes();
							stereotypeFulfillment = stereotypeFulfillment || s.stream().map(x -> mapping.get(goal).contains(x)).toList().contains(true);
						}
					}
					
				}				
				
			}else if(element instanceof Interface) {
				stereotypeFulfillment = element.getAppliedStereotypes().stream().map(x -> mapping.get(goal).contains(x)).toList().contains(true);//Fulfills Goal itself
				if(!stereotypeFulfillment) {
					
					List<Element> allRealizationInModel = ((Interface) element).getPackage().allOwnedElements().stream().filter(x -> x instanceof InterfaceRealization ).toList();
					List<EList<NamedElement>> members = allRealizationInModel.stream().filter(x -> ((InterfaceRealization) x).getContract().equals(element)).map(x -> ((InterfaceRealization) x).getClients()).toList();
					List<NamedElement> distinctMembers = members.stream().flatMap(Collection::stream).collect(Collectors.toList()).stream().distinct().toList();
					for (Element member : distinctMembers) {
						EList<Stereotype> s = member.getAppliedStereotypes();
						stereotypeFulfillment = stereotypeFulfillment || s.stream().map(x -> mapping.get(goal).contains(x)).toList().contains(true);
					}
				}
				
			}else if (element instanceof Association) {
				List<EList<Stereotype>> memberStereotypes = ((Association) element).getRelatedElements().stream().map(x -> x.getAppliedStereotypes()).toList();
				EList<Stereotype> memberOne = memberStereotypes.get(0);
				EList<Stereotype> memberTwo = memberStereotypes.get(1);
				List<Stereotype> both = memberOne.stream().filter(x -> memberTwo.contains(x)).toList();
				stereotypeFulfillment = both.stream().map(x -> mapping.get(goal).contains(x)).toList().contains(true);
			}else {
				host.appendLineToReport(((NamedElement) element).getName() + " is of type " + ((NamedElement) element).eClass().toString() + " and shouldn't be applicable");
				continue;
			}
			result.put(element, stereotypeFulfillment);
			host.appendLineToReport(element.eClass().getName() + " " + ((NamedElement)element).getName() + (stereotypeFulfillment ? " fulfills " : " doesn't fulfill ") + goal.toString());
		}
		
		if(result.isEmpty()) {
			host.appendLineToReport("No Element tries to fulfill " + goal.toString());
	}
		
		return result;
	}


	/**
	 * Checks if the stereotype stereo fulfills the UMLsec goal by
	 * checking if stereo is a generalization of goal
	 * 
	 * @param stereo - a stereotype to check
	 * @param goal - a goal stereotype 
	 * @return true if stereo is a generalization of, or equal to goal 
	 */
	private boolean stereotypeFulfillsGoal(Stereotype stereo, UMLsec goal) {
		if (stereo.allParents().isEmpty()) {
			if (goal.isEqual(stereo)) {
				return true;
			}else {
				return false;
			}
		}else {
			boolean returnval = false;
			for ( Classifier parents : stereo.allParents()) {
				returnval = returnval || stereotypeFulfillsGoal((Stereotype)parents, goal);
			}
			return returnval;
		}
	}
	

	/**
	 * Reduces map of fulfillment to only the classes that don't fulfill
	 * the goals.
	 * @param fullfilment - map of goal stereotypes and 
	 * a map of the classes applying them and if they are fulfilled
	 * @return map of goal stereotypes as key and a list of all classes which are annotated with 
	 * this stereotype but don't have it fulfilled
	 */
	private HashMap<UMLsec, List<Element>> spotUnfulfilledGoals(
			HashMap<UMLsec, HashMap<Element, Boolean>> fullfilment) {
		HashMap<UMLsec, List<Element>> unfulfilled = new HashMap<UMLsec, List<Element>>();
		for (UMLsec umLsec : fullfilment.keySet()) {
			List <Element> b = new LinkedList<Element>();
			for (Element key : fullfilment.get(umLsec).keySet()) {
				if(!fullfilment.get(umLsec).get(key)) {
					b.add(key);
				}
			}
			unfulfilled.put(umLsec, b);
		}
		
		return unfulfilled;
	}

	/**
	 * Lists for each class with unfulfilled goals all classes in the
	 * model which have at least one stereotype fulfilling the unfulfilled
	 * goals in the report
	 * @param model
	 * @param unfulfilled
	 * @param mapping
	 */
	private void recommendImprovements(Package model, HashMap<UMLsec, List<Element>> unfulfilled,
			Map<UMLsec, List<Stereotype>> mapping) {
		List<Element> allClassesInModel = model.allOwnedElements().stream().filter(x -> x instanceof Class || x instanceof Interface).toList();
		for (UMLsec umLsec : unfulfilled.keySet()) {
			for (Element element : unfulfilled.get(umLsec)) {
				StringBuilder sb =new StringBuilder();
				sb.append(((NamedElement) element).getName() + " recommendations for " + umLsec.toString() + ":\n" );
				for (Element c : allClassesInModel) {
					List<Stereotype> solutions = c.getAppliedStereotypes().stream().filter(x -> mapping.get(umLsec).contains(x)).toList();
					if (!solutions.isEmpty()) {
						List<String> solutionNames = solutions.stream().map(x -> x.getName()).toList();
						sb.append(  "Class " + ((NamedElement) c).getName() + " provides : " + solutionNames.toString() + "\n");
					}
				}
				host.appendToReport(sb.toString());
			}
			host.appendLineToReport("------------------------------------------------------------------------------------\n");
		}
		
	}
	

}