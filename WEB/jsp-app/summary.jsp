<!DOCTYPE html>
    
<html>
   <head>
      <title>Summary Tracking</title>
   </head>
   
   <body>
        <h1>Summary of session and application Object</h1>
      
        <p> Session counter value is: <% out.print(session.getAttribute("counter")); %></p>
        <p> Application counter value is: <% out.print(application.getAttribute("counter")); %></p>
        <p> </p>
   
   </body>
</html>