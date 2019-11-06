<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transaction</title>
</head>
<body>

	<%
	double userBal=(Double)session.getAttribute("userBal");
	
		String userName = (String) session.getAttribute("UserName");
		if (userName != null) {
	%>
	<%if(userName!=null){%><h3>Hello <%=userName %></h3><p>Remaining Balance: <%=userBal %><%}; %>
	
	<div align="right">
		<button>
			<a href='logout?userName="<%=userName%>"'>Logout</a>
		</button>
	</div>
	<%
		}
		;
	%>
	<form id="txnForm" action="transaction" method="POST">
		<center>
			<label for="txnAmnt">Amount:</label> <input type="text" id="txnAmnt"
				name="txnAmount"><br> <br> <br> <input
				name="txnType" type="radio" id="depositRadio" value="D"><label
				for="depositRadio">Deposit</label>&nbsp;&nbsp;&nbsp; <input
				name="txnType" type="radio" id="withdrawRadio" value="W"><label
				for="withdrawRadio">Withdraw</label><br>
			<br>
			<button>
				Save
			</button>
		</center>
	</form>
</body>
</html>