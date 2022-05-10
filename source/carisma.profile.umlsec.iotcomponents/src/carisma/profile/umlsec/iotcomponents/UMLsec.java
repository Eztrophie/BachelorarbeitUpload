/*******************************************************************************
 * Copyright (c) 2011 Software Engineering Institute, TU Dortmund.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    {SecSE group} - initial API and implementation and/or initial documentation
 *******************************************************************************/
package carisma.profile.umlsec.iotcomponents;

import org.eclipse.uml2.uml.Stereotype;

import carisma.modeltype.uml2.CarismaProfileDescriptor;


public enum UMLsec {
	
	SECURE_DEPENDENCY ("secure dependency"),
	DATA_SECURITY ("data security"),
	SECURE_LINKS ("secure links"),
	NO_UP_FLOW ("no up-flow"),
	NO_DOWN_FLOW ("no down-flow"),
	GUARDED_ACCESS ("guarded access"),
	RBAC ("rbac"),
	CRITICAL ("critical"),
	SEND ("send"),
	SECRECY ("secrecy"),
	INTEGRITY ("integrity"),
	HIGH ("high"),
	ENCRYPTED ("encrypted"),
	WIRE ("wire"),
	INTERNET ("Internet"),
	LAN ("LAN"),
	POS_DEVICE ("POS device"),
	ISSUER_NODE ("issuer node"),
	SMART_CARD ("smart card"),
	PROVABLE ("provable"),
	FAIR_EXCHANGE ("fair exchange"),
	SEPERATION_OF_DUTY ("seperation of duty"),
	ALLOWED_USERS ("allowed users"),
	SAP_TRANSACTION ("SAP Transaction"),
	USED_BY ("used-by"),
	PROTECTED ("protected"),
	AUTHORIZED_STATUS ("authorized-status"),
	LOCKED_STATUS ("locked-status"),
	IDENTIFIABLE ("identifiable"),
	GUARDED ("guarded"),
	CALL ("call"),
	REQUIRES ("requires"),
	
	// IoT Component Stereotypes
	// Goals
	CONFIDENTIALITY_IOTCOMP ("confidentiality"),
	INTEGRITY_IOTCOMP ("integrity"),
	AVAILABILITY_IOTCOMP ("availability"),
	TRANSPARENCY_IOTCOMP ("transparency"),
	UNLINKABILITY_IOTCOMP ("unlinkability"),
	INTERVENABILITY_IOTCOMP ("intervenability"),
	
	//Technologies
	ENCRYPTION_IOTCOMP ("encryption"),
	CHECKSUMS_IOTCOMP ("checksums"),
	SECURITYPATCHES_IOTCOMP ("securitypatches"),
	SIGNING_IOTCOMP ("signing"),
	REDUNDANT_INFRASTRUCTURE_IOTCOMP ("redundant infrastructure"),
	DATA_CLASSIFICATION_IOTCOMP ("data classification"),
	ACCESS_CONTROL_IOTCOMP ("access control"),
	AUTHENTICATION_IOTCOMP ("authentication"),
	LOGGING_IOTCOMP ("logging"),
	ENCRYPTED_DATASTORE_IOTCOMP ("encrypted datastore"),
	ENCRYPTED_CONFIGURATION_IOTCOMP ("encrypted configuration"),
	AUTOMATIC_PATCHMANAGEMENT_IOTCOMP ("automatic patchmanagement"),
	CERTIFICATE_IOTCOMP ("certificate"),
	TOKEN_IOTCOMP ("token"),
	
	//Realizations
	IPSEC_IOTCOMP ("IPSec"),
	MAC_IOTCOMP ("MAC"),
	HMAC_IOTCOMP ("HMAC"),
	LOADBALANCER_IOTCOMP ("load balancer"),
	MESSAGEBUFFER_IOTCOMP ("messagebuffer"),
	BACKUP_IOTCOMP ("backups"),
	X509_IOTCOMP ("X.509"),
	RBAC_IOTCOMP ("RBAC"),
	ABAC_IOTCOMP ("ABAC"),
	HTTP_BASIC_AUTHENTICATION_IOTCOMP ("Http basic authentication"),
	IDENTITY_PROVIDER_IOTCOMP ("identity provider"),
	USERNAME_PASSWORD_AUTHENTICATION_IOTCOMP ("username password authentication"),
	OAUTH_IOTCOMP ("OAuth"),
	OAUTH2_IOTCOMP ("OAuth2"),
	JASON_WEB_TOKEN_IOTCOMP ("Jason Web Token"),
	VPN_IOTCOMP ("VPN"),
	TLS_IOTCOMP ("TLS"),
	MQTT_IOTCOMP ("MQTT"),
	MODBUS_IOTCOMP ("Modbus"),
	AMPQ_IOTCOMP ("AMPQ"),
	HTTPS_IOTCOMP ("HTTPs");
	
	
	
	public static final String TAG_CRITICAL_HIGH = "high";
	public static final String TAG_CRITICAL_SECRECY = "secrecy";
	public static final String TAG_CRITICAL_INTEGRITY = "integrity";
	
	private static final String PROFILE_NAME = "IoTComponents";
	private static final String PROFILE_VERSION = "1";
	private static final String PROFILE_URI = "platform:/plugin/carisma.profile.umlsec.iotcomponents/profile/IoTComponents.profile.uml";
	
	public static final CarismaProfileDescriptor DESCRIPTOR = new CarismaProfileDescriptor(PROFILE_NAME, PROFILE_VERSION, PROFILE_URI);

	
	private final String readableName;
	
	private UMLsec(final String newName) {
		readableName = newName;
	}
	
	@Override
	public String toString() {
		return readableName;
	}
	
	public static UMLsec getValue(final String name) {
		for (UMLsec type : UMLsec.values()) {
			if (type.toString().equalsIgnoreCase(name)) {
				return type;
			}
		}
		return null;
	}

	/**
	 * Checks whether the given stereotype corresponds to the one represented by this enum literal.
	 * @param stereotype
	 * @return
	 */
	public boolean isEqual(Stereotype stereotype) {
		return contains(stereotype) && stereotype.getName().equalsIgnoreCase(this.readableName);
	}
	
	/**
	 * Checks whether the given Stereotype is a UMLsec stereotype.
	 * @param stereotype
	 * @return
	 */
	public static boolean contains(Stereotype stereotype) {
		return (stereotype.getProfile().getDefinition().getNsURI().contains(DESCRIPTOR.getProfileName()));
	}
	
}