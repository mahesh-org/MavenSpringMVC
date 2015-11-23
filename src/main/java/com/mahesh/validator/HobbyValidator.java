package com.mahesh.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String> {

	private String listOfValidHobbies;
	
	public void initialize(IsValidHobby isValidHobby) {
		this.listOfValidHobbies = isValidHobby.listOfValidHobbies();		
	}

	public boolean isValid(String hobby, ConstraintValidatorContext arg1) {
		if(hobby == null) {
			return false;
		}
		
		if(hobby.matches(this.listOfValidHobbies)) {
			return true;
		} else {
			return false; 
		}
	}
}
