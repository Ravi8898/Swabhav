<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>

<s:form action="logout" >
	<b>Hello <s:property value="#session.userName" />,</b>
	<br/> Authentication Successful...!!!<br>
	<s:submit value="LogOut"></s:submit>
	</s:form>
	
</body>
</html>