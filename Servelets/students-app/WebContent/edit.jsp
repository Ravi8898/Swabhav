<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Student</title>
</head>
<body>
	<%
		String validate = (String) request.getAttribute("errorLabel");
		String setName = (String) request.getAttribute("setName");
		double setCgpi = (double)request.getAttribute("setCgpi");
		int studentId=(Integer) request.getAttribute("studentID");
		
		if (validate == null)
			validate = "";
		if(setName==null)
			setName="";
	
	%>
	<form method="post" action="edit?id=<%=studentId%>">
		ID:<label name="studentID"><%=studentId%></label><br>
		<br> Name:<input type="text" name="Name" value="<%=setName%>"><br>
		<br> CGPI:<input type="text" name="Cgpi" value="<%=setCgpi%>"><br>
		<br> <label style="color: red;" name="errorLabel"><%=validate%></label><br>
		<br>
		<button name="edit">Update</button>

	</form>
</body>
</html>