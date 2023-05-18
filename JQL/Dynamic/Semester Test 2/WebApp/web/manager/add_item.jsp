<%-- 
    Document   : add_item
    Created on : 18 May 2023, 8:31:05 PM
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
        <h1>Add Item</h1>
        <p>Please enter the details od the item</p>
        <form action="../AddItemServlet.do" method="POST">
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
                    <td>Price:</td>
                    <td><input type="number" name="price"></td>
                </tr>
                <tr>
                    <td>Quantity:</td>
                    <td><input type="number" name="qty" min="1"></td>
                </tr>
                <tr>
                    <td>Code:</td>
                    <td><input type="submit" value="Add"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
