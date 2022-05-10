/**
 */
package IoTComponents.impl;

import IoTComponents.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IoTComponentsFactoryImpl extends EFactoryImpl implements IoTComponentsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IoTComponentsFactory init() {
		try {
			IoTComponentsFactory theIoTComponentsFactory = (IoTComponentsFactory)EPackage.Registry.INSTANCE.getEFactory(IoTComponentsPackage.eNS_URI);
			if (theIoTComponentsFactory != null) {
				return theIoTComponentsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IoTComponentsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTComponentsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IoTComponentsPackage.INTERVENABILITY: return createintervenability();
			case IoTComponentsPackage.TLS: return createTLS();
			case IoTComponentsPackage.ENCRYPTION: return createencryption();
			case IoTComponentsPackage.CONFIDENTIALITY: return createconfidentiality();
			case IoTComponentsPackage.UNLINKABILITY: return createunlinkability();
			case IoTComponentsPackage.CHECKSUMS: return createchecksums();
			case IoTComponentsPackage.INTEGRITY: return createintegrity();
			case IoTComponentsPackage.CERTIFICATE: return createcertificate();
			case IoTComponentsPackage.SIGNING: return createsigning();
			case IoTComponentsPackage.AUTHENTICATION: return createauthentication();
			case IoTComponentsPackage.AVAILABILITY: return createavailability();
			case IoTComponentsPackage.TRANSPARENCY: return createtransparency();
			case IoTComponentsPackage.SECURITYPATCHES: return createsecuritypatches();
			case IoTComponentsPackage.AUTOMATICPATCHMANAGEMENT: return createautomaticpatchmanagement();
			case IoTComponentsPackage.ENCRYPTEDCONFIGURATION: return createencryptedconfiguration();
			case IoTComponentsPackage.ENCRYPTEDDATASTORE: return createencrypteddatastore();
			case IoTComponentsPackage.REDUNDANTINFRASTRUCTURE: return createredundantinfrastructure();
			case IoTComponentsPackage.DESASTERRECOVERY: return createdesasterrecovery();
			case IoTComponentsPackage.ACCESSCONTROL: return createaccesscontrol();
			case IoTComponentsPackage.DATACLASSIFICATION: return createdataclassification();
			case IoTComponentsPackage.TOKEN: return createtoken();
			case IoTComponentsPackage.LOGGING: return createlogging();
			case IoTComponentsPackage.LOADBALANCER: return createloadbalancer();
			case IoTComponentsPackage.MESSAGEBUFFER: return createmessagebuffer();
			case IoTComponentsPackage.BACKUPS: return createbackups();
			case IoTComponentsPackage.X509: return createX509();
			case IoTComponentsPackage.RBAC: return createRBAC();
			case IoTComponentsPackage.ABAC: return createABAC();
			case IoTComponentsPackage.HTTPBASICAUTHENTICATION: return createHttpbasicauthentication();
			case IoTComponentsPackage.USERNAMEPASSWORDAUTHENTICATION: return createusernamepasswordauthentication();
			case IoTComponentsPackage.IDENTITYPROVIDER: return createidentityprovider();
			case IoTComponentsPackage.OAUTH: return createOAuth();
			case IoTComponentsPackage.OAUTH2: return createOAuth2();
			case IoTComponentsPackage.JASON_WEB_TOKEN: return createJasonWebToken();
			case IoTComponentsPackage.MAC: return createMAC();
			case IoTComponentsPackage.HMAC: return createHMAC();
			case IoTComponentsPackage.IP_SEC: return createIPSec();
			case IoTComponentsPackage.VPN: return createVPN();
			case IoTComponentsPackage.MQTT: return createMQTT();
			case IoTComponentsPackage.MODBUS: return createModbus();
			case IoTComponentsPackage.AMPQ: return createAMPQ();
			case IoTComponentsPackage.HTTPS: return createHTTPS();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public intervenability createintervenability() {
		intervenabilityImpl intervenability = new intervenabilityImpl();
		return intervenability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLS createTLS() {
		TLSImpl tls = new TLSImpl();
		return tls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public encryption createencryption() {
		encryptionImpl encryption = new encryptionImpl();
		return encryption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public confidentiality createconfidentiality() {
		confidentialityImpl confidentiality = new confidentialityImpl();
		return confidentiality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public unlinkability createunlinkability() {
		unlinkabilityImpl unlinkability = new unlinkabilityImpl();
		return unlinkability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public checksums createchecksums() {
		checksumsImpl checksums = new checksumsImpl();
		return checksums;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public integrity createintegrity() {
		integrityImpl integrity = new integrityImpl();
		return integrity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public certificate createcertificate() {
		certificateImpl certificate = new certificateImpl();
		return certificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public signing createsigning() {
		signingImpl signing = new signingImpl();
		return signing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public authentication createauthentication() {
		authenticationImpl authentication = new authenticationImpl();
		return authentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public availability createavailability() {
		availabilityImpl availability = new availabilityImpl();
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public transparency createtransparency() {
		transparencyImpl transparency = new transparencyImpl();
		return transparency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public securitypatches createsecuritypatches() {
		securitypatchesImpl securitypatches = new securitypatchesImpl();
		return securitypatches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public automaticpatchmanagement createautomaticpatchmanagement() {
		automaticpatchmanagementImpl automaticpatchmanagement = new automaticpatchmanagementImpl();
		return automaticpatchmanagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public encryptedconfiguration createencryptedconfiguration() {
		encryptedconfigurationImpl encryptedconfiguration = new encryptedconfigurationImpl();
		return encryptedconfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public encrypteddatastore createencrypteddatastore() {
		encrypteddatastoreImpl encrypteddatastore = new encrypteddatastoreImpl();
		return encrypteddatastore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public redundantinfrastructure createredundantinfrastructure() {
		redundantinfrastructureImpl redundantinfrastructure = new redundantinfrastructureImpl();
		return redundantinfrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public desasterrecovery createdesasterrecovery() {
		desasterrecoveryImpl desasterrecovery = new desasterrecoveryImpl();
		return desasterrecovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public accesscontrol createaccesscontrol() {
		accesscontrolImpl accesscontrol = new accesscontrolImpl();
		return accesscontrol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dataclassification createdataclassification() {
		dataclassificationImpl dataclassification = new dataclassificationImpl();
		return dataclassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public token createtoken() {
		tokenImpl token = new tokenImpl();
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public logging createlogging() {
		loggingImpl logging = new loggingImpl();
		return logging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public loadbalancer createloadbalancer() {
		loadbalancerImpl loadbalancer = new loadbalancerImpl();
		return loadbalancer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public messagebuffer createmessagebuffer() {
		messagebufferImpl messagebuffer = new messagebufferImpl();
		return messagebuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public backups createbackups() {
		backupsImpl backups = new backupsImpl();
		return backups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X509 createX509() {
		X509Impl x509 = new X509Impl();
		return x509;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RBAC createRBAC() {
		RBACImpl rbac = new RBACImpl();
		return rbac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABAC createABAC() {
		ABACImpl abac = new ABACImpl();
		return abac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Httpbasicauthentication createHttpbasicauthentication() {
		HttpbasicauthenticationImpl httpbasicauthentication = new HttpbasicauthenticationImpl();
		return httpbasicauthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public usernamepasswordauthentication createusernamepasswordauthentication() {
		usernamepasswordauthenticationImpl usernamepasswordauthentication = new usernamepasswordauthenticationImpl();
		return usernamepasswordauthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public identityprovider createidentityprovider() {
		identityproviderImpl identityprovider = new identityproviderImpl();
		return identityprovider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OAuth createOAuth() {
		OAuthImpl oAuth = new OAuthImpl();
		return oAuth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OAuth2 createOAuth2() {
		OAuth2Impl oAuth2 = new OAuth2Impl();
		return oAuth2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JasonWebToken createJasonWebToken() {
		JasonWebTokenImpl jasonWebToken = new JasonWebTokenImpl();
		return jasonWebToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAC createMAC() {
		MACImpl mac = new MACImpl();
		return mac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMAC createHMAC() {
		HMACImpl hmac = new HMACImpl();
		return hmac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPSec createIPSec() {
		IPSecImpl ipSec = new IPSecImpl();
		return ipSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VPN createVPN() {
		VPNImpl vpn = new VPNImpl();
		return vpn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MQTT createMQTT() {
		MQTTImpl mqtt = new MQTTImpl();
		return mqtt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modbus createModbus() {
		ModbusImpl modbus = new ModbusImpl();
		return modbus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AMPQ createAMPQ() {
		AMPQImpl ampq = new AMPQImpl();
		return ampq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPS createHTTPS() {
		HTTPSImpl https = new HTTPSImpl();
		return https;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTComponentsPackage getIoTComponentsPackage() {
		return (IoTComponentsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IoTComponentsPackage getPackage() {
		return IoTComponentsPackage.eINSTANCE;
	}

} //IoTComponentsFactoryImpl
