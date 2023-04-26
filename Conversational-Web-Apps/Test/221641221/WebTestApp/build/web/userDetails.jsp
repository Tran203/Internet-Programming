<%-- 
    Document   : userDetails
    Created on : 15 Mar 2023, 11:24:56 AM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Details Page</title>
    </head>
    <body>
        <h1>Hello User</h1>
        <p>Please fill in your user details.</p>
        <form action="UserDetailsServlet.do" method="POST">
            <table>
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name="name" required></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" name="submit"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
