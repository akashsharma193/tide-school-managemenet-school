package com.school.management.exception;

public enum ErrorCode {


	/**
	 * {@code UNKNOWN}.
	 */
	UNKNOWN,

	/**
	 * {@code NO_DEVICE_FOUND}.
	 */
	NO_DEVICE_FOUND,

	/**
	 * {@code PASSWORD_EXPIRED}.
	 */
	PASSWORD_EXPIRED,

	/**
	 * {@code MAX_LIMIT_EXCEEDED}.
	 */
	MAX_LIMIT_EXCEEDED,

	/**
	 * {@code QR_GENERATION_ERROR}.
	 */
	QR_GENERATION_ERROR,

	/**
	 * {@code NON_REMOVABLE_REFERENCED_ENTITY}.
	 */
	NON_REMOVABLE_REFERENCED_ENTITY,

	/**
	 * {@code ALREADY_EXISTS}.
	 */
	ALREADY_EXISTS,

	/**
	 * {@code ALREADY_REQUESTED}.
	 */
	ALREADY_REQUESTED,

	/**
	 * {@code INVALID_TOKEN}.
	 */
	INVALID_TOKEN,

	/**
	 * {@code EXPIRED_TOKEN}.
	 */
	EXPIRED_TOKEN,

	/**
	 * {@code INVALID_CONFIG}.
	 */
	INVALID_CONFIG,

	/**
	 * {@code CONNECTION_FAILED}.
	 */
	CONNECTION_FAILED,

	/**
	 * {@code ACCESS_DENIED}.
	 */
	ACCESS_DENIED,

	/**
	 * {@code INVALID_USER_ACCOUNT_STATE}.
	 */
	INVALID_USER_ACCOUNT_STATE,

	/**
	 * {@code INVALID_ARGUMENTS}.
	 */
	INVALID_ARGUMENTS,

	/**
	 * {@code CRYPTOGRAPHIC_ERROR}.
	 */
	CRYPTOGRAPHIC_ERROR,

	/**
	 * {@code PASSWORD_POLICY_NOT_FOUND}.
	 */
	PASSWORD_POLICY_NOT_FOUND,

	/**
	 * {@code NO_PASSWORD_POLICY_CONFIG}.
	 */
	NO_PASSWORD_POLICY_CONFIG,

	/**
	 * {@code PASSWORD_POLICY_NAME_ALRAEDY_EXISTS}.
	 */
	PASSWORD_POLICY_NAME_ALRAEDY_EXISTS,

	/**
	 * {@code CANT_SET_FALSE_DEFAULT_PASSWORD_POLICY}.
	 */
	CANT_SET_FALSE_DEFAULT_PASSWORD_POLICY,

	/**
	 * {@code CANT_SET_AS_DEFAULT_PASSWORD_POLICY}.
	 */
	CANT_SET_AS_DEFAULT_PASSWORD_POLICY,

	/**
	 * {@code CANT_DELETE_DEFAULT_PASSWORD_POLICY}.
	 */
	CANT_DELETE_DEFAULT_PASSWORD_POLICY,

	/**
	 * {@code USER_NOT_FOUND}.
	 */
	USER_NOT_FOUND,

	/**
	 * {@code EMAIL_NOT_FOUND}.
	 */
	EMAIL_NOT_FOUND,

	/**
	 * {@code MOBILE_NOT_FOUND}.
	 */
	MOBILE_NOT_FOUND,

	/**
	 * {@code EMAIL_SEND_FAILED}.
	 */
	EMAIL_SEND_FAILED,

	/**
	 * {@code USER_LOCKED}.
	 */
	USER_LOCKED,

	/**
	 * {@code MULTIPLE_IDENTITY_FOUND}.
	 */
	MULTIPLE_IDENTITY_FOUND,

	/**
	 * {@code INVALID_AUTH_CONFIG}.
	 */
	INVALID_AUTH_CONFIG,

	/**
	 * {@code CBS_INCORRECT_DATA }.
	 */
	CBS_INCORRECT_DATA,

	/**
	 * {@code INVALID_AUTH_CONFIG}.
	 */
	INVALID_ADAPTER_CONFIG,

	/**
	 * {@code AUTH_POLICY_NOT_FOUND}.
	 */
	AUTH_POLICY_NOT_FOUND,

	/**
	 * {@code AUTHENTICATION_NOT_FOUND}.
	 */
	AUTHENTICATION_NOT_FOUND,

	/**
	 * {@code INVALID_FLOW}.
	 */
	INVALID_FLOW,

	/**
	 * {@code PASSWORD_COMPOSITION_RULE_VIOLATION}.
	 */
	PASSWORD_COMPOSITION_RULE_VIOLATION,

	/**
	 * {@code INVALID_AUTH_POLICY_CONFIG}.
	 */
	INVALID_AUTH_POLICY_CONFIG,

	/**
	 * {@code FORBIDDEN}.
	 */
	FORBIDDEN,

