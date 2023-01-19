package com.school.management.exception;

import org.springframework.http.HttpStatus;

public class UserNotFoundException extends CustomException{

	public UserNotFoundException() {
		super(ErrorCode.USER_NOT_FOUND, HttpStatus.BAD_REQUEST);
	}

}
