<%-- 
    Document   : userDetails
    Created on : 15 Apr 2023, 10:51:11 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Details Page</title>
    </head>
    <body>
        <h1>Hello User!</h1>
        <details>
            <summary>Please note</summary>
            <p>Complete the form, with your details</p>
        </details>
        
        <form action="UserDetailsServlet.do" method="POST">
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
