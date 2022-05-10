/**
 */
package IoTComponents.util;

import IoTComponents.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see IoTComponents.IoTComponentsPackage
 * @generated
 */
public class IoTComponentsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IoTComponentsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTComponentsSwitch() {
		if (modelPackage == null) {
			modelPackage = IoTComponentsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IoTComponentsPackage.INTERVENABILITY: {
				intervenability intervenability = (intervenability)theEObject;
				T result = caseintervenability(intervenability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.TLS: {
				TLS tls = (TLS)theEObject;
				T result = caseTLS(tls);
				if (result == null) result = caseencryption(tls);
				if (result == null) result = caseconfidentiality(tls);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.ENCRYPTION: {
				encryption encryption = (encryption)theEObject;
				T result = caseencryption(encryption);
				if (result == null) result = caseconfidentiality(encryption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.CONFIDENTIALITY: {
				confidentiality confidentiality = (confidentiality)theEObject;
				T result = caseconfidentiality(confidentiality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.UNLINKABILITY: {
				unlinkability unlinkability = (unlinkability)theEObject;
				T result = caseunlinkability(unlinkability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.CHECKSUMS: {
				checksums checksums = (checksums)theEObject;
				T result = casechecksums(checksums);
				if (result == null) result = caseintegrity(checksums);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.INTEGRITY: {
				integrity integrity = (integrity)theEObject;
				T result = caseintegrity(integrity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.CERTIFICATE: {
				certificate certificate = (certificate)theEObject;
				T result = casecertificate(certificate);
				if (result == null) result = caseauthentication(certificate);
				if (result == null) result = casesigning(certificate);
				if (result == null) result = caseintegrity(certificate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.SIGNING: {
				signing signing = (signing)theEObject;
				T result = casesigning(signing);
				if (result == null) result = caseintegrity(signing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.AUTHENTICATION: {
				authentication authentication = (authentication)theEObject;
				T result = caseauthentication(authentication);
				if (result == null) result = caseintegrity(authentication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.AVAILABILITY: {
				availability availability = (availability)theEObject;
				T result = caseavailability(availability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.TRANSPARENCY: {
				transparency transparency = (transparency)theEObject;
				T result = casetransparency(transparency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.SECURITYPATCHES: {
				securitypatches securitypatches = (securitypatches)theEObject;
				T result = casesecuritypatches(securitypatches);
				if (result == null) result = caseintegrity(securitypatches);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.AUTOMATICPATCHMANAGEMENT: {
				automaticpatchmanagement automaticpatchmanagement = (automaticpatchmanagement)theEObject;
				T result = caseautomaticpatchmanagement(automaticpatchmanagement);
				if (result == null) result = casesecuritypatches(automaticpatchmanagement);
				if (result == null) result = caseintegrity(automaticpatchmanagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.ENCRYPTEDCONFIGURATION: {
				encryptedconfiguration encryptedconfiguration = (encryptedconfiguration)theEObject;
				T result = caseencryptedconfiguration(encryptedconfiguration);
				if (result == null) result = caseencryption(encryptedconfiguration);
				if (result == null) result = caseconfidentiality(encryptedconfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.ENCRYPTEDDATASTORE: {
				encrypteddatastore encrypteddatastore = (encrypteddatastore)theEObject;
				T result = caseencrypteddatastore(encrypteddatastore);
				if (result == null) result = caseencryption(encrypteddatastore);
				if (result == null) result = caseconfidentiality(encrypteddatastore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.REDUNDANTINFRASTRUCTURE: {
				redundantinfrastructure redundantinfrastructure = (redundantinfrastructure)theEObject;
				T result = caseredundantinfrastructure(redundantinfrastructure);
				if (result == null) result = caseavailability(redundantinfrastructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.DESASTERRECOVERY: {
				desasterrecovery desasterrecovery = (desasterrecovery)theEObject;
				T result = casedesasterrecovery(desasterrecovery);
				if (result == null) result = caseavailability(desasterrecovery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.ACCESSCONTROL: {
				accesscontrol accesscontrol = (accesscontrol)theEObject;
				T result = caseaccesscontrol(accesscontrol);
				if (result == null) result = caseunlinkability(accesscontrol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.DATACLASSIFICATION: {
				dataclassification dataclassification = (dataclassification)theEObject;
				T result = casedataclassification(dataclassification);
				if (result == null) result = casetransparency(dataclassification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.TOKEN: {
				token token = (token)theEObject;
				T result = casetoken(token);
				if (result == null) result = caseauthentication(token);
				if (result == null) result = caseintegrity(token);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.LOGGING: {
				logging logging = (logging)theEObject;
				T result = caselogging(logging);
				if (result == null) result = casetransparency(logging);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.LOADBALANCER: {
				loadbalancer loadbalancer = (loadbalancer)theEObject;
				T result = caseloadbalancer(loadbalancer);
				if (result == null) result = caseredundantinfrastructure(loadbalancer);
				if (result == null) result = caseavailability(loadbalancer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.MESSAGEBUFFER: {
				messagebuffer messagebuffer = (messagebuffer)theEObject;
				T result = casemessagebuffer(messagebuffer);
				if (result == null) result = caseredundantinfrastructure(messagebuffer);
				if (result == null) result = caseavailability(messagebuffer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.BACKUPS: {
				backups backups = (backups)theEObject;
				T result = casebackups(backups);
				if (result == null) result = casedesasterrecovery(backups);
				if (result == null) result = caseavailability(backups);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.X509: {
				X509 x509 = (X509)theEObject;
				T result = caseX509(x509);
				if (result == null) result = casecertificate(x509);
				if (result == null) result = caseauthentication(x509);
				if (result == null) result = casesigning(x509);
				if (result == null) result = caseintegrity(x509);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.RBAC: {
				RBAC rbac = (RBAC)theEObject;
				T result = caseRBAC(rbac);
				if (result == null) result = caseaccesscontrol(rbac);
				if (result == null) result = caseunlinkability(rbac);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.ABAC: {
				ABAC abac = (ABAC)theEObject;
				T result = caseABAC(abac);
				if (result == null) result = caseaccesscontrol(abac);
				if (result == null) result = caseunlinkability(abac);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.HTTPBASICAUTHENTICATION: {
				Httpbasicauthentication httpbasicauthentication = (Httpbasicauthentication)theEObject;
				T result = caseHttpbasicauthentication(httpbasicauthentication);
				if (result == null) result = caseauthentication(httpbasicauthentication);
				if (result == null) result = caseintegrity(httpbasicauthentication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.USERNAMEPASSWORDAUTHENTICATION: {
				usernamepasswordauthentication usernamepasswordauthentication = (usernamepasswordauthentication)theEObject;
				T result = caseusernamepasswordauthentication(usernamepasswordauthentication);
				if (result == null) result = caseauthentication(usernamepasswordauthentication);
				if (result == null) result = caseintegrity(usernamepasswordauthentication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.IDENTITYPROVIDER: {
				identityprovider identityprovider = (identityprovider)theEObject;
				T result = caseidentityprovider(identityprovider);
				if (result == null) result = caseauthentication(identityprovider);
				if (result == null) result = caseintegrity(identityprovider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.OAUTH: {
				OAuth oAuth = (OAuth)theEObject;
				T result = caseOAuth(oAuth);
				if (result == null) result = casetoken(oAuth);
				if (result == null) result = caseauthentication(oAuth);
				if (result == null) result = caseintegrity(oAuth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.OAUTH2: {
				OAuth2 oAuth2 = (OAuth2)theEObject;
				T result = caseOAuth2(oAuth2);
				if (result == null) result = casetoken(oAuth2);
				if (result == null) result = caseauthentication(oAuth2);
				if (result == null) result = caseintegrity(oAuth2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.JASON_WEB_TOKEN: {
				JasonWebToken jasonWebToken = (JasonWebToken)theEObject;
				T result = caseJasonWebToken(jasonWebToken);
				if (result == null) result = casetoken(jasonWebToken);
				if (result == null) result = caseauthentication(jasonWebToken);
				if (result == null) result = caseintegrity(jasonWebToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.MAC: {
				MAC mac = (MAC)theEObject;
				T result = caseMAC(mac);
				if (result == null) result = casechecksums(mac);
				if (result == null) result = caseintegrity(mac);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.HMAC: {
				HMAC hmac = (HMAC)theEObject;
				T result = caseHMAC(hmac);
				if (result == null) result = casechecksums(hmac);
				if (result == null) result = caseintegrity(hmac);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.IP_SEC: {
				IPSec ipSec = (IPSec)theEObject;
				T result = caseIPSec(ipSec);
				if (result == null) result = caseencryption(ipSec);
				if (result == null) result = caseconfidentiality(ipSec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.VPN: {
				VPN vpn = (VPN)theEObject;
				T result = caseVPN(vpn);
				if (result == null) result = caseIPSec(vpn);
				if (result == null) result = caseencryption(vpn);
				if (result == null) result = caseconfidentiality(vpn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.MQTT: {
				MQTT mqtt = (MQTT)theEObject;
				T result = caseMQTT(mqtt);
				if (result == null) result = caseTLS(mqtt);
				if (result == null) result = caseencryption(mqtt);
				if (result == null) result = caseconfidentiality(mqtt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.MODBUS: {
				Modbus modbus = (Modbus)theEObject;
				T result = caseModbus(modbus);
				if (result == null) result = caseTLS(modbus);
				if (result == null) result = caseencryption(modbus);
				if (result == null) result = caseconfidentiality(modbus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.AMPQ: {
				AMPQ ampq = (AMPQ)theEObject;
				T result = caseAMPQ(ampq);
				if (result == null) result = caseTLS(ampq);
				if (result == null) result = caseencryption(ampq);
				if (result == null) result = caseconfidentiality(ampq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IoTComponentsPackage.HTTPS: {
				HTTPS https = (HTTPS)theEObject;
				T result = caseHTTPS(https);
				if (result == null) result = caseTLS(https);
				if (result == null) result = caseencryption(https);
				if (result == null) result = caseconfidentiality(https);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>intervenability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>intervenability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseintervenability(intervenability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TLS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TLS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLS(TLS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>encryption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>encryption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseencryption(encryption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>confidentiality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>confidentiality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseconfidentiality(confidentiality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>unlinkability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>unlinkability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseunlinkability(unlinkability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>checksums</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>checksums</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casechecksums(checksums object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>integrity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>integrity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseintegrity(integrity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>certificate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>certificate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecertificate(certificate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>signing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>signing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesigning(signing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>authentication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>authentication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseauthentication(authentication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>availability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>availability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseavailability(availability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>transparency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>transparency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetransparency(transparency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>securitypatches</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>securitypatches</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesecuritypatches(securitypatches object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>automaticpatchmanagement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>automaticpatchmanagement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseautomaticpatchmanagement(automaticpatchmanagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>encryptedconfiguration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>encryptedconfiguration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseencryptedconfiguration(encryptedconfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>encrypteddatastore</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>encrypteddatastore</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseencrypteddatastore(encrypteddatastore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>redundantinfrastructure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>redundantinfrastructure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseredundantinfrastructure(redundantinfrastructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>desasterrecovery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>desasterrecovery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedesasterrecovery(desasterrecovery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>accesscontrol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>accesscontrol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseaccesscontrol(accesscontrol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>dataclassification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>dataclassification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedataclassification(dataclassification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetoken(token object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>logging</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>logging</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caselogging(logging object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>loadbalancer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>loadbalancer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseloadbalancer(loadbalancer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>messagebuffer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>messagebuffer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemessagebuffer(messagebuffer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>backups</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>backups</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casebackups(backups object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>X509</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>X509</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseX509(X509 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RBAC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RBAC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRBAC(RBAC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ABAC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ABAC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseABAC(ABAC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Httpbasicauthentication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Httpbasicauthentication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHttpbasicauthentication(Httpbasicauthentication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>usernamepasswordauthentication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>usernamepasswordauthentication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseusernamepasswordauthentication(usernamepasswordauthentication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>identityprovider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>identityprovider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseidentityprovider(identityprovider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OAuth</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OAuth</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOAuth(OAuth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OAuth2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OAuth2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOAuth2(OAuth2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jason Web Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jason Web Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJasonWebToken(JasonWebToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MAC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MAC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMAC(MAC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HMAC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HMAC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHMAC(HMAC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IP Sec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IP Sec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPSec(IPSec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VPN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VPN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVPN(VPN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MQTT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MQTT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMQTT(MQTT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modbus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modbus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModbus(Modbus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AMPQ</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AMPQ</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAMPQ(AMPQ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTTPS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTTPS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTTPS(HTTPS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //IoTComponentsSwitch
