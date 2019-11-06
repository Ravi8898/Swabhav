<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>



</head>
<body>
	<%
		String errMsg = (String) request.getAttribute("errorMsg");
		String userName=(String) request.getAttribute("Username");
		if (errMsg == null) {
			errMsg = "";
		}
	%>

	<form id="LoginForm" action="register" method="POST"
		style="background-color: yellow; padding-left: 550px;">
		<div style="padding-left: 70px">
			<h1>Register</h1>
		</div>

		<div class="FormRow">
			<p>
				<label id="errorMsg" style="color: red"><%=errMsg%></label>
			</p>
		</div>

		<table style="text-align: left;">
			<tr>
				<td>
					<p>
						<label id="usernameLabel" for="Username">Username:</label>
					</p>
				</td>
				<td>
					<p>
						<input type="text" size="15" placeholder="Enter username"
							id="UsernameIn" name="Username"><font color="red"><span
							id="user"></font></span>
					</p>
				</td>
			<tr>
				<td>
					<p>
						<label id="passwordlabel" for="Password">Password:</label>
					</p>
				</td>
				<td>
					<p>
						<input type="password" size="15" placeholder="Enter password"
							id="PasswordIn" name="Password"><font color="red"><span
							id="pass"></font></span>
					</p>
				</td>
			<tr>
				<td>
					<p>
						<label id="retypelabel" for="ReTypePassword">Re-type
							Password:</label>
					</p>
				</td>
				<td>
					<p>
						<input type="password" size="15" placeholder="Re-type password"
							id="ReTypeIn" name="ReTypePassword"><font color="red"><span
							id="reType"></font></span>
					</p>
				</td>
			<tr>
				<td>
					<p>
						<label id="openBalLabel" for="Openbalance">Open-Balance:</label>
					</p>
				</td>
				<td>
					<p>
						<input type="text" size="15" placeholder="Enter Open Balance"
							id="openBalIn" name="Openbalance"><font color="red"><span
							id="openBal"></font></span>
					</p>
				</td>
		</table>

		<div class="FormRow" id="registerButtonDiv" style="padding-left: 95px">
			<button id="registerButton" type="submit">Register</button>
			
		</div>
		
		<div class="FormRow" style="padding-left: 50px">
		<a href='login'>Already Registered? Log In</a>
		</div>
		
		<div id="BadLogin" style="visibility: hidden;">
			<p style="color: red">Please fill all the Mandatory fields</p>
		</div>
	</form>

	<script>
		var formValidate = document.getElementById("BadLogin")
		var userNameInput = document.getElementById("UsernameIn")
		var passwordInput = document.getElementById("PasswordIn")
		var reTypeInput = document.getElementById("ReTypeIn")
		var openBalance = document.getElementById("openBalIn")

		document.getElementById("registerButton").addEventListener("click",
				login)

		function login() {
			if (userNameInput.value == "") {
				document.getElementById("BadLogin").style.visibility = 'visible'
				userNameInput.style.borderColor = 'red'

				document.getElementById("user").innerHTML = "*"
				event.preventDefault()
			}
			if (passwordInput.value == "") {
				document.getElementById("BadLogin").style.visibility = 'visible'
				passwordInput.style.borderColor = 'red'
				document.getElementById("pass").innerHTML = "*"
				event.preventDefault()
			}
			if (reTypeInput.value == "") {
				document.getElementById("BadLogin").style.visibility = 'visible'
				reTypeInput.style.borderColor = 'red'

				document.getElementById("reType").innerHTML = "*"
				event.preventDefault()
			}
			if (openBalance.value == "") {
				document.getElementById("BadLogin").style.visibility = 'visible'
				openBalance.style.borderColor = 'red'

				document.getElementById("openBal").innerHTML = "*"
				event.preventDefault()
			} else
				document.getElementById("BadLogin").style.visibility = 'hidden'
		}
	</script>


</body>
</html>