<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admission Form</title>
</head>
<body>
	<h1>Student Admission form for Engineering Student:</h1>
	
	<form:errors path="student.*"/>
	
	<form action="/MavenSpringMVC/submitAdmissionForm.html" method="post">
		<table>
		<tr>
			<td>Student Name:</td><td><input type="text" name="studentName" /></td>
		</tr>
		<tr>
			<td>Student Hobby:</td><td><input type="text" name="studentHobby" /></td>
		</tr>
		<tr>
			<td>Student Mobile:</td><td><input type="text" name="studentMobile" /></td>
		</tr>
		<tr>
			<td>Student DOB:</td><td><input type="text" name="studentDOB" /></td>
		</tr>
		<tr>
			<td>Student Skills Set:</td><td><select name="studentSkills" multiple>
												<option value="Java Core">Java Core</option>
												<option value="Spring Core">Spring Core</option>
												<option value="Spring MVC">Spring MVC</option>												
											</select>
			</td>
		</tr>
		</table>
		<table>
			<tr><td colspan="2">Student Address</td></tr>
			<tr><td>Country</td><td><input type="text" name="studentAddress.country" /></td></tr>
			<tr><td>State</td><td><input type="text" name="studentAddress.state" /></td></tr>
			<tr><td>Street</td><td><input type="text" name="studentAddress.street" /></td></tr>
			<tr><td>Pincode</td><td><input type="text" name="studentAddress.pincode" /></td></tr>
		</table>
		<input type="submit" value="SUBMIT" />
	</form> 
</body>
</html>