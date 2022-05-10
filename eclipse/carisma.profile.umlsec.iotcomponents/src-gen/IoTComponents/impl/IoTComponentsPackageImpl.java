/**
 */
package IoTComponents.impl;

import IoTComponents.Httpbasicauthentication;
import IoTComponents.IPSec;
import IoTComponents.IoTComponentsFactory;
import IoTComponents.IoTComponentsPackage;
import IoTComponents.JasonWebToken;
import IoTComponents.Modbus;
import IoTComponents.OAuth;
import IoTComponents.OAuth2;
import IoTComponents.accesscontrol;
import IoTComponents.authentication;
import IoTComponents.automaticpatchmanagement;
import IoTComponents.availability;
import IoTComponents.backups;
import IoTComponents.certificate;
import IoTComponents.checksums;
import IoTComponents.confidentiality;
import IoTComponents.dataclassification;
import IoTComponents.desasterrecovery;
import IoTComponents.encryptedconfiguration;
import IoTComponents.encrypteddatastore;
import IoTComponents.encryption;
import IoTComponents.identityprovider;
import IoTComponents.integrity;
import IoTComponents.intervenability;
import IoTComponents.loadbalancer;
import IoTComponents.logging;
import IoTComponents.messagebuffer;
import IoTComponents.redundantinfrastructure;
import IoTComponents.securitypatches;
import IoTComponents.signing;
import IoTComponents.token;
import IoTComponents.transparency;
import IoTComponents.unlinkability;
import IoTComponents.usernamepasswordauthentication;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IoTComponentsPackageImpl extends EPackageImpl implements IoTComponentsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervenabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encryptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass confidentialityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unlinkabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checksumsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integrityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass certificateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass availabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transparencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securitypatchesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass automaticpatchmanagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encryptedconfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encrypteddatastoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redundantinfrastructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass desasterrecoveryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accesscontrolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataclassificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loggingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadbalancerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messagebufferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backupsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass x509EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rbacEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abacEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpbasicauthenticationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usernamepasswordauthenticationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identityproviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oAuthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oAuth2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jasonWebTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass macEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hmacEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ipSecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vpnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mqttEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modbusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ampqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpsEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see IoTComponents.IoTComponentsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IoTComponentsPackageImpl() {
		super(eNS_URI, IoTComponentsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link IoTComponentsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IoTComponentsPackage init() {
		if (isInited) return (IoTComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(IoTComponentsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIoTComponentsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IoTComponentsPackageImpl theIoTComponentsPackage = registeredIoTComponentsPackage instanceof IoTComponentsPackageImpl ? (IoTComponentsPackageImpl)registeredIoTComponentsPackage : new IoTComponentsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIoTComponentsPackage.createPackageContents();

		// Initialize created meta-data
		theIoTComponentsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIoTComponentsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IoTComponentsPackage.eNS_URI, theIoTComponentsPackage);
		return theIoTComponentsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getintervenability() {
		return intervenabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getintervenability_Base_Class() {
		return (EReference)intervenabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getintervenability_Base_Interface() {
		return (EReference)intervenabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTLS() {
		return tlsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getencryption() {
		return encryptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getconfidentiality() {
		return confidentialityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getconfidentiality_Base_Class() {
		return (EReference)confidentialityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getconfidentiality_Base_Association() {
		return (EReference)confidentialityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getconfidentiality_Base_Interface() {
		return (EReference)confidentialityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getunlinkability() {
		return unlinkabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getunlinkability_Base_Class() {
		return (EReference)unlinkabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getunlinkability_Base_Interface() {
		return (EReference)unlinkabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getchecksums() {
		return checksumsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getintegrity() {
		return integrityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getintegrity_Base_Class() {
		return (EReference)integrityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getintegrity_Base_Association() {
		return (EReference)integrityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getintegrity_Base_Interface() {
		return (EReference)integrityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcertificate() {
		return certificateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsigning() {
		return signingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getauthentication() {
		return authenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getavailability() {
		return availabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getavailability_Base_Class() {
		return (EReference)availabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getavailability_Base_Interface() {
		return (EReference)availabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettransparency() {
		return transparencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettransparency_Base_Class() {
		return (EReference)transparencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettransparency_Base_Interface() {
		return (EReference)transparencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsecuritypatches() {
		return securitypatchesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getautomaticpatchmanagement() {
		return automaticpatchmanagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getencryptedconfiguration() {
		return encryptedconfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getencrypteddatastore() {
		return encrypteddatastoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getredundantinfrastructure() {
		return redundantinfrastructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdesasterrecovery() {
		return desasterrecoveryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getaccesscontrol() {
		return accesscontrolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdataclassification() {
		return dataclassificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettoken() {
		return tokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getlogging() {
		return loggingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getloadbalancer() {
		return loadbalancerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmessagebuffer() {
		return messagebufferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getbackups() {
		return backupsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getX509() {
		return x509EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRBAC() {
		return rbacEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getABAC() {
		return abacEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHttpbasicauthentication() {
		return httpbasicauthenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getusernamepasswordauthentication() {
		return usernamepasswordauthenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getidentityprovider() {
		return identityproviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOAuth() {
		return oAuthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOAuth2() {
		return oAuth2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJasonWebToken() {
		return jasonWebTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMAC() {
		return macEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMAC() {
		return hmacEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPSec() {
		return ipSecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVPN() {
		return vpnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMQTT() {
		return mqttEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModbus() {
		return modbusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAMPQ() {
		return ampqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHTTPS() {
		return httpsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTComponentsFactory getIoTComponentsFactory() {
		return (IoTComponentsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		intervenabilityEClass = createEClass(INTERVENABILITY);
		createEReference(intervenabilityEClass, INTERVENABILITY__BASE_CLASS);
		createEReference(intervenabilityEClass, INTERVENABILITY__BASE_INTERFACE);

		tlsEClass = createEClass(TLS);

		encryptionEClass = createEClass(ENCRYPTION);

		confidentialityEClass = createEClass(CONFIDENTIALITY);
		createEReference(confidentialityEClass, CONFIDENTIALITY__BASE_CLASS);
		createEReference(confidentialityEClass, CONFIDENTIALITY__BASE_ASSOCIATION);
		createEReference(confidentialityEClass, CONFIDENTIALITY__BASE_INTERFACE);

		unlinkabilityEClass = createEClass(UNLINKABILITY);
		createEReference(unlinkabilityEClass, UNLINKABILITY__BASE_CLASS);
		createEReference(unlinkabilityEClass, UNLINKABILITY__BASE_INTERFACE);

		checksumsEClass = createEClass(CHECKSUMS);

		integrityEClass = createEClass(INTEGRITY);
		createEReference(integrityEClass, INTEGRITY__BASE_CLASS);
		createEReference(integrityEClass, INTEGRITY__BASE_ASSOCIATION);
		createEReference(integrityEClass, INTEGRITY__BASE_INTERFACE);

		certificateEClass = createEClass(CERTIFICATE);

		signingEClass = createEClass(SIGNING);

		authenticationEClass = createEClass(AUTHENTICATION);

		availabilityEClass = createEClass(AVAILABILITY);
		createEReference(availabilityEClass, AVAILABILITY__BASE_CLASS);
		createEReference(availabilityEClass, AVAILABILITY__BASE_INTERFACE);

		transparencyEClass = createEClass(TRANSPARENCY);
		createEReference(transparencyEClass, TRANSPARENCY__BASE_CLASS);
		createEReference(transparencyEClass, TRANSPARENCY__BASE_INTERFACE);

		securitypatchesEClass = createEClass(SECURITYPATCHES);

		automaticpatchmanagementEClass = createEClass(AUTOMATICPATCHMANAGEMENT);

		encryptedconfigurationEClass = createEClass(ENCRYPTEDCONFIGURATION);

		encrypteddatastoreEClass = createEClass(ENCRYPTEDDATASTORE);

		redundantinfrastructureEClass = createEClass(REDUNDANTINFRASTRUCTURE);

		desasterrecoveryEClass = createEClass(DESASTERRECOVERY);

		accesscontrolEClass = createEClass(ACCESSCONTROL);

		dataclassificationEClass = createEClass(DATACLASSIFICATION);

		tokenEClass = createEClass(TOKEN);

		loggingEClass = createEClass(LOGGING);

		loadbalancerEClass = createEClass(LOADBALANCER);

		messagebufferEClass = createEClass(MESSAGEBUFFER);

		backupsEClass = createEClass(BACKUPS);

		x509EClass = createEClass(X509);

		rbacEClass = createEClass(RBAC);

		abacEClass = createEClass(ABAC);

		httpbasicauthenticationEClass = createEClass(HTTPBASICAUTHENTICATION);

		usernamepasswordauthenticationEClass = createEClass(USERNAMEPASSWORDAUTHENTICATION);

		identityproviderEClass = createEClass(IDENTITYPROVIDER);

		oAuthEClass = createEClass(OAUTH);

		oAuth2EClass = createEClass(OAUTH2);

		jasonWebTokenEClass = createEClass(JASON_WEB_TOKEN);

		macEClass = createEClass(MAC);

		hmacEClass = createEClass(HMAC);

		ipSecEClass = createEClass(IP_SEC);

		vpnEClass = createEClass(VPN);

		mqttEClass = createEClass(MQTT);

		modbusEClass = createEClass(MODBUS);

		ampqEClass = createEClass(AMPQ);

		httpsEClass = createEClass(HTTPS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tlsEClass.getESuperTypes().add(this.getencryption());
		encryptionEClass.getESuperTypes().add(this.getconfidentiality());
		checksumsEClass.getESuperTypes().add(this.getintegrity());
		certificateEClass.getESuperTypes().add(this.getauthentication());
		certificateEClass.getESuperTypes().add(this.getsigning());
		signingEClass.getESuperTypes().add(this.getintegrity());
		authenticationEClass.getESuperTypes().add(this.getintegrity());
		securitypatchesEClass.getESuperTypes().add(this.getintegrity());
		automaticpatchmanagementEClass.getESuperTypes().add(this.getsecuritypatches());
		encryptedconfigurationEClass.getESuperTypes().add(this.getencryption());
		encrypteddatastoreEClass.getESuperTypes().add(this.getencryption());
		redundantinfrastructureEClass.getESuperTypes().add(this.getavailability());
		desasterrecoveryEClass.getESuperTypes().add(this.getavailability());
		accesscontrolEClass.getESuperTypes().add(this.getunlinkability());
		dataclassificationEClass.getESuperTypes().add(this.gettransparency());
		tokenEClass.getESuperTypes().add(this.getauthentication());
		loggingEClass.getESuperTypes().add(this.gettransparency());
		loadbalancerEClass.getESuperTypes().add(this.getredundantinfrastructure());
		messagebufferEClass.getESuperTypes().add(this.getredundantinfrastructure());
		backupsEClass.getESuperTypes().add(this.getdesasterrecovery());
		x509EClass.getESuperTypes().add(this.getcertificate());
		rbacEClass.getESuperTypes().add(this.getaccesscontrol());
		abacEClass.getESuperTypes().add(this.getaccesscontrol());
		httpbasicauthenticationEClass.getESuperTypes().add(this.getauthentication());
		usernamepasswordauthenticationEClass.getESuperTypes().add(this.getauthentication());
		identityproviderEClass.getESuperTypes().add(this.getauthentication());
		oAuthEClass.getESuperTypes().add(this.gettoken());
		oAuth2EClass.getESuperTypes().add(this.gettoken());
		jasonWebTokenEClass.getESuperTypes().add(this.gettoken());
		macEClass.getESuperTypes().add(this.getchecksums());
		hmacEClass.getESuperTypes().add(this.getchecksums());
		ipSecEClass.getESuperTypes().add(this.getencryption());
		vpnEClass.getESuperTypes().add(this.getIPSec());
		mqttEClass.getESuperTypes().add(this.getTLS());
		modbusEClass.getESuperTypes().add(this.getTLS());
		ampqEClass.getESuperTypes().add(this.getTLS());
		httpsEClass.getESuperTypes().add(this.getTLS());

		// Initialize classes, features, and operations; add parameters
		initEClass(intervenabilityEClass, intervenability.class, "intervenability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getintervenability_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, intervenability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getintervenability_Base_Interface(), theUMLPackage.getInterface(), null, "base_Interface", null, 0, 1, intervenability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tlsEClass, IoTComponents.TLS.class, "TLS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(encryptionEClass, encryption.class, "encryption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(confidentialityEClass, confidentiality.class, "confidentiality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getconfidentiality_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, confidentiality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getconfidentiality_Base_Association(), theUMLPackage.getAssociation(), null, "base_Association", null, 0, 1, confidentiality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getconfidentiality_Base_Interface(), theUMLPackage.getInterface(), null, "base_Interface", null, 0, 1, confidentiality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(unlinkabilityEClass, unlinkability.class, "unlinkability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getunlinkability_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, unlinkability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getunlinkability_Base_Interface(), theUMLPackage.getInterface(), null, "base_Interface", null, 0, 1, unlinkability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(checksumsEClass, checksums.class, "checksums", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integrityEClass, integrity.class, "integrity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getintegrity_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, integrity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getintegrity_Base_Association(), theUMLPackage.getAssociation(), null, "base_Association", null, 0, 1, integrity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getintegrity_Base_Interface(), theUMLPackage.getInterface(), null, "base_Interface", null, 0, 1, integrity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(certificateEClass, certificate.class, "certificate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(signingEClass, signing.class, "signing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(authenticationEClass, authentication.class, "authentication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(availabilityEClass, availability.class, "availability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getavailability_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, availability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getavailability_Base_Interface(), theUMLPackage.getInterface(), null, "base_Interface", null, 0, 1, availability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(transparencyEClass, transparency.class, "transparency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(gettransparency_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, transparency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(gettransparency_Base_Interface(), theUMLPackage.getInterface(), null, "base_Interface", null, 0, 1, transparency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(securitypatchesEClass, securitypatches.class, "securitypatches", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(automaticpatchmanagementEClass, automaticpatchmanagement.class, "automaticpatchmanagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(encryptedconfigurationEClass, encryptedconfiguration.class, "encryptedconfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(encrypteddatastoreEClass, encrypteddatastore.class, "encrypteddatastore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(redundantinfrastructureEClass, redundantinfrastructure.class, "redundantinfrastructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(desasterrecoveryEClass, desasterrecovery.class, "desasterrecovery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accesscontrolEClass, accesscontrol.class, "accesscontrol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataclassificationEClass, dataclassification.class, "dataclassification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tokenEClass, token.class, "token", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(loggingEClass, logging.class, "logging", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(loadbalancerEClass, loadbalancer.class, "loadbalancer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messagebufferEClass, messagebuffer.class, "messagebuffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(backupsEClass, backups.class, "backups", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(x509EClass, IoTComponents.X509.class, "X509", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rbacEClass, IoTComponents.RBAC.class, "RBAC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abacEClass, IoTComponents.ABAC.class, "ABAC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(httpbasicauthenticationEClass, Httpbasicauthentication.class, "Httpbasicauthentication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(usernamepasswordauthenticationEClass, usernamepasswordauthentication.class, "usernamepasswordauthentication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(identityproviderEClass, identityprovider.class, "identityprovider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oAuthEClass, OAuth.class, "OAuth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oAuth2EClass, OAuth2.class, "OAuth2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jasonWebTokenEClass, JasonWebToken.class, "JasonWebToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(macEClass, IoTComponents.MAC.class, "MAC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hmacEClass, IoTComponents.HMAC.class, "HMAC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ipSecEClass, IPSec.class, "IPSec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vpnEClass, IoTComponents.VPN.class, "VPN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mqttEClass, IoTComponents.MQTT.class, "MQTT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modbusEClass, Modbus.class, "Modbus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ampqEClass, IoTComponents.AMPQ.class, "AMPQ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(httpsEClass, IoTComponents.HTTPS.class, "HTTPS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation
		  (automaticpatchmanagementEClass,
		   source,
		   new String[] {
			   "originalName", "automatic patchmanagement"
		   });
		addAnnotation
		  (encryptedconfigurationEClass,
		   source,
		   new String[] {
			   "originalName", "encrypted configuration"
		   });
		addAnnotation
		  (encrypteddatastoreEClass,
		   source,
		   new String[] {
			   "originalName", "encrypted datastore"
		   });
		addAnnotation
		  (redundantinfrastructureEClass,
		   source,
		   new String[] {
			   "originalName", "redundant infrastructure "
		   });
		addAnnotation
		  (desasterrecoveryEClass,
		   source,
		   new String[] {
			   "originalName", "desaster recovery"
		   });
		addAnnotation
		  (accesscontrolEClass,
		   source,
		   new String[] {
			   "originalName", "access control"
		   });
		addAnnotation
		  (dataclassificationEClass,
		   source,
		   new String[] {
			   "originalName", "data classification"
		   });
		addAnnotation
		  (loadbalancerEClass,
		   source,
		   new String[] {
			   "originalName", "load balancer "
		   });
		addAnnotation
		  (x509EClass,
		   source,
		   new String[] {
			   "originalName", "X.509"
		   });
		addAnnotation
		  (httpbasicauthenticationEClass,
		   source,
		   new String[] {
			   "originalName", "Http basic authentication"
		   });
		addAnnotation
		  (usernamepasswordauthenticationEClass,
		   source,
		   new String[] {
			   "originalName", "username password authentication"
		   });
		addAnnotation
		  (identityproviderEClass,
		   source,
		   new String[] {
			   "originalName", "identity provider"
		   });
		addAnnotation
		  (jasonWebTokenEClass,
		   source,
		   new String[] {
			   "originalName", "Jason Web Token"
		   });
	}

} //IoTComponentsPackageImpl
