<%-- 
    Document   : CreateModerator
    Created on : Nov 24, 2014, 2:00:13 AM
    Author     : Denis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel='stylesheet' type='text/css' href='CreateModerator-desine.css'/>
    </head>
    <body style="background-color: #d0e4fe">
        <h1 align="center">Create Moderator</h1>
        <form action="" method="POST">
            <table align="center">
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name="name" value="enter name"></td>
                </tr>
                <tr>
                    <td>Surname:</td>
                    <td><input type="text" name="suname"></td>
                </tr>
                <tr>
                    <td>User Name:</td>
                    <td><input type="text" name="username"></td>
                </tr>
                <tr>
                    <td>Role:</td>
                    <td><input type="text" name="role"></td>
                </tr>
                <tr>
                    <td>E-mail:</td>
                    <td><input type="email" name="email"></td> 
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td>Confirm Password:</td>
                    <td><input type="password" name="confirmpassword"></td>
                </tr>
                <tr>
                    <td></td>
                    <td align="right"><input type="submit" value="Create" ></td>
                </tr>
            </table>
        </form>
</html>
