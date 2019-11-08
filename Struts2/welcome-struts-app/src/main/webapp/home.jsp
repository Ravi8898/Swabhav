<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1>Hello...!!!</h1>
<h3>This is home page</h3>
<s:iterator begin="0" end="9" >
<s:property value="developer" /><br>
</s:iterator>

</body>
</html>