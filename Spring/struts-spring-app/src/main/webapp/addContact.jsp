<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Contact</title>
</head>
<body>
	<h1>Hello...!!!</h1>
	<h3>This is addContact Page</h3>

	<s:form action="add.do">

		<s:textfield name="name" label="Name"></s:textfield>
		<s:textfield name="email" label="E-mail"></s:textfield>
		<s:textfield name="contactNo" label="Contact No"></s:textfield>
		<s:submit value="Add"></s:submit>

	</s:form>


</body>
</html>