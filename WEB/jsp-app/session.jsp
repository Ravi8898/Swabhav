<!DOCTYPE html>
    
<html>
   <head>
      <title>Session Tracking</title>
   </head>
   
   <body>
        <h1>Session Object</h1>
      
    <%  
        int count;
        if(session.getAttribute("counter")==null){
            count=0;
        }
        else
            count=(int)session.getAttribute("counter");
        
        int oldCount=count;
        count++;
        session.setAttribute("counter", count);
    %>
      
        <p>Session ID: <% out.print(session.getId()); %></p>
        <p> Old: <% out.print(oldCount); %></p>
        <p> New: <% out.print(count); %></p>
        <a href="summary.jsp">checkSummary</a>
   
   </body>
</html>