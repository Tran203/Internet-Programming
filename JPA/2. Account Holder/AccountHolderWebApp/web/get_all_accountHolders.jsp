<%-- 
    Document   : get_all_accountHolders
    Created on : 11 May 2023, 12:21:50 AM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get All Page</title>
    </head>
    <body>
        <h1>Get ALL</h1>
        <p>You're about to view all the available account holders</p>
        <form action="GetAllServlet.do" method="POST">
            <table>
                <tr>
                    <td></td>
                    <td><input type="submit" value="View"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
