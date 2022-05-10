/**
 */
package IoTComponents.util;

import IoTComponents.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see IoTComponents.IoTComponentsPackage
 * @generated
 */
public class IoTComponentsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IoTComponentsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTComponentsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IoTComponentsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IoTComponentsSwitch<Adapter> modelSwitch =
		new IoTComponentsSwitch<Adapter>() {
			@Override
			public Adapter caseintervenability(intervenability object) {
				return createintervenabilityAdapter();
			}
			@Override
			public Adapter caseTLS(TLS object) {
				return createTLSAdapter();
			}
			@Override
			public Adapter caseencryption(encryption object) {
				return createencryptionAdapter();
			}
			@Override
			public Adapter caseconfidentiality(confidentiality object) {
				return createconfidentialityAdapter();
			}
			@Override
			public Adapter caseunlinkability(unlinkability object) {
				return createunlinkabilityAdapter();
			}
			@Override
			public Adapter casechecksums(checksums object) {
				return createchecksumsAdapter();
			}
			@Override
			public Adapter caseintegrity(integrity object) {
				return createintegrityAdapter();
			}
			@Override
			public Adapter casecertificate(certificate object) {
				return createcertificateAdapter();
			}
			@Override
			public Adapter casesigning(signing object) {
				return createsigningAdapter();
			}
			@Override
			public Adapter caseauthentication(authentication object) {
				return createauthenticationAdapter();
			}
			@Override
			public Adapter caseavailability(availability object) {
				return createavailabilityAdapter();
			}
			@Override
			public Adapter casetransparency(transparency object) {
				return createtransparencyAdapter();
			}
			@Override
			public Adapter casesecuritypatches(securitypatches object) {
				return createsecuritypatchesAdapter();
			}
			@Override
			public Adapter caseautomaticpatchmanagement(automaticpatchmanagement object) {
				return createautomaticpatchmanagementAdapter();
			}
			@Override
			public Adapter caseencryptedconfiguration(encryptedconfiguration object) {
				return createencryptedconfigurationAdapter();
			}
			@Override
			public Adapter caseencrypteddatastore(encrypteddatastore object) {
				return createencrypteddatastoreAdapter();
			}
			@Override
			public Adapter caseredundantinfrastructure(redundantinfrastructure object) {
				return createredundantinfrastructureAdapter();
			}
			@Override
			public Adapter casedesasterrecovery(desasterrecovery object) {
				return createdesasterrecoveryAdapter();
			}
			@Override
			public Adapter caseaccesscontrol(accesscontrol object) {
				return createaccesscontrolAdapter();
			}
			@Override
			public Adapter casedataclassification(dataclassification object) {
				return createdataclassificationAdapter();
			}
			@Override
			public Adapter casetoken(token object) {
				return createtokenAdapter();
			}
			@Override
			public Adapter caselogging(logging object) {
				return createloggingAdapter();
			}
			@Override
			public Adapter caseloadbalancer(loadbalancer object) {
				return createloadbalancerAdapter();
			}
			@Override
			public Adapter casemessagebuffer(messagebuffer object) {
				return createmessagebufferAdapter();
			}
			@Override
			public Adapter casebackups(backups object) {
				return createbackupsAdapter();
			}
			@Override
			public Adapter caseX509(X509 object) {
				return createX509Adapter();
			}
			@Override
			public Adapter caseRBAC(RBAC object) {
				return createRBACAdapter();
			}
			@Override
			public Adapter caseABAC(ABAC object) {
				return createABACAdapter();
			}
			@Override
			public Adapter caseHttpbasicauthentication(Httpbasicauthentication object) {
				return createHttpbasicauthenticationAdapter();
			}
			@Override
			public Adapter caseusernamepasswordauthentication(usernamepasswordauthentication object) {
				return createusernamepasswordauthenticationAdapter();
			}
			@Override
			public Adapter caseidentityprovider(identityprovider object) {
				return createidentityproviderAdapter();
			}
			@Override
			public Adapter caseOAuth(OAuth object) {
				return createOAuthAdapter();
			}
			@Override
			public Adapter caseOAuth2(OAuth2 object) {
				return createOAuth2Adapter();
			}
			@Override
			public Adapter caseJasonWebToken(JasonWebToken object) {
				return createJasonWebTokenAdapter();
			}
			@Override
			public Adapter caseMAC(MAC object) {
				return createMACAdapter();
			}
			@Override
			public Adapter caseHMAC(HMAC object) {
				return createHMACAdapter();
			}
			@Override
			public Adapter caseIPSec(IPSec object) {
				return createIPSecAdapter();
			}
			@Override
			public Adapter caseVPN(VPN object) {
				return createVPNAdapter();
			}
			@Override
			public Adapter caseMQTT(MQTT object) {
				return createMQTTAdapter();
			}
			@Override
			public Adapter caseModbus(Modbus object) {
				return createModbusAdapter();
			}
			@Override
			public Adapter caseAMPQ(AMPQ object) {
				return createAMPQAdapter();
			}
			@Override
			public Adapter caseHTTPS(HTTPS object) {
				return createHTTPSAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.intervenability <em>intervenability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.intervenability
	 * @generated
	 */
	public Adapter createintervenabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.TLS <em>TLS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.TLS
	 * @generated
	 */
	public Adapter createTLSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.encryption <em>encryption</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.encryption
	 * @generated
	 */
	public Adapter createencryptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.confidentiality <em>confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.confidentiality
	 * @generated
	 */
	public Adapter createconfidentialityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.unlinkability <em>unlinkability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.unlinkability
	 * @generated
	 */
	public Adapter createunlinkabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.checksums <em>checksums</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.checksums
	 * @generated
	 */
	public Adapter createchecksumsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.integrity <em>integrity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.integrity
	 * @generated
	 */
	public Adapter createintegrityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.certificate <em>certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.certificate
	 * @generated
	 */
	public Adapter createcertificateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.signing <em>signing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.signing
	 * @generated
	 */
	public Adapter createsigningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.authentication <em>authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.authentication
	 * @generated
	 */
	public Adapter createauthenticationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.availability <em>availability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.availability
	 * @generated
	 */
	public Adapter createavailabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.transparency <em>transparency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.transparency
	 * @generated
	 */
	public Adapter createtransparencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.securitypatches <em>securitypatches</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.securitypatches
	 * @generated
	 */
	public Adapter createsecuritypatchesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.automaticpatchmanagement <em>automaticpatchmanagement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.automaticpatchmanagement
	 * @generated
	 */
	public Adapter createautomaticpatchmanagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.encryptedconfiguration <em>encryptedconfiguration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.encryptedconfiguration
	 * @generated
	 */
	public Adapter createencryptedconfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.encrypteddatastore <em>encrypteddatastore</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.encrypteddatastore
	 * @generated
	 */
	public Adapter createencrypteddatastoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.redundantinfrastructure <em>redundantinfrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.redundantinfrastructure
	 * @generated
	 */
	public Adapter createredundantinfrastructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.desasterrecovery <em>desasterrecovery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.desasterrecovery
	 * @generated
	 */
	public Adapter createdesasterrecoveryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.accesscontrol <em>accesscontrol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.accesscontrol
	 * @generated
	 */
	public Adapter createaccesscontrolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.dataclassification <em>dataclassification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.dataclassification
	 * @generated
	 */
	public Adapter createdataclassificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.token <em>token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.token
	 * @generated
	 */
	public Adapter createtokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.logging <em>logging</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.logging
	 * @generated
	 */
	public Adapter createloggingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.loadbalancer <em>loadbalancer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.loadbalancer
	 * @generated
	 */
	public Adapter createloadbalancerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.messagebuffer <em>messagebuffer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.messagebuffer
	 * @generated
	 */
	public Adapter createmessagebufferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.backups <em>backups</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.backups
	 * @generated
	 */
	public Adapter createbackupsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.X509 <em>X509</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.X509
	 * @generated
	 */
	public Adapter createX509Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.RBAC <em>RBAC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.RBAC
	 * @generated
	 */
	public Adapter createRBACAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.ABAC <em>ABAC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.ABAC
	 * @generated
	 */
	public Adapter createABACAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.Httpbasicauthentication <em>Httpbasicauthentication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.Httpbasicauthentication
	 * @generated
	 */
	public Adapter createHttpbasicauthenticationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.usernamepasswordauthentication <em>usernamepasswordauthentication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.usernamepasswordauthentication
	 * @generated
	 */
	public Adapter createusernamepasswordauthenticationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.identityprovider <em>identityprovider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.identityprovider
	 * @generated
	 */
	public Adapter createidentityproviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.OAuth <em>OAuth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.OAuth
	 * @generated
	 */
	public Adapter createOAuthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.OAuth2 <em>OAuth2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.OAuth2
	 * @generated
	 */
	public Adapter createOAuth2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.JasonWebToken <em>Jason Web Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.JasonWebToken
	 * @generated
	 */
	public Adapter createJasonWebTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.MAC <em>MAC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.MAC
	 * @generated
	 */
	public Adapter createMACAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.HMAC <em>HMAC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.HMAC
	 * @generated
	 */
	public Adapter createHMACAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.IPSec <em>IP Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.IPSec
	 * @generated
	 */
	public Adapter createIPSecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.VPN <em>VPN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.VPN
	 * @generated
	 */
	public Adapter createVPNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.MQTT <em>MQTT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.MQTT
	 * @generated
	 */
	public Adapter createMQTTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.Modbus <em>Modbus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.Modbus
	 * @generated
	 */
	public Adapter createModbusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.AMPQ <em>AMPQ</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.AMPQ
	 * @generated
	 */
	public Adapter createAMPQAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IoTComponents.HTTPS <em>HTTPS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IoTComponents.HTTPS
	 * @generated
	 */
	public Adapter createHTTPSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IoTComponentsAdapterFactory
