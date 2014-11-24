<%@page import="model.LoginUserModel"%>  

<p>You are successfully logged in!</p>  
<%  
LoginUserModel LUM=(LoginUserModel)request.getAttribute("bean");  
out.print("Welcome, "+LUM.getName());  
%> 
