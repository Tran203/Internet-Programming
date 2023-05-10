<%-- 
    Document   : edit_person
    Created on : 10 May 2023, 10:24:48 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Person Page</title>
    </head>
    <body>
        <h1>Edit Person Page</h1>
        <p>
            You can only edit the surname detail
        </p>
        <form action="EditPersonServlet.do" method="POST">
            <table>
                <tr>
                    <td>ID:</td>
                    <td><input type="text" name="id"></td>
                </tr>
                <tr>
                    <td>Surname:</td>
                    <td><input type="text" name="surname"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value=="Edit"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
