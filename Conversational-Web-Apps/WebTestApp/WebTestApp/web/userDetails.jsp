<%-- 
    Document   : userDetails
    Created on : 04 Mar 2023, 20:23:02
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Enter your Details</h1>
        <p>Please enter your details </p>
        <form action="UserDetailsServlet.do" method="POST">
            <table>
                <tr>
                    <td>User Name:</td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Submit"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
