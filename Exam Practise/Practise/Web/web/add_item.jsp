<%-- 
    Document   : add_item
    Created on : 30 May 2023, 10:32:54 PM
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
        <h1>Hello Manager</h1>
        <p>Please enter the details of the Item that you wish to add.</p>
        <form action="AddItemServlet.do" method="POST">
            <table>
                <tr>
                    <td>Code:</td>
                    <td><input type="text" name="code"></td>
                </tr>
                <tr>
                    <td>Description:</td>
                    <td><input type="text" name="desc"></td>
                </tr>
                <tr>
                    <td>Unit Price:</td>
                    <td><input type="number" name="price"></td>
                </tr>
                <tr>
                    <td>Quantity:</td>
                    <td><input type="number" name="qty"></td>
                </tr>
                <tr>
                    <td>Code:</td>
                    <td><input type="SUBMIT" value="ADD"</td>
                </tr>
            </table>
        </form>
    </body>
</html>
