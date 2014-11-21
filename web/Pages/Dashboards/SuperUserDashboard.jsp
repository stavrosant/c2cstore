<%-- 
    Document   : SuperUserDashboard
    Created on : 12 Νοε 2014, 12:09:20 μμ
    Author     : Admin
--%>
<%@page import="model.LoginUserModel"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SUPER USER CONTROL PANEL</title>
    </head>
    <body>
       
    </body>
</html>
<%  
LoginUserModel LUM=(LoginUserModel)request.getAttribute("bean");  
out.print("Welcome, "+LUM.getName());  
%> 
