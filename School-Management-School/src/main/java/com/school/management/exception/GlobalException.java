package com.school.management.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.school.management.dto.Response;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class GlobalException extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> exception(Exception ex) {
		log.error("Exception: ", ex);
		return buildResponseEntity(new Response(ex), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Object> userNotFoundException(Exception ex) {
		log.error("Exception: ", ex);
		return buildResponseEntity(new Response(ex), HttpStatus.BAD_REQUEST);
	}
	
	private ResponseEntity<Object> buildResponseEntity(Response response, HttpStatus status) {
		return new ResponseEntity<>(response, status);
	}
}
