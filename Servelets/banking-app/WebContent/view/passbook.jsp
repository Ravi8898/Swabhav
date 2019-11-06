<%@ page import="java.util.*"%>
<%@ page import="com.techlabs.model.BankTxn"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Passbook</title>
</head>
<body>

	<%
	double userBal=(Double)session.getAttribute("userBal");

	String userName = (String) session.getAttribute("UserName"); if
	(userName != null) { %>
	<div align="right">
		<button>
			<a href='logout?userName="<%=userName%>"'>Logout</a>
		</button>
	</div>
	<%if(userName!=null){%><h3>Hello <%=userName %></h3><p>Remaining Balance: <%=userBal %><%}; %>
	
	<%
		}
		;
	%>
	<%
		out.print(
				"<table style='text-align:center' border=3 align='center'><thead><th>Name</th><th>Amount</th><th>Transaction Type</th><th>Date</th></thead>");
		List<BankTxn> passbookList = (List) request.getAttribute("passbooklist");
		out.print("<tbody>");
		for (BankTxn bankTxn : passbookList) {
			out.print("<tr><td> " + bankTxn.getName() + "</td><td>" + bankTxn.getAmount() + "</td><td>"
					+ bankTxn.getTxnType() + "</td><td>" + bankTxn.getTxnDate() + "</td>");
		}
		out.print("</tbody>");
		out.print("</table>");
	%>
	<form id="downloadForm" action="passbook" method="POST">
		<br>
		<br>
		<center>
			<button>Download</button>
		</center>
	</form>
</body>
</html>