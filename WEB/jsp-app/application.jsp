<!DOCTYPE html>
    
<html>
   <head>
      <title>Application Tracking</title>
   </head>
   
   <body>
        <h1>Application Object</h1>
      
    <%  
        int count;
        if(application.getAttribute("counter")==null){
            count=0;
        }
        else
            count=(int)application.getAttribute("counter");
        
        int oldCount=count;
        count++;
        application.setAttribute("counter", count);
    %>
        <p> Old: <% out.print(oldCount); %></p>
        <p> New: <% out.print(count); %></p>
        <a href="summary.jsp">checkSummary</a>
   
   </body>
</html>