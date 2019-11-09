<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 
<html>
<body> 
	<h4>
		<b>Struts2 Login</b>
	</h4>
	
	<s:form method="POST" action="welcome">
	<s:textfield name="userName" label="User Name"></s:textfield>
	<s:textfield name="password" label="Password" type="password"></s:textfield>
	<s:submit value="Login"></s:submit>
</s:form>
	<br>
 
	
</body>
</html>