<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>

	<%
		String userName = (String) session.getAttribute("UserName");
		double userBal = (Double) session.getAttribute("userBal");
	%>
	<%
		if (userName != null) {
	%>
	<div align="right">
		<button>
			<a href='logout?userName="<%=userName%>"'>Logout</a>
		</button>
	</div>
	<%
		}
		;
	%>
	<jsp:useBean class="com.techlabs.listener.SessionCounter"
		id="sessionCounter" scope="application" />
	<UL>
		<LI>Total number of sessions in the life of this Web application:
			<jsp:getProperty name="sessionCounter" property="totalSessionCount" />.

			<LI>Number of sessions currently in memory: <jsp:getProperty
				name="sessionCounter" property="currentSessionCount" />
		</LI>
	</UL>

<center>
				<h1>Welcome to SBI Bank</h1>
<i>World's No.1 Trusted Bank</i>

</center>

<%
	if (userName != null) {
%><h3>Hello <%=userName%></h3>
			<p>Remaining Balance: <%=userBal%>
				<%
					}
					;
				%>


			<center>
<p>
					<a href="transaction">Transaction</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a
						href="passbook">Passbook</a>
				</p>
</center>
</div>

		</body>
</html>