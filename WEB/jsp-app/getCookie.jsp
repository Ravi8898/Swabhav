<!DOCTYPE html>
<html>
    <head>
        <title>Getting Cooking</title>
    </head>
    
    <body>
        <%
        Cookie cookie=null;
        Cookie[] cookies=null;
        String colorName;
        cookies=request.getCookies();
        if( cookies!=null ) {
            
            for (int i=0; i<cookies.length; i++) {
               cookie=cookies[i];
               if(cookie.getName().equals("color")){
                    colorName=cookie.getValue();
                    out.print("<h1>"+"Cookie Found: "+ colorName+"</h1>"+"<br>");
                    %>
                    <body style="background-color: <%=colorName %>"></body>
                    <%
                    out.print("Name:" + cookie.getName());
                    break;
               }       
            } 
         }
         else {
            out.println("<h2>No cookies founds</h2>");
            }
            %>
        
    
        
    </body>
</html>