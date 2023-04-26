<%-- 
    Document   : details_entry
    Created on : 08 Mar 2023, 4:41:55 PM
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
        <p><b>Please provide your details below.</b></p>
        <form action="UserDetailsServlet.do" method="POST">
            <table>
                <tr>
                    <td>Name:</td>
                    <td><input name="name"></td>
                </tr>
                <tr>
                    <td>Surname:</td>
                    <td><input name="surname"></td>
                </tr>
                <tr>
                    <td>Number of subjects:</td>
                    <td><input name="numSbj"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="submit"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
