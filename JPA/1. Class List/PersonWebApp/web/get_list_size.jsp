<%-- 
    Document   : get_list_size
    Created on : 10 May 2023, 10:39:29 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>List Size</h1>
        <p>You are about to get the class list</p>
        <form action="GetListSizeServlet.do" method="POST">
            <table>
                <tr>
                    <td></td>
                    <td><input type="submit" value=="Search"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
