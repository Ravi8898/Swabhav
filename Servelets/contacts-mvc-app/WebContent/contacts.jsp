<%@page import="com.techlabs.model.Contact"%>
<%@ page import="java.util.*" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact App</title>
<% String userName=(String)session.getAttribute("UserName"); %>

<h1 align="center">Contact List</h1>

<%if(userName!=null){%><h3>Hello <%=userName %></h3><div align="right"><button><a href='logout?userName="<%=userName %>"'> Logout</a> </button></div><%} %>
<%
	List<Contact> contacts = (List) request.getAttribute("contactList");
	out.print(
			"<table style='text-align:center' border=2px><th>Contact ID</th><th>"+
			"First Name</th><th>Last Name</th><th>Contact No</th><th>Email-Id</th><th>Edit</th><th>Delete</th>");
			
	for (Contact contact : contacts) {
		out.print("<tr><td>" + contact.getContactId() + "</td><td>" + contact.getFirstName() + " </td><td> "
				+ contact.getLastName() + " </td><td> " + contact.getContactNo() + " </td><td> "
				+ contact.getEmailId() + " </td><td> " + "<a href='edit?id=" + contact.getContactId()
				+ "'>Edit</a> " + " </td><td> " + " <a href='delete?id=" + contact.getContactId()
				+ "'>Delete</a>" + "</td></tr>");
	}
	out.print("</table>");
%>
<br>
<a href="http://localhost:8080/contacts-mvc-app/add">ClickToAddContact</a>


</head>
<body>

</body>
</html>