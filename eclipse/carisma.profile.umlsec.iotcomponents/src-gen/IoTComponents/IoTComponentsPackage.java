/**
 */
package IoTComponents;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see IoTComponents.IoTComponentsFactory
 * @model kind="package"
 * @generated
 */
public interface IoTComponentsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "IoTComponents";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.umlsec.de/profiles/UMLsec/IoTComponents";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "IoTComponents";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IoTComponentsPackage eINSTANCE = IoTComponents.impl.IoTComponentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link IoTComponents.impl.intervenabilityImpl <em>intervenability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.intervenabilityImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getintervenability()
	 * @generated
	 */
	int INTERVENABILITY = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENABILITY__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENABILITY__BASE_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>intervenability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENABILITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>intervenability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.confidentialityImpl <em>confidentiality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.confidentialityImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getconfidentiality()
	 * @generated
	 */
	int CONFIDENTIALITY = 3;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIALITY__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIALITY__BASE_ASSOCIATION = 1;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIALITY__BASE_INTERFACE = 2;

	/**
	 * The number of structural features of the '<em>confidentiality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIALITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>confidentiality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIALITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.encryptionImpl <em>encryption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.encryptionImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getencryption()
	 * @generated
	 */
	int ENCRYPTION = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION__BASE_CLASS = CONFIDENTIALITY__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION__BASE_ASSOCIATION = CONFIDENTIALITY__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION__BASE_INTERFACE = CONFIDENTIALITY__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>encryption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_FEATURE_COUNT = CONFIDENTIALITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>encryption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTION_OPERATION_COUNT = CONFIDENTIALITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.TLSImpl <em>TLS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.TLSImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getTLS()
	 * @generated
	 */
	int TLS = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS__BASE_CLASS = ENCRYPTION__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS__BASE_ASSOCIATION = ENCRYPTION__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS__BASE_INTERFACE = ENCRYPTION__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>TLS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_FEATURE_COUNT = ENCRYPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TLS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLS_OPERATION_COUNT = ENCRYPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.unlinkabilityImpl <em>unlinkability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.unlinkabilityImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getunlinkability()
	 * @generated
	 */
	int UNLINKABILITY = 4;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLINKABILITY__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLINKABILITY__BASE_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>unlinkability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLINKABILITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>unlinkability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLINKABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.integrityImpl <em>integrity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.integrityImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getintegrity()
	 * @generated
	 */
	int INTEGRITY = 6;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY__BASE_ASSOCIATION = 1;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY__BASE_INTERFACE = 2;

	/**
	 * The number of structural features of the '<em>integrity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>integrity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.checksumsImpl <em>checksums</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.checksumsImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getchecksums()
	 * @generated
	 */
	int CHECKSUMS = 5;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUMS__BASE_CLASS = INTEGRITY__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUMS__BASE_ASSOCIATION = INTEGRITY__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUMS__BASE_INTERFACE = INTEGRITY__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>checksums</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUMS_FEATURE_COUNT = INTEGRITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>checksums</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUMS_OPERATION_COUNT = INTEGRITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.authenticationImpl <em>authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.authenticationImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getauthentication()
	 * @generated
	 */
	int AUTHENTICATION = 9;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__BASE_CLASS = INTEGRITY__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__BASE_ASSOCIATION = INTEGRITY__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__BASE_INTERFACE = INTEGRITY__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_FEATURE_COUNT = INTEGRITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_OPERATION_COUNT = INTEGRITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.certificateImpl <em>certificate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.certificateImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getcertificate()
	 * @generated
	 */
	int CERTIFICATE = 7;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE__BASE_CLASS = AUTHENTICATION__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE__BASE_ASSOCIATION = AUTHENTICATION__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE__BASE_INTERFACE = AUTHENTICATION__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>certificate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_FEATURE_COUNT = AUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>certificate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_OPERATION_COUNT = AUTHENTICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.signingImpl <em>signing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.signingImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getsigning()
	 * @generated
	 */
	int SIGNING = 8;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNING__BASE_CLASS = INTEGRITY__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNING__BASE_ASSOCIATION = INTEGRITY__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNING__BASE_INTERFACE = INTEGRITY__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>signing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNING_FEATURE_COUNT = INTEGRITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>signing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNING_OPERATION_COUNT = INTEGRITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.availabilityImpl <em>availability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.availabilityImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getavailability()
	 * @generated
	 */
	int AVAILABILITY = 10;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__BASE_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>availability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>availability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.transparencyImpl <em>transparency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.transparencyImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#gettransparency()
	 * @generated
	 */
	int TRANSPARENCY = 11;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPARENCY__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPARENCY__BASE_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>transparency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPARENCY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>transparency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPARENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.securitypatchesImpl <em>securitypatches</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.securitypatchesImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getsecuritypatches()
	 * @generated
	 */
	int SECURITYPATCHES = 12;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITYPATCHES__BASE_CLASS = INTEGRITY__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITYPATCHES__BASE_ASSOCIATION = INTEGRITY__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITYPATCHES__BASE_INTERFACE = INTEGRITY__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>securitypatches</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITYPATCHES_FEATURE_COUNT = INTEGRITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>securitypatches</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITYPATCHES_OPERATION_COUNT = INTEGRITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.automaticpatchmanagementImpl <em>automaticpatchmanagement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.automaticpatchmanagementImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getautomaticpatchmanagement()
	 * @generated
	 */
	int AUTOMATICPATCHMANAGEMENT = 13;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATICPATCHMANAGEMENT__BASE_CLASS = SECURITYPATCHES__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATICPATCHMANAGEMENT__BASE_ASSOCIATION = SECURITYPATCHES__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATICPATCHMANAGEMENT__BASE_INTERFACE = SECURITYPATCHES__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>automaticpatchmanagement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATICPATCHMANAGEMENT_FEATURE_COUNT = SECURITYPATCHES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>automaticpatchmanagement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATICPATCHMANAGEMENT_OPERATION_COUNT = SECURITYPATCHES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.encryptedconfigurationImpl <em>encryptedconfiguration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.encryptedconfigurationImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getencryptedconfiguration()
	 * @generated
	 */
	int ENCRYPTEDCONFIGURATION = 14;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTEDCONFIGURATION__BASE_CLASS = ENCRYPTION__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTEDCONFIGURATION__BASE_ASSOCIATION = ENCRYPTION__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTEDCONFIGURATION__BASE_INTERFACE = ENCRYPTION__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>encryptedconfiguration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTEDCONFIGURATION_FEATURE_COUNT = ENCRYPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>encryptedconfiguration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTEDCONFIGURATION_OPERATION_COUNT = ENCRYPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.encrypteddatastoreImpl <em>encrypteddatastore</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.encrypteddatastoreImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getencrypteddatastore()
	 * @generated
	 */
	int ENCRYPTEDDATASTORE = 15;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTEDDATASTORE__BASE_CLASS = ENCRYPTION__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTEDDATASTORE__BASE_ASSOCIATION = ENCRYPTION__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTEDDATASTORE__BASE_INTERFACE = ENCRYPTION__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>encrypteddatastore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTEDDATASTORE_FEATURE_COUNT = ENCRYPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>encrypteddatastore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTEDDATASTORE_OPERATION_COUNT = ENCRYPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.redundantinfrastructureImpl <em>redundantinfrastructure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.redundantinfrastructureImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getredundantinfrastructure()
	 * @generated
	 */
	int REDUNDANTINFRASTRUCTURE = 16;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUNDANTINFRASTRUCTURE__BASE_CLASS = AVAILABILITY__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUNDANTINFRASTRUCTURE__BASE_INTERFACE = AVAILABILITY__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>redundantinfrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUNDANTINFRASTRUCTURE_FEATURE_COUNT = AVAILABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>redundantinfrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUNDANTINFRASTRUCTURE_OPERATION_COUNT = AVAILABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.desasterrecoveryImpl <em>desasterrecovery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.desasterrecoveryImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getdesasterrecovery()
	 * @generated
	 */
	int DESASTERRECOVERY = 17;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESASTERRECOVERY__BASE_CLASS = AVAILABILITY__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESASTERRECOVERY__BASE_INTERFACE = AVAILABILITY__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>desasterrecovery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESASTERRECOVERY_FEATURE_COUNT = AVAILABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>desasterrecovery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESASTERRECOVERY_OPERATION_COUNT = AVAILABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.accesscontrolImpl <em>accesscontrol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.accesscontrolImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getaccesscontrol()
	 * @generated
	 */
	int ACCESSCONTROL = 18;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSCONTROL__BASE_CLASS = UNLINKABILITY__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSCONTROL__BASE_INTERFACE = UNLINKABILITY__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>accesscontrol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSCONTROL_FEATURE_COUNT = UNLINKABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>accesscontrol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSCONTROL_OPERATION_COUNT = UNLINKABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.dataclassificationImpl <em>dataclassification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.dataclassificationImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getdataclassification()
	 * @generated
	 */
	int DATACLASSIFICATION = 19;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACLASSIFICATION__BASE_CLASS = TRANSPARENCY__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACLASSIFICATION__BASE_INTERFACE = TRANSPARENCY__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>dataclassification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACLASSIFICATION_FEATURE_COUNT = TRANSPARENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>dataclassification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACLASSIFICATION_OPERATION_COUNT = TRANSPARENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.tokenImpl <em>token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.tokenImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#gettoken()
	 * @generated
	 */
	int TOKEN = 20;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__BASE_CLASS = AUTHENTICATION__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__BASE_ASSOCIATION = AUTHENTICATION__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__BASE_INTERFACE = AUTHENTICATION__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = AUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_OPERATION_COUNT = AUTHENTICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.loggingImpl <em>logging</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.loggingImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getlogging()
	 * @generated
	 */
	int LOGGING = 21;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING__BASE_CLASS = TRANSPARENCY__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING__BASE_INTERFACE = TRANSPARENCY__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>logging</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_FEATURE_COUNT = TRANSPARENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>logging</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_OPERATION_COUNT = TRANSPARENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.loadbalancerImpl <em>loadbalancer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.loadbalancerImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getloadbalancer()
	 * @generated
	 */
	int LOADBALANCER = 22;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCER__BASE_CLASS = REDUNDANTINFRASTRUCTURE__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCER__BASE_INTERFACE = REDUNDANTINFRASTRUCTURE__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>loadbalancer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCER_FEATURE_COUNT = REDUNDANTINFRASTRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>loadbalancer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADBALANCER_OPERATION_COUNT = REDUNDANTINFRASTRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.messagebufferImpl <em>messagebuffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.messagebufferImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getmessagebuffer()
	 * @generated
	 */
	int MESSAGEBUFFER = 23;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGEBUFFER__BASE_CLASS = REDUNDANTINFRASTRUCTURE__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGEBUFFER__BASE_INTERFACE = REDUNDANTINFRASTRUCTURE__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>messagebuffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGEBUFFER_FEATURE_COUNT = REDUNDANTINFRASTRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>messagebuffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGEBUFFER_OPERATION_COUNT = REDUNDANTINFRASTRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.backupsImpl <em>backups</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.backupsImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getbackups()
	 * @generated
	 */
	int BACKUPS = 24;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKUPS__BASE_CLASS = DESASTERRECOVERY__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKUPS__BASE_INTERFACE = DESASTERRECOVERY__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>backups</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKUPS_FEATURE_COUNT = DESASTERRECOVERY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>backups</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKUPS_OPERATION_COUNT = DESASTERRECOVERY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.X509Impl <em>X509</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.X509Impl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getX509()
	 * @generated
	 */
	int X509 = 25;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509__BASE_CLASS = CERTIFICATE__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509__BASE_ASSOCIATION = CERTIFICATE__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509__BASE_INTERFACE = CERTIFICATE__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>X509</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_FEATURE_COUNT = CERTIFICATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>X509</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_OPERATION_COUNT = CERTIFICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.RBACImpl <em>RBAC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.RBACImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getRBAC()
	 * @generated
	 */
	int RBAC = 26;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC__BASE_CLASS = ACCESSCONTROL__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC__BASE_INTERFACE = ACCESSCONTROL__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>RBAC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_FEATURE_COUNT = ACCESSCONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>RBAC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_OPERATION_COUNT = ACCESSCONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.ABACImpl <em>ABAC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.ABACImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getABAC()
	 * @generated
	 */
	int ABAC = 27;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAC__BASE_CLASS = ACCESSCONTROL__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAC__BASE_INTERFACE = ACCESSCONTROL__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>ABAC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAC_FEATURE_COUNT = ACCESSCONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ABAC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAC_OPERATION_COUNT = ACCESSCONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.HttpbasicauthenticationImpl <em>Httpbasicauthentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.HttpbasicauthenticationImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getHttpbasicauthentication()
	 * @generated
	 */
	int HTTPBASICAUTHENTICATION = 28;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTPBASICAUTHENTICATION__BASE_CLASS = AUTHENTICATION__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTPBASICAUTHENTICATION__BASE_ASSOCIATION = AUTHENTICATION__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTPBASICAUTHENTICATION__BASE_INTERFACE = AUTHENTICATION__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>Httpbasicauthentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTPBASICAUTHENTICATION_FEATURE_COUNT = AUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Httpbasicauthentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTPBASICAUTHENTICATION_OPERATION_COUNT = AUTHENTICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.usernamepasswordauthenticationImpl <em>usernamepasswordauthentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.usernamepasswordauthenticationImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getusernamepasswordauthentication()
	 * @generated
	 */
	int USERNAMEPASSWORDAUTHENTICATION = 29;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERNAMEPASSWORDAUTHENTICATION__BASE_CLASS = AUTHENTICATION__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERNAMEPASSWORDAUTHENTICATION__BASE_ASSOCIATION = AUTHENTICATION__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERNAMEPASSWORDAUTHENTICATION__BASE_INTERFACE = AUTHENTICATION__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>usernamepasswordauthentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERNAMEPASSWORDAUTHENTICATION_FEATURE_COUNT = AUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>usernamepasswordauthentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERNAMEPASSWORDAUTHENTICATION_OPERATION_COUNT = AUTHENTICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.identityproviderImpl <em>identityprovider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.identityproviderImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getidentityprovider()
	 * @generated
	 */
	int IDENTITYPROVIDER = 30;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITYPROVIDER__BASE_CLASS = AUTHENTICATION__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITYPROVIDER__BASE_ASSOCIATION = AUTHENTICATION__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITYPROVIDER__BASE_INTERFACE = AUTHENTICATION__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>identityprovider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITYPROVIDER_FEATURE_COUNT = AUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>identityprovider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITYPROVIDER_OPERATION_COUNT = AUTHENTICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.OAuthImpl <em>OAuth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.OAuthImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getOAuth()
	 * @generated
	 */
	int OAUTH = 31;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH__BASE_CLASS = TOKEN__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH__BASE_ASSOCIATION = TOKEN__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH__BASE_INTERFACE = TOKEN__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>OAuth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_FEATURE_COUNT = TOKEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OAuth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_OPERATION_COUNT = TOKEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.OAuth2Impl <em>OAuth2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.OAuth2Impl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getOAuth2()
	 * @generated
	 */
	int OAUTH2 = 32;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2__BASE_CLASS = TOKEN__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2__BASE_ASSOCIATION = TOKEN__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2__BASE_INTERFACE = TOKEN__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>OAuth2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_FEATURE_COUNT = TOKEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OAuth2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_OPERATION_COUNT = TOKEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.JasonWebTokenImpl <em>Jason Web Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.JasonWebTokenImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getJasonWebToken()
	 * @generated
	 */
	int JASON_WEB_TOKEN = 33;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JASON_WEB_TOKEN__BASE_CLASS = TOKEN__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JASON_WEB_TOKEN__BASE_ASSOCIATION = TOKEN__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JASON_WEB_TOKEN__BASE_INTERFACE = TOKEN__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>Jason Web Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JASON_WEB_TOKEN_FEATURE_COUNT = TOKEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Jason Web Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JASON_WEB_TOKEN_OPERATION_COUNT = TOKEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.MACImpl <em>MAC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.MACImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getMAC()
	 * @generated
	 */
	int MAC = 34;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC__BASE_CLASS = CHECKSUMS__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC__BASE_ASSOCIATION = CHECKSUMS__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC__BASE_INTERFACE = CHECKSUMS__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>MAC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_FEATURE_COUNT = CHECKSUMS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MAC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OPERATION_COUNT = CHECKSUMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.HMACImpl <em>HMAC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.HMACImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getHMAC()
	 * @generated
	 */
	int HMAC = 35;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMAC__BASE_CLASS = CHECKSUMS__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMAC__BASE_ASSOCIATION = CHECKSUMS__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMAC__BASE_INTERFACE = CHECKSUMS__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>HMAC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMAC_FEATURE_COUNT = CHECKSUMS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>HMAC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMAC_OPERATION_COUNT = CHECKSUMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.IPSecImpl <em>IP Sec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.IPSecImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getIPSec()
	 * @generated
	 */
	int IP_SEC = 36;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_SEC__BASE_CLASS = ENCRYPTION__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_SEC__BASE_ASSOCIATION = ENCRYPTION__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_SEC__BASE_INTERFACE = ENCRYPTION__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>IP Sec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_SEC_FEATURE_COUNT = ENCRYPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IP Sec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_SEC_OPERATION_COUNT = ENCRYPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.VPNImpl <em>VPN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.VPNImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getVPN()
	 * @generated
	 */
	int VPN = 37;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN__BASE_CLASS = IP_SEC__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN__BASE_ASSOCIATION = IP_SEC__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN__BASE_INTERFACE = IP_SEC__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>VPN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_FEATURE_COUNT = IP_SEC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VPN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_OPERATION_COUNT = IP_SEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.MQTTImpl <em>MQTT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.MQTTImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getMQTT()
	 * @generated
	 */
	int MQTT = 38;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT__BASE_CLASS = TLS__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT__BASE_ASSOCIATION = TLS__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT__BASE_INTERFACE = TLS__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>MQTT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_FEATURE_COUNT = TLS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MQTT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_OPERATION_COUNT = TLS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.ModbusImpl <em>Modbus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.ModbusImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getModbus()
	 * @generated
	 */
	int MODBUS = 39;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODBUS__BASE_CLASS = TLS__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODBUS__BASE_ASSOCIATION = TLS__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODBUS__BASE_INTERFACE = TLS__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>Modbus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODBUS_FEATURE_COUNT = TLS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modbus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODBUS_OPERATION_COUNT = TLS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.AMPQImpl <em>AMPQ</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.AMPQImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getAMPQ()
	 * @generated
	 */
	int AMPQ = 40;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMPQ__BASE_CLASS = TLS__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMPQ__BASE_ASSOCIATION = TLS__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMPQ__BASE_INTERFACE = TLS__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>AMPQ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMPQ_FEATURE_COUNT = TLS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AMPQ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMPQ_OPERATION_COUNT = TLS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IoTComponents.impl.HTTPSImpl <em>HTTPS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IoTComponents.impl.HTTPSImpl
	 * @see IoTComponents.impl.IoTComponentsPackageImpl#getHTTPS()
	 * @generated
	 */
	int HTTPS = 41;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTPS__BASE_CLASS = TLS__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTPS__BASE_ASSOCIATION = TLS__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Base Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTPS__BASE_INTERFACE = TLS__BASE_INTERFACE;

	/**
	 * The number of structural features of the '<em>HTTPS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTPS_FEATURE_COUNT = TLS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>HTTPS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTPS_OPERATION_COUNT = TLS_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link IoTComponents.intervenability <em>intervenability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>intervenability</em>'.
	 * @see IoTComponents.intervenability
	 * @generated
	 */
	EClass getintervenability();

	/**
	 * Returns the meta object for the reference '{@link IoTComponents.intervenability#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see IoTComponents.intervenability#getBase_Class()
	 * @see #getintervenability()
	 * @generated
	 */
	EReference getintervenability_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link IoTComponents.intervenability#getBase_Interface <em>Base Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Interface</em>'.
	 * @see IoTComponents.intervenability#getBase_Interface()
	 * @see #getintervenability()
	 * @generated
	 */
	EReference getintervenability_Base_Interface();

	/**
	 * Returns the meta object for class '{@link IoTComponents.TLS <em>TLS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TLS</em>'.
	 * @see IoTComponents.TLS
	 * @generated
	 */
	EClass getTLS();

	/**
	 * Returns the meta object for class '{@link IoTComponents.encryption <em>encryption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>encryption</em>'.
	 * @see IoTComponents.encryption
	 * @generated
	 */
	EClass getencryption();

	/**
	 * Returns the meta object for class '{@link IoTComponents.confidentiality <em>confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>confidentiality</em>'.
	 * @see IoTComponents.confidentiality
	 * @generated
	 */
	EClass getconfidentiality();

	/**
	 * Returns the meta object for the reference '{@link IoTComponents.confidentiality#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see IoTComponents.confidentiality#getBase_Class()
	 * @see #getconfidentiality()
	 * @generated
	 */
	EReference getconfidentiality_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link IoTComponents.confidentiality#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see IoTComponents.confidentiality#getBase_Association()
	 * @see #getconfidentiality()
	 * @generated
	 */
	EReference getconfidentiality_Base_Association();

	/**
	 * Returns the meta object for the reference '{@link IoTComponents.confidentiality#getBase_Interface <em>Base Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Interface</em>'.
	 * @see IoTComponents.confidentiality#getBase_Interface()
	 * @see #getconfidentiality()
	 * @generated
	 */
	EReference getconfidentiality_Base_Interface();

	/**
	 * Returns the meta object for class '{@link IoTComponents.unlinkability <em>unlinkability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>unlinkability</em>'.
	 * @see IoTComponents.unlinkability
	 * @generated
	 */
	EClass getunlinkability();

	/**
	 * Returns the meta object for the reference '{@link IoTComponents.unlinkability#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see IoTComponents.unlinkability#getBase_Class()
	 * @see #getunlinkability()
	 * @generated
	 */
	EReference getunlinkability_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link IoTComponents.unlinkability#getBase_Interface <em>Base Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Interface</em>'.
	 * @see IoTComponents.unlinkability#getBase_Interface()
	 * @see #getunlinkability()
	 * @generated
	 */
	EReference getunlinkability_Base_Interface();

	/**
	 * Returns the meta object for class '{@link IoTComponents.checksums <em>checksums</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>checksums</em>'.
	 * @see IoTComponents.checksums
	 * @generated
	 */
	EClass getchecksums();

	/**
	 * Returns the meta object for class '{@link IoTComponents.integrity <em>integrity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>integrity</em>'.
	 * @see IoTComponents.integrity
	 * @generated
	 */
	EClass getintegrity();

	/**
	 * Returns the meta object for the reference '{@link IoTComponents.integrity#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see IoTComponents.integrity#getBase_Class()
	 * @see #getintegrity()
	 * @generated
	 */
	EReference getintegrity_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link IoTComponents.integrity#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see IoTComponents.integrity#getBase_Association()
	 * @see #getintegrity()
	 * @generated
	 */
	EReference getintegrity_Base_Association();

	/**
	 * Returns the meta object for the reference '{@link IoTComponents.integrity#getBase_Interface <em>Base Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Interface</em>'.
	 * @see IoTComponents.integrity#getBase_Interface()
	 * @see #getintegrity()
	 * @generated
	 */
	EReference getintegrity_Base_Interface();

	/**
	 * Returns the meta object for class '{@link IoTComponents.certificate <em>certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>certificate</em>'.
	 * @see IoTComponents.certificate
	 * @generated
	 */
	EClass getcertificate();

	/**
	 * Returns the meta object for class '{@link IoTComponents.signing <em>signing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>signing</em>'.
	 * @see IoTComponents.signing
	 * @generated
	 */
	EClass getsigning();

	/**
	 * Returns the meta object for class '{@link IoTComponents.authentication <em>authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>authentication</em>'.
	 * @see IoTComponents.authentication
	 * @generated
	 */
	EClass getauthentication();

	/**
	 * Returns the meta object for class '{@link IoTComponents.availability <em>availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>availability</em>'.
	 * @see IoTComponents.availability
	 * @generated
	 */
	EClass getavailability();

	/**
	 * Returns the meta object for the reference '{@link IoTComponents.availability#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see IoTComponents.availability#getBase_Class()
	 * @see #getavailability()
	 * @generated
	 */
	EReference getavailability_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link IoTComponents.availability#getBase_Interface <em>Base Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Interface</em>'.
	 * @see IoTComponents.availability#getBase_Interface()
	 * @see #getavailability()
	 * @generated
	 */
	EReference getavailability_Base_Interface();

	/**
	 * Returns the meta object for class '{@link IoTComponents.transparency <em>transparency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>transparency</em>'.
	 * @see IoTComponents.transparency
	 * @generated
	 */
	EClass gettransparency();

	/**
	 * Returns the meta object for the reference '{@link IoTComponents.transparency#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see IoTComponents.transparency#getBase_Class()
	 * @see #gettransparency()
	 * @generated
	 */
	EReference gettransparency_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link IoTComponents.transparency#getBase_Interface <em>Base Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Interface</em>'.
	 * @see IoTComponents.transparency#getBase_Interface()
	 * @see #gettransparency()
	 * @generated
	 */
	EReference gettransparency_Base_Interface();

	/**
	 * Returns the meta object for class '{@link IoTComponents.securitypatches <em>securitypatches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>securitypatches</em>'.
	 * @see IoTComponents.securitypatches
	 * @generated
	 */
	EClass getsecuritypatches();

	/**
	 * Returns the meta object for class '{@link IoTComponents.automaticpatchmanagement <em>automaticpatchmanagement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>automaticpatchmanagement</em>'.
	 * @see IoTComponents.automaticpatchmanagement
	 * @generated
	 */
	EClass getautomaticpatchmanagement();

	/**
	 * Returns the meta object for class '{@link IoTComponents.encryptedconfiguration <em>encryptedconfiguration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>encryptedconfiguration</em>'.
	 * @see IoTComponents.encryptedconfiguration
	 * @generated
	 */
	EClass getencryptedconfiguration();

	/**
	 * Returns the meta object for class '{@link IoTComponents.encrypteddatastore <em>encrypteddatastore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>encrypteddatastore</em>'.
	 * @see IoTComponents.encrypteddatastore
	 * @generated
	 */
	EClass getencrypteddatastore();

	/**
	 * Returns the meta object for class '{@link IoTComponents.redundantinfrastructure <em>redundantinfrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>redundantinfrastructure</em>'.
	 * @see IoTComponents.redundantinfrastructure
	 * @generated
	 */
	EClass getredundantinfrastructure();

	/**
	 * Returns the meta object for class '{@link IoTComponents.desasterrecovery <em>desasterrecovery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>desasterrecovery</em>'.
	 * @see IoTComponents.desasterrecovery
	 * @generated
	 */
	EClass getdesasterrecovery();

	/**
	 * Returns the meta object for class '{@link IoTComponents.accesscontrol <em>accesscontrol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>accesscontrol</em>'.
	 * @see IoTComponents.accesscontrol
	 * @generated
	 */
	EClass getaccesscontrol();

	/**
	 * Returns the meta object for class '{@link IoTComponents.dataclassification <em>dataclassification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>dataclassification</em>'.
	 * @see IoTComponents.dataclassification
	 * @generated
	 */
	EClass getdataclassification();

	/**
	 * Returns the meta object for class '{@link IoTComponents.token <em>token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>token</em>'.
	 * @see IoTComponents.token
	 * @generated
	 */
	EClass gettoken();

	/**
	 * Returns the meta object for class '{@link IoTComponents.logging <em>logging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>logging</em>'.
	 * @see IoTComponents.logging
	 * @generated
	 */
	EClass getlogging();

	/**
	 * Returns the meta object for class '{@link IoTComponents.loadbalancer <em>loadbalancer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>loadbalancer</em>'.
	 * @see IoTComponents.loadbalancer
	 * @generated
	 */
	EClass getloadbalancer();

	/**
	 * Returns the meta object for class '{@link IoTComponents.messagebuffer <em>messagebuffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>messagebuffer</em>'.
	 * @see IoTComponents.messagebuffer
	 * @generated
	 */
	EClass getmessagebuffer();

	/**
	 * Returns the meta object for class '{@link IoTComponents.backups <em>backups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>backups</em>'.
	 * @see IoTComponents.backups
	 * @generated
	 */
	EClass getbackups();

	/**
	 * Returns the meta object for class '{@link IoTComponents.X509 <em>X509</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>X509</em>'.
	 * @see IoTComponents.X509
	 * @generated
	 */
	EClass getX509();

	/**
	 * Returns the meta object for class '{@link IoTComponents.RBAC <em>RBAC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RBAC</em>'.
	 * @see IoTComponents.RBAC
	 * @generated
	 */
	EClass getRBAC();

	/**
	 * Returns the meta object for class '{@link IoTComponents.ABAC <em>ABAC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ABAC</em>'.
	 * @see IoTComponents.ABAC
	 * @generated
	 */
	EClass getABAC();

	/**
	 * Returns the meta object for class '{@link IoTComponents.Httpbasicauthentication <em>Httpbasicauthentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Httpbasicauthentication</em>'.
	 * @see IoTComponents.Httpbasicauthentication
	 * @generated
	 */
	EClass getHttpbasicauthentication();

	/**
	 * Returns the meta object for class '{@link IoTComponents.usernamepasswordauthentication <em>usernamepasswordauthentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>usernamepasswordauthentication</em>'.
	 * @see IoTComponents.usernamepasswordauthentication
	 * @generated
	 */
	EClass getusernamepasswordauthentication();

	/**
	 * Returns the meta object for class '{@link IoTComponents.identityprovider <em>identityprovider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>identityprovider</em>'.
	 * @see IoTComponents.identityprovider
	 * @generated
	 */
	EClass getidentityprovider();

	/**
	 * Returns the meta object for class '{@link IoTComponents.OAuth <em>OAuth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OAuth</em>'.
	 * @see IoTComponents.OAuth
	 * @generated
	 */
	EClass getOAuth();

	/**
	 * Returns the meta object for class '{@link IoTComponents.OAuth2 <em>OAuth2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OAuth2</em>'.
	 * @see IoTComponents.OAuth2
	 * @generated
	 */
	EClass getOAuth2();

	/**
	 * Returns the meta object for class '{@link IoTComponents.JasonWebToken <em>Jason Web Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jason Web Token</em>'.
	 * @see IoTComponents.JasonWebToken
	 * @generated
	 */
	EClass getJasonWebToken();

	/**
	 * Returns the meta object for class '{@link IoTComponents.MAC <em>MAC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MAC</em>'.
	 * @see IoTComponents.MAC
	 * @generated
	 */
	EClass getMAC();

	/**
	 * Returns the meta object for class '{@link IoTComponents.HMAC <em>HMAC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMAC</em>'.
	 * @see IoTComponents.HMAC
	 * @generated
	 */
	EClass getHMAC();

	/**
	 * Returns the meta object for class '{@link IoTComponents.IPSec <em>IP Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IP Sec</em>'.
	 * @see IoTComponents.IPSec
	 * @generated
	 */
	EClass getIPSec();

	/**
	 * Returns the meta object for class '{@link IoTComponents.VPN <em>VPN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VPN</em>'.
	 * @see IoTComponents.VPN
	 * @generated
	 */
	EClass getVPN();

	/**
	 * Returns the meta object for class '{@link IoTComponents.MQTT <em>MQTT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MQTT</em>'.
	 * @see IoTComponents.MQTT
	 * @generated
	 */
	EClass getMQTT();

	/**
	 * Returns the meta object for class '{@link IoTComponents.Modbus <em>Modbus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modbus</em>'.
	 * @see IoTComponents.Modbus
	 * @generated
	 */
	EClass getModbus();

	/**
	 * Returns the meta object for class '{@link IoTComponents.AMPQ <em>AMPQ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AMPQ</em>'.
	 * @see IoTComponents.AMPQ
	 * @generated
	 */
	EClass getAMPQ();

	/**
	 * Returns the meta object for class '{@link IoTComponents.HTTPS <em>HTTPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTTPS</em>'.
	 * @see IoTComponents.HTTPS
	 * @generated
	 */
	EClass getHTTPS();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IoTComponentsFactory getIoTComponentsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link IoTComponents.impl.intervenabilityImpl <em>intervenability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.intervenabilityImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getintervenability()
		 * @generated
		 */
		EClass INTERVENABILITY = eINSTANCE.getintervenability();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVENABILITY__BASE_CLASS = eINSTANCE.getintervenability_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Base Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVENABILITY__BASE_INTERFACE = eINSTANCE.getintervenability_Base_Interface();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.TLSImpl <em>TLS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.TLSImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getTLS()
		 * @generated
		 */
		EClass TLS = eINSTANCE.getTLS();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.encryptionImpl <em>encryption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.encryptionImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getencryption()
		 * @generated
		 */
		EClass ENCRYPTION = eINSTANCE.getencryption();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.confidentialityImpl <em>confidentiality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.confidentialityImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getconfidentiality()
		 * @generated
		 */
		EClass CONFIDENTIALITY = eINSTANCE.getconfidentiality();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIDENTIALITY__BASE_CLASS = eINSTANCE.getconfidentiality_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIDENTIALITY__BASE_ASSOCIATION = eINSTANCE.getconfidentiality_Base_Association();

		/**
		 * The meta object literal for the '<em><b>Base Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIDENTIALITY__BASE_INTERFACE = eINSTANCE.getconfidentiality_Base_Interface();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.unlinkabilityImpl <em>unlinkability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.unlinkabilityImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getunlinkability()
		 * @generated
		 */
		EClass UNLINKABILITY = eINSTANCE.getunlinkability();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNLINKABILITY__BASE_CLASS = eINSTANCE.getunlinkability_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Base Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNLINKABILITY__BASE_INTERFACE = eINSTANCE.getunlinkability_Base_Interface();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.checksumsImpl <em>checksums</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.checksumsImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getchecksums()
		 * @generated
		 */
		EClass CHECKSUMS = eINSTANCE.getchecksums();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.integrityImpl <em>integrity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.integrityImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getintegrity()
		 * @generated
		 */
		EClass INTEGRITY = eINSTANCE.getintegrity();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRITY__BASE_CLASS = eINSTANCE.getintegrity_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRITY__BASE_ASSOCIATION = eINSTANCE.getintegrity_Base_Association();

		/**
		 * The meta object literal for the '<em><b>Base Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRITY__BASE_INTERFACE = eINSTANCE.getintegrity_Base_Interface();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.certificateImpl <em>certificate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.certificateImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getcertificate()
		 * @generated
		 */
		EClass CERTIFICATE = eINSTANCE.getcertificate();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.signingImpl <em>signing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.signingImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getsigning()
		 * @generated
		 */
		EClass SIGNING = eINSTANCE.getsigning();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.authenticationImpl <em>authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.authenticationImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getauthentication()
		 * @generated
		 */
		EClass AUTHENTICATION = eINSTANCE.getauthentication();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.availabilityImpl <em>availability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.availabilityImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getavailability()
		 * @generated
		 */
		EClass AVAILABILITY = eINSTANCE.getavailability();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVAILABILITY__BASE_CLASS = eINSTANCE.getavailability_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Base Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVAILABILITY__BASE_INTERFACE = eINSTANCE.getavailability_Base_Interface();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.transparencyImpl <em>transparency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.transparencyImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#gettransparency()
		 * @generated
		 */
		EClass TRANSPARENCY = eINSTANCE.gettransparency();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPARENCY__BASE_CLASS = eINSTANCE.gettransparency_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Base Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPARENCY__BASE_INTERFACE = eINSTANCE.gettransparency_Base_Interface();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.securitypatchesImpl <em>securitypatches</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.securitypatchesImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getsecuritypatches()
		 * @generated
		 */
		EClass SECURITYPATCHES = eINSTANCE.getsecuritypatches();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.automaticpatchmanagementImpl <em>automaticpatchmanagement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.automaticpatchmanagementImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getautomaticpatchmanagement()
		 * @generated
		 */
		EClass AUTOMATICPATCHMANAGEMENT = eINSTANCE.getautomaticpatchmanagement();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.encryptedconfigurationImpl <em>encryptedconfiguration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.encryptedconfigurationImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getencryptedconfiguration()
		 * @generated
		 */
		EClass ENCRYPTEDCONFIGURATION = eINSTANCE.getencryptedconfiguration();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.encrypteddatastoreImpl <em>encrypteddatastore</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.encrypteddatastoreImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getencrypteddatastore()
		 * @generated
		 */
		EClass ENCRYPTEDDATASTORE = eINSTANCE.getencrypteddatastore();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.redundantinfrastructureImpl <em>redundantinfrastructure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.redundantinfrastructureImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getredundantinfrastructure()
		 * @generated
		 */
		EClass REDUNDANTINFRASTRUCTURE = eINSTANCE.getredundantinfrastructure();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.desasterrecoveryImpl <em>desasterrecovery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.desasterrecoveryImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getdesasterrecovery()
		 * @generated
		 */
		EClass DESASTERRECOVERY = eINSTANCE.getdesasterrecovery();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.accesscontrolImpl <em>accesscontrol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.accesscontrolImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getaccesscontrol()
		 * @generated
		 */
		EClass ACCESSCONTROL = eINSTANCE.getaccesscontrol();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.dataclassificationImpl <em>dataclassification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.dataclassificationImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getdataclassification()
		 * @generated
		 */
		EClass DATACLASSIFICATION = eINSTANCE.getdataclassification();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.tokenImpl <em>token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.tokenImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#gettoken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.gettoken();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.loggingImpl <em>logging</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.loggingImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getlogging()
		 * @generated
		 */
		EClass LOGGING = eINSTANCE.getlogging();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.loadbalancerImpl <em>loadbalancer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.loadbalancerImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getloadbalancer()
		 * @generated
		 */
		EClass LOADBALANCER = eINSTANCE.getloadbalancer();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.messagebufferImpl <em>messagebuffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.messagebufferImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getmessagebuffer()
		 * @generated
		 */
		EClass MESSAGEBUFFER = eINSTANCE.getmessagebuffer();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.backupsImpl <em>backups</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.backupsImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getbackups()
		 * @generated
		 */
		EClass BACKUPS = eINSTANCE.getbackups();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.X509Impl <em>X509</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.X509Impl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getX509()
		 * @generated
		 */
		EClass X509 = eINSTANCE.getX509();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.RBACImpl <em>RBAC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.RBACImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getRBAC()
		 * @generated
		 */
		EClass RBAC = eINSTANCE.getRBAC();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.ABACImpl <em>ABAC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.ABACImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getABAC()
		 * @generated
		 */
		EClass ABAC = eINSTANCE.getABAC();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.HttpbasicauthenticationImpl <em>Httpbasicauthentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.HttpbasicauthenticationImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getHttpbasicauthentication()
		 * @generated
		 */
		EClass HTTPBASICAUTHENTICATION = eINSTANCE.getHttpbasicauthentication();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.usernamepasswordauthenticationImpl <em>usernamepasswordauthentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.usernamepasswordauthenticationImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getusernamepasswordauthentication()
		 * @generated
		 */
		EClass USERNAMEPASSWORDAUTHENTICATION = eINSTANCE.getusernamepasswordauthentication();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.identityproviderImpl <em>identityprovider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.identityproviderImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getidentityprovider()
		 * @generated
		 */
		EClass IDENTITYPROVIDER = eINSTANCE.getidentityprovider();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.OAuthImpl <em>OAuth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.OAuthImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getOAuth()
		 * @generated
		 */
		EClass OAUTH = eINSTANCE.getOAuth();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.OAuth2Impl <em>OAuth2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.OAuth2Impl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getOAuth2()
		 * @generated
		 */
		EClass OAUTH2 = eINSTANCE.getOAuth2();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.JasonWebTokenImpl <em>Jason Web Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.JasonWebTokenImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getJasonWebToken()
		 * @generated
		 */
		EClass JASON_WEB_TOKEN = eINSTANCE.getJasonWebToken();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.MACImpl <em>MAC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.MACImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getMAC()
		 * @generated
		 */
		EClass MAC = eINSTANCE.getMAC();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.HMACImpl <em>HMAC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.HMACImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getHMAC()
		 * @generated
		 */
		EClass HMAC = eINSTANCE.getHMAC();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.IPSecImpl <em>IP Sec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.IPSecImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getIPSec()
		 * @generated
		 */
		EClass IP_SEC = eINSTANCE.getIPSec();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.VPNImpl <em>VPN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.VPNImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getVPN()
		 * @generated
		 */
		EClass VPN = eINSTANCE.getVPN();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.MQTTImpl <em>MQTT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.MQTTImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getMQTT()
		 * @generated
		 */
		EClass MQTT = eINSTANCE.getMQTT();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.ModbusImpl <em>Modbus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.ModbusImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getModbus()
		 * @generated
		 */
		EClass MODBUS = eINSTANCE.getModbus();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.AMPQImpl <em>AMPQ</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.AMPQImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getAMPQ()
		 * @generated
		 */
		EClass AMPQ = eINSTANCE.getAMPQ();

		/**
		 * The meta object literal for the '{@link IoTComponents.impl.HTTPSImpl <em>HTTPS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IoTComponents.impl.HTTPSImpl
		 * @see IoTComponents.impl.IoTComponentsPackageImpl#getHTTPS()
		 * @generated
		 */
		EClass HTTPS = eINSTANCE.getHTTPS();

	}

} //IoTComponentsPackage
