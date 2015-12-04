package com.mahesh.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Invalid Student name")
public class StudentInvalidNameException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public StudentInvalidNameException(String name) {
		super("Name not allowed: "+ name);
	}

}
