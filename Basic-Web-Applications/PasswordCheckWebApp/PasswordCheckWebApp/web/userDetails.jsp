<%-- 
    Document   : userDetails
    Created on : 19 Mar 2023, 2:41:09 AM
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
        <h1>Hello User!</h1>
        <p>Please introduce yourself.</p>
        <form action="UserDetailServlet.do" method="POST">
            <table>
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="submit"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
