<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Session Count</title>
</head>
<body>

New Count:<s:property value="newCount"></s:property><br>  
Old Count:<s:property value="oldCount"></s:property>  

</body>
</html>