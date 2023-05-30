<%-- 
    Document   : add_item
    Created on : 08 May 2023, 9:55:29 PM
    Author     : MemaniV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Item Page</title>
    </head>
    <body>
        <h1>Add item</h1>
        <p>
            Please enter the details of the item below:
        </p>
        <form action="AddItemServlet.do" method="POST">
            <table>
                <tr>
                    <td>Code:</td>
                    <td><input type="text" name="code"/></td>
                </tr>
                <tr>
                    <td>Description:</td>
                    <td><input type="text" name="desc"/></td>
                </tr>
                <tr>
                    <td>Unit price: R</td>
                    <td><input type="text" name="price"/></td>
                </tr>
                <tr>
                    <td>Quantity:</td>
                    <td><input type="text" name="qty"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="ADD"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
