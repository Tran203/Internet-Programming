<%-- 
    Document   : remove_person
    Created on : 10 May 2023, 10:36:58 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remove Page</title>
    </head>
    <body>
        <h1>Remove Person</h1>
        <p>You're about to remove a person</p>
        <form action="RemovePersonServlet.do" method="POST">
            <table>
                <tr>
                    <td>ID:</td>
                    <td><input type="text" name="id"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value=="Remove"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
