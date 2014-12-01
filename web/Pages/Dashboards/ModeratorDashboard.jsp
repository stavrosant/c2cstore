<%-- 
    Document   : ModeratorDashboard
    Created on : 12 Νοε 2014, 12:08:55 μμ
    Author     : Admin
--%>
<%@page import="hibernate_models.User"%>   
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Moderator Control Panel</title>
    </head>
    <body>
       <p>You are successfully logged in!</p>  
    </body>
</html>

<%  
User user=(User)request.getAttribute("bean");  
out.print("Welcome, "+user.getName());  
%> 

 
  

