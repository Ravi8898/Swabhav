<%@page import="com.techlabs.model.Student"%>
<%@ page import="java.util.*" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student App</title>
</head>
<body>
	<h1 align="center">Students List</h1>
	<%
		List<Student> students = (List) request.getAttribute("studentList");

		for (Student student : students) {
			out.print("<br>ID: " + student.getStudentID() + " Name: " + student.getName() + " CGPI: " + student.getCgpi());
		}
	%>
	<br><br>
	<a href="http://localhost:8080/students-app/add.jsp">ClickToAddStudents</a>
</body>
</html>