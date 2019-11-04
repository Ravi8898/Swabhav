<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
      <script>
            var formValidate=document.getElementById("BadLogin")
            var userNameInput=document.getElementById("UsernameIn")
            var passwordInput=document.getElementById("PasswordIn")
            document.getElementById("submitButton").addEventListener("click", login)
            
            function login(){
                if(userNameInput.value==""){
                    document.getElementById("BadLogin").style.visibility='visible'
                    userNameInput.style.borderColor ='red'
                    
                    document.getElementById("user").innerHTML="*"
                    event.preventDefault()
                }
                if(passwordInput.value==""){
                    document.getElementById("BadLogin").style.visibility='visible'
                    passwordInput.style.borderColor='red'
                    document.getElementById("pass").innerHTML="*"
                    event.preventDefault()
                }
                else
                document.getElementById("BadLogin").style.visibility='hidden'
            }
        </script>
  

</head>
<body>
 <% String errMsg = (String)request.getAttribute("errorMsg");
 	if(errMsg==null){
 		errMsg="";
 	}
 
 %>

    <form id="LoginForm" action="login" method="POST" style="background-color: yellow; text-align: center;">
        <h1>Login Form</h1>
        <div class="FormRow">
       
            <p><label id="errorMsg" style="color:red"><%=errMsg%></label></p>
            
        </div>
        <div class="FormRow">
            <p><label id="usernameLabel" for="Username">Username:</label>
            <input type="text" size="15" placeholder="Enter username" id="UsernameIn" name="Username"><font color="red"><span id="user"></font></span></p>
        </div>
        <div class="FormRow">
            <p><label id="passwordlabel" for="Password">Password:</label>
            <input type="password" size="15" placeholder="Enter password" id="PasswordIn" name="Password"><font color="red"><span id="pass"></font></span></p>
        </div>
        <div class="FormRow" id="LoginButtonDiv">
            <button id="submitButton" type="submit">Login</button>
        </div>
        <div id="BadLogin" style="visibility: hidden;">
            <p>Please fill the input field</p>
        </div>
    </form>
  
</body>
</html>