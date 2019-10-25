<%@page import="java.util.*"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Beer Recommendation</title>
</head>
<body>
	<h1 align="center">Beer Recommendations JSP</h1>
	<p>

		<%
			List styles = (List) request.getAttribute("styles");
			Iterator it = styles.iterator();
			while (it.hasNext()) {
				out.print("<br>try: " + it.next());
			}
		%>
	
</body>
</html>