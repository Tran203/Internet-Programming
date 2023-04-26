<%-- 
    Document   : entry
    Created on : 03 Mar 2023, 16:50:54
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Entry Page</title>
    </head>
    <body>
        <h1>Entry</h1>
        <p>Please enter your age for 'The age classification'</p>
        <form action="AgeCategoryServlet.do" method="POST">
            <table>
                <tr>
                    <td>Age:</td>
                    <td><input type="text" name="age"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="submit"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
