<!DOCTYPE html>
<html>
    <head>
        <title>Welcome JSP</title>
    </head>
    <body style="background-color: #03ff03;" >
        <!-- <a href="welcome.jsp?developer="></a> -->
        <% String name=request.getParameter("developer"); 
       
        if(name=="")
            for(int i=0; i<5; i++)
                out.println("Welcome to JSP <br>");
          
        else
            for(int i=0; i<5; i++)
                out.println(name+"<br>");
         
        %>
    </body>
</html>