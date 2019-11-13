<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Display</title>
</head>
<body>

	<h1>Hello...!!!</h1>
	<h3>This is Contact page</h3>

<div align="right">	
<a href="add">Add</a>
</div>
	<table border="1px">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
				<th>Contact_No</th>

			</tr>
		</thead>
		
		<tbody>
			<s:iterator value="contactList">
			
				<tr>
				<td>
				<s:property value="uuid"></s:property>
				</td>
				
				<td>
				<s:property value="name"></s:property>
				</td>
				
				<td>
				<s:property value="email"></s:property>
				</td>
				
				<td>
				<s:property value="contactNo"></s:property>
				</td>
				</tr>
				
			</s:iterator>
		
		</tbody>
	</table>

</body>
</html>