package carisma.profile.umlsec.iotcomponents;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import carisma.core.Carisma;
import carisma.core.logging.Logger;
import carisma.core.logging.LogLevel;

public class Activator implements BundleActivator {

	private static BundleContext context;
	
//	private static final String EMF_URI ="http://www.umlsec.de/profiles/UMLsec/RABAC";
//	private static final String EMF_FILE = "platform:/plugin/carisma.profile.umlsec.iotcomponents/profile/IoTComponents.ecore";
//	
//	private static final String UML_URI = "http://www.umlsec.de/profiles/UMLsec/IoTComponents";
	private static final String UML_FILE = "platform:/plugin/carisma.profile.umlsec.iotcomponents/profile/IoTComponents.profile.uml";
	
	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		try {
			Carisma.getInstance().getModelManager().addMapping("IoTComponents.profile.uml",UML_FILE );
		} catch (Exception e) {
			Logger.log(LogLevel.ERROR, "Error while putting profile path to map", e);
		}
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