	/**
	 * {@code UNAUTHORIZED}.
	 */
	UNAUTHORIZED,

	/**
	 * {@code CLIENT_NOT_FOUND}.
	 */
	CLIENT_NOT_FOUND,

	/**
	 * {@code CLIENT_EXISTS}.
	 */
	CLIENT_EXISTS,

	/**
	 * {@code ALREADY_ACTIVATED}.
	 */
	ALREADY_ACTIVATED,

	/**
	 * {@code ALREADY_DEACTIVATED}.
	 */
	ALREADY_DEACTIVATED,
	/**
	 * {@code DEFAULT_POLICY_UPDATE_NOT_ALLOWED}.
	 */
	DEFAULT_POLICY_UPDATE_NOT_ALLOWED,
	/**
	 * {@code DELEGATE_NOT_FOUND}.
	 */
	DELEGATE_NOT_FOUND,

	/**
	 * {@code USER_NOT_ALLOWED_FOR_DELEGATION}.
	 */
	USER_NOT_ALLOWED_FOR_DELEGATION,

	/**
	 * {@code INVALID_DATE}.
	 */
	INVALID_DATE,

	/**
	 * {@code DELEGATE_USER_NOT_FOUND}.
	 */
	DELEGATE_USER_NOT_FOUND,

	/**
	 * {@code DELEGATION_DEACTIVATE}.
	 */
	DELEGATION_DEACTIVATE,

	/**
	 * {@code CONSENT_DEACTIVATE}.
	 */
	CONSENT_DEACTIVATE,

	/**
	 * {@code DELEGATE_CONSENT_NOT_FOUND}.
	 */
	DELEGATE_CONSENT_NOT_FOUND,
	/**
	 * {@code NO_OPTION_AVAILABLE}.
	 */
	NO_OPTION_AVAILABLE,
	/**
	 * {@code PASSWORD_POLICY_CONDITION_ALRAEDY_EXISTS}.
	 */
	PASSWORD_POLICY_CONDITION_ALRAEDY_EXISTS,
	/**
	 * {@code TENANT_EXPIRED}.
	 */
	TENANT_EXPIRED,
	/**
	 * {@code INVALID_TENANT}.
	 */
	INVALID_TENANT,
	/**
	 * {@code MULTIPLE_CLIENT_FOUND}.
	 */
	MULTIPLE_INTERNAL_CLIENT_FOUND,

	/**
	 * {@code RESTRICTED_PASSWORD_NOT_FOUND}.
	 */
	RESTRICTED_PASSWORD_NOT_FOUND,

	/**
	 * {@code HASH_UTIL_ERROR}.
	 */
	HASH_UTIL_ERROR,

	/**
	 * {@code CBS_API_FAILED}.
	 */
	CBS_API_FAILED,

	/**
	 * {@code USERTYPE_NOT_FOUND}.
	 */
	USERTYPE_NOT_FOUND,

	/**
	 * {@code PASSWORD_RESTRICTED}.
	 */
	PASSWORD_RESTRICTED,

	/**
	 * {@code EMAIL_AND_MOBILE_OTP_NOT_VERIFIED}.
	 */
	EMAIL_AND_MOBILE_OTP_NOT_VERIFIED,

	/**
	 * {@code MOBILE_OTP_NOT_VERIFIED}.
	 */
	MOBILE_OTP_NOT_VERIFIED,

	/**
	 * {@code MOBILE_OTP_NOT_VERIFIED}.
	 */
	EMAIL_OTP_NOT_VERIFIED,

	/**
	 * {@code OTP_EXPIRED}.
	 */
	OTP_EXPIRED,

	/**
	 * {@code MAXIMUM_LIMIT_REACHED}.
	 */
	MAXIMUM_LIMIT_REACHED,

	/**
	 * {@code CODE_VERIFIER_FAILED}.
	 */
	CODE_VERIFIER_FAILED,

	/**
	 * {@code VERIFICATION_PENDING}.
	 */
	VERIFICATION_PENDING,
	/**
	 * {@code SIM_BINDING_FAILED}.
	 */
	SIM_BINDING_FAILED,

	/**
	 * {@code ALREADY_VERIFIED}.
	 */
	ALREADY_VERIFIED,

	/**
	 * {@code VERIFY_ATTEMPTS_EXCEEDS}.
	 */
	VERIFY_ATTEMPTS_EXCEEDS,

	/**
	 * {@code INVALID_PRIMARY_CUSTID}.
	 */
	INVALID_PRIMARY_CUSTID;

	/**
	 * servicePrefix is prefix for all the error-codes from current module, it will help
	 * to identify service-module from API error-code.
	 */
	private String servicePrefix = "School";

	public String code() {

		StringBuilder errorCode = new StringBuilder();
		// @formatter:off
		errorCode
		.append(this.servicePrefix)
		.append('.')
		.append(this);
		// @formatter:on
		return errorCode.toString();
	}


}
