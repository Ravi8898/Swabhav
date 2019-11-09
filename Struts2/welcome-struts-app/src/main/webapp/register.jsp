<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Form</title>
</head>
<body>
<h1>Registration Form</h1>
	<s:form method="POST" action="register.do">
	<s:textfield name="userName" label="Name"></s:textfield>
	<s:textfield name="email" label="E-mail"></s:textfield>
	<s:textfield name="contactNo" label="Contact No"></s:textfield>
	<s:submit value="Register"></s:submit>
	</s:form>
	
	<s:property value="model.userName"/><br>
	<s:property value="model.email"/><br>
	<s:property value="model.contactNo"/><br>
</body>
</html>