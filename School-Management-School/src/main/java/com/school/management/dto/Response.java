package com.school.management.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.school.management.exception.CustomException;
import com.school.management.exception.ErrorCode;

import io.swagger.annotations.ApiModelProperty;

public class Response {

	@ApiModelProperty(notes = "Status of the API call", value = "Boolean", example = "true/false", hidden = false)
	private Boolean success;

	@ApiModelProperty(notes = "Anything i.e. List of objects or single objects that will be returned as successful call of any API", value = "", example = "", hidden = false)
	private Object data;

	@ApiModelProperty(notes = "timestamp of the call of any API", value = "ISOFormat timestamp", example = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", hidden = false)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MMM-yyyy hh:mm:ss")
	private Date timestamp;

	// @JsonInclude(Include.NON_EMPTY)
	@ApiModelProperty(notes = "API response message", value = "string", example = "String", hidden = false)
	private String message;

	// @JsonInclude(Include.NON_EMPTY)
	@ApiModelProperty(notes = "API response errorCode", value = "string", example = "String", hidden = false)
	private String errorCode;

	@ApiModelProperty(notes = "API response errorCode", value = "string", example = "String", hidden = false)
	private Object errorMeta;

	public Response() {
		this.timestamp = new Date();
	}

	public Response(Throwable exception) {
		this();
		this.fail();

		String errorCodeString = ErrorCode.UNKNOWN.code();

		if (exception instanceof CustomException) {

			CustomException ex = (CustomException) exception;
			ErrorCode errorCode = ex.getErrorCode();

			errorCodeString = errorCode.code();
		}

		this.setErrorCode(errorCodeString);
	}

	public Response(Throwable exception, String message) {
		this(exception);
		this.setMessage(message);
	}

	public Boolean getSuccess() {
		return this.success;
	}

	private void setSuccess(Boolean success) {
		this.success = success;
	}

	public Object getData() {
		return this.data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void fail() {
		this.setSuccess(Boolean.FALSE);
	}

	public void succeed() {
		this.setSuccess(Boolean.TRUE);
	}

	public void setErrorMeta(Object errorMeta) {
		this.errorMeta = errorMeta;
	}

	public Object getErrorMeta() {
		return this.errorMeta;
	}

}
