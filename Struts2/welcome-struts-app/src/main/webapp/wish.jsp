<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Wish page</title>
</head>
<body>

<s:form method="POST" action="wish.do">  
<s:textfield name="userName" label="Name" value="B'day boy Sunny"></s:textfield> 
<s:submit value="wish"></s:submit>   
</s:form>  

<s:property value="message"></s:property>  

</body>
</html>