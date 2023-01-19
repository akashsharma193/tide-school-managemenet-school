package com.school.management.exception;

import org.springframework.http.HttpStatus;

public class CustomException  extends RuntimeException{


	private final ErrorCode errorCode;

	private final HttpStatus httpStatus;

	public ErrorCode getErrorCode() {
		return this.errorCode;
	}

	public HttpStatus getHttpStatus() {
		return this.httpStatus;
	}

	protected CustomException(ErrorCode errorCode, HttpStatus httpStatus) {

		super(String.valueOf(errorCode));

		this.errorCode = errorCode;
		this.httpStatus = httpStatus;
	}


}
