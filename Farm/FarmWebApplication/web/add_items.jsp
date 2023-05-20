<%-- 
    Document   : add_items
    Created on : 18 May 2023, 5:52:41 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Items Page</title>
    </head>
    <body>
        <h1>Add Items</h1>
        <p>
            Please enter the details of items below:
        </p>
        <form action="AddItemsServlet.do" method="POST">
            <table border="1">
               
                <tbody>
                     <tr>
                        <td>Item Code:</td>
                        <td><input type="text" name="code"></td>
                    </tr>
                     <tr>
                        <td>Item Description:</td>
                        <td><input type="text" name="description"></td>
                    </tr> 
                    <tr>
                        <td>Item Unit Price:</td>
                        <td><input type="text" name="unitPrice"></td>
                    </tr>
                     <tr>
                        <td>Item Quantity:</td>
                        <td><input type="text" name="quantity"></td>
                    </tr>
                     <tr>
                        <td></td>
                        <td><input type="submit" value="ADD"></td>
                    </tr>
                    
                </tbody>
            </table>

        </form>
    </body>
</html>
