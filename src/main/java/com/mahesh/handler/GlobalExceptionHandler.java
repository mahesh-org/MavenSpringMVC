package com.mahesh.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

	/**
	 * check the configuration done in the web.xml
	 */
	@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Exception occured.")
	@ExceptionHandler(Exception.class)
	public void handleException() {
		System.out.println("handleException()...");		
	}
}
