<%-- 
    Document   : get_orders_by_value
    Created on : 08 May 2023, 9:58:54 PM
    Author     : MemaniV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get Orders By Value Page</title>
    </head>
    <body>
        <h1>Get orders by value</h1>
        <p>
            Please enter order values below:
        </p>
        <form action="GetOrdersByValueServlet.do" method="POST">
            <table>
                <tr>
                    <td>Minimum order value:</td>
                    <td><input type="text" name="minOrderValue"/></td>
                </tr>
                <tr>
                    <td>Maximum order value:</td>
                    <td><input type="date" name="maxOrderValue"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="GET ORDERS"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
