<%-- 
    Document   : Create
    Created on : Nov 23, 2014, 7:38:13 PM
    Author     : Denis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel='stylesheet' type='text/css' href='CreateUser-desine.css'/>
        <title>JSP Page</title>
    </head>
    <body style="background-color: #d0e4fe">
        <h1 align="center">Create User!!!</h1>
        . <form action="" method="post">
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
    </body>
</html>
