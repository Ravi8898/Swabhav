<!DOCTYPE html>
<html>
    <head>
        <title>Authentication Page</title>
    </head>
    <body style="background-color: coral;">
        <% String userName=request.getParameter("Username");
            String password=request.getParameter("Password");
          
            if(userName.equals("admin") && password.equals("admin"))
                out.print("Authentication successfull...!!! <br> "+ "Hello "+userName);
            else
                out.println("Please check your Username and password and try again <br> <a href='login.html'>Try again</a>");
                
        %> 
        
    </body>
</html>