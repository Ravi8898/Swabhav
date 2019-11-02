<%@page import="com.techlabs.model.Contact"%>
<%@ page import="java.util.*" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact App</title>

<h1 align="center">Students List</h1>
<%
	List<Contact> contacts = (List) request.getAttribute("contactList");

	for (Contact contact : contacts) {
		out.print("<br>First Name: " + contact.getFirstName() + " Last Name: " + contact.getLastName()
				+ " Contact No: " + contact.getContactNo() + " Email-Id: " + contact.getEmailId());
	}
%>
<br>
<br>
<a href="http://localhost:8080/contacts-mvc-app/addContact.jsp">ClickToAddStudents</a>


</head>
<body>

</body>
</html>