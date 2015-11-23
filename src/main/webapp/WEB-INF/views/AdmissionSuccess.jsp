<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admission Success</title>
</head>
<body>
	<h1>${message}</h1>
	
	<h3>Congratulations! Application form successfully submitted</h3>
	
	<h2>Student Details:</h2>
	
	<table>
		<tr>
			<td>Student Name</td>
			<td>${student.studentName}</td>
		</tr>
		<tr>
			<td>Student Hobby</td>
			<td>${student.studentHobby}</td>
		</tr>
		<tr>
			<td>Student Mobile</td>
			<td>${student.studentMobile}</td>
		</tr>
		<tr>
			<td>Student DOB</td>
			<td>${student.studentDOB}</td>
		</tr>
		<tr>
			<td>Student Skills</td>
			<td>${student.studentSkills}</td>
		</tr>
		<tr>
			<td>Student Address</td>
			<td>Country: ${student.studentAddress.country}</td>
			<td>State: ${student.studentAddress.state}</td>
			<td>Street: ${student.studentAddress.street}</td>
			<td>Pincode: ${student.studentAddress.pincode}</td>
		</tr>		
	</table>
</body>
</html>