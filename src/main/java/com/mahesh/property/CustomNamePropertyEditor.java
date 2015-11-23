package com.mahesh.property;

import java.beans.PropertyEditorSupport;

public class CustomNamePropertyEditor extends PropertyEditorSupport {
	
	/**
	 * When you submit the admission form 
	 * Spring MVC will run setAsText function of this class
	 * Before performing data binding task of studentName property of the student object
	 */
	
	@Override
	public void setAsText(String name) throws IllegalArgumentException {
		
		if(name.contains("Mr.") || name.contains("Ms.")) {
			setValue(name);
		} else {
			name = "Mr." + name;
			setValue(name);
		}
	}
	
}
