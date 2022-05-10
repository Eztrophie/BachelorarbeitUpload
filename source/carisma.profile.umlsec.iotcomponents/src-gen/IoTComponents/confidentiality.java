/**
 */
package IoTComponents;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>confidentiality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IoTComponents.confidentiality#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link IoTComponents.confidentiality#getBase_Association <em>Base Association</em>}</li>
 *   <li>{@link IoTComponents.confidentiality#getBase_Interface <em>Base Interface</em>}</li>
 * </ul>
 *
 * @see IoTComponents.IoTComponentsPackage#getconfidentiality()
 * @model
 * @generated
 */
public interface confidentiality extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see IoTComponents.IoTComponentsPackage#getconfidentiality_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link IoTComponents.confidentiality#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Association</em>' reference.
	 * @see #setBase_Association(Association)
	 * @see IoTComponents.IoTComponentsPackage#getconfidentiality_Base_Association()
	 * @model ordered="false"
	 * @generated
	 */
	Association getBase_Association();

	/**
	 * Sets the value of the '{@link IoTComponents.confidentiality#getBase_Association <em>Base Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Association</em>' reference.
	 * @see #getBase_Association()
	 * @generated
	 */
	void setBase_Association(Association value);

	/**
	 * Returns the value of the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Interface</em>' reference.
	 * @see #setBase_Interface(Interface)
	 * @see IoTComponents.IoTComponentsPackage#getconfidentiality_Base_Interface()
	 * @model ordered="false"
	 * @generated
	 */
	Interface getBase_Interface();

	/**
	 * Sets the value of the '{@link IoTComponents.confidentiality#getBase_Interface <em>Base Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Interface</em>' reference.
	 * @see #getBase_Interface()
	 * @generated
	 */
	void setBase_Interface(Interface value);

} // confidentiality
