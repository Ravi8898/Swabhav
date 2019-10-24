<!DOCTYPE html>
<html>
    <head>
        <title>Creating Cooking</title>
    </head>
    <body>
        <%
        Cookie colorCookie=new Cookie("color", "red");
        colorCookie.setMaxAge(60*60*24*7);
        response.addCookie(colorCookie);
        %>
        
        <p><h1>Cookie Created Successfully...!!!</h1></p>
        <a href="getCookie.jsp">view</a>

    </body>
</html>