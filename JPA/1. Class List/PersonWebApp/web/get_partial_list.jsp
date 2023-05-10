<%-- 
    Document   : get_partial_list
    Created on : 10 May 2023, 10:33:54 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get List Page</title>
    </head>
    <body>
        <h1>Get Partial list</h1>
        <p>Please enter the start and last indices of the list below:</p>
        <form action="GetPartialListServlet.do" method="POST">
            <table>
                <tr>
                    <td>Start index:</td>
                    <td><input type="text" name="startIndex"></td>
                </tr>
                <tr>
                    <td>Last index:</td>
                    <td><input type="text" name="endIndex"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value=="Get_list"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
