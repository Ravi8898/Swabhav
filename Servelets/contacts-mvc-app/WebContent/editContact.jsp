<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
</head>
<body>

	<%
		String validate = (String) request.getAttribute("errorLabel");
		String setFName = (String) request.getAttribute("setFName");
		String setLName = (String) request.getAttribute("setLName");
		
		String setContactNo = (String) request.getAttribute("setContactNo");
		String setEmail = (String) request.getAttribute("setEmail");
		int contactId = (Integer) request.getAttribute("contactID");

		if (validate == null)
			validate = "";
		if (setFName == null)
			setFName = "";
		if (setLName == null)
			setLName = "";
		if (setContactNo == null)
			setContactNo = "";
		if (setEmail == null)
			setEmail = "";
	%>
	<form method="post" action="edit?id=<%=contactId%>">
	<label name="contactID"><%=contactId %></label>
		First Name: <input type="text" name="firstName" value="<%=setFName%>"><br>
		<br> Last Name:<input type="text" name="lastName"
			value="<%=setLName%>"><br> <br> Contact Number:<input
			type="text" name="contactNo" value="<%=setContactNo%>"><br>
		<br> Email ID:<input type="text" name="emailId"
			value="<%=setEmail%>"><br> <br> <label
			style="color: red;" name="errorLabel"><%=validate%></label><br>
		<br>
		<button>Update</button>

	</form>

</body>
</html>