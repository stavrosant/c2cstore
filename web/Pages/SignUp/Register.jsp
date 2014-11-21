<%-- 
    Document   : Register
    Created on : Nov 12, 2014, 10:04:44 PM
    Author     : Chris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Please feel in your details</title>
    </head>
    <body>
        <table>
            <form action="RegisterValidate" method="post">
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name="name"></td>
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
                    <td>E-mail:</td>
                    <td><input type="email" name="email"  placeholder="Enter a valid email"></td> 
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
                    <td align="right"><input type="submit" value="Sign Up" ></td>
                </tr>
            </form>
        </table>
    </body>
</html>
