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
        <div align="right">
    
  <%  
LoginUserModel LUM=(LoginUserModel)request.getAttribute("bean");  
out.print("Welcome, "+LUM.getName());  
%>   
</div>
        <h1 align="center">ADMIN PANEL</h1>
        <table align="center">
            <tr>
                <td> <form action="Admin" method="post"><input type="submit" value="Create User"></form></td>
                <td><form action="CreateModerator" method="post"><input type="submit" value="Create Moderator"></form> </td>
            </tr>
            <tr>
                <td> <form action="Delete" method="post"><input type="submit" value="Delete User "></form>  </td>  
                <td> <form action="Delete" method="post"><input type="submit" value="Delete User"></form> </td>
            </tr>
           
        </table>
         
         
        
        
        
       
        
    </body>
</html>


