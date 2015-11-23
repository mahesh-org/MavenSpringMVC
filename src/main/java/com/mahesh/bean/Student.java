package com.mahesh.bean;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.mahesh.validator.IsValidHobby;
import com.mahesh.bean.Address;

public class Student {
	
	@Pattern(regexp="[^0-9]*")
	//@NotEmpty
	private String studentName;
	
	//@Size(min=2, max=10, message="Please enter a value between {min} and {max} for the field Student Hobby! - From Student Class")
	//@Size(min=2, max=10) @IsValidHobby(listOfValidHobbies="Music|Football|Cricket|Hockey|Tennis")
	@Size(min=2, max=10) @IsValidHobby
	private String studentHobby;
	
	//From example 8
	@Max(2222)
	private Long studentMobile;
	
	@Past  //It wont allow the future date. TODO: This wont when the customer binder is added (initBinder() - binder.registerCustomEditor())
	private Date studentDOB;
	
	private List<String> studentSkills;
	
	//from Example 9
	private Address studentAddress;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	public Long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public List<String> getStudentSkills() {
		return studentSkills;
	}
	public void setStudentSkills(List<String> studentSkills) {
		this.studentSkills = studentSkills;
	}
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	
}
