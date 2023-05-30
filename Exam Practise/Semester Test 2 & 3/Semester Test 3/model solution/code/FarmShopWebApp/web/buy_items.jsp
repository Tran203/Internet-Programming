<%-- 
    Document   : buy_items
    Created on : 08 May 2023, 10:04:49 PM
    Author     : MemaniV
--%>

<%@page import="za.ac.tut.entities.Item"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buy Items Page</title>
    </head>
    <body>
        <h1>Buy items</h1>
        <%
            List<Item> items = (List<Item>)session.getAttribute("items");
        %>
        <p>
            Below is the list of items you can buy:
        </p>
        <form action="AddItemToCartServlet.do" method="POST">
            <table border="1">
                <th>Item code</th>
                <th>Description</th>
                <th>Unit price (R)</th>
                <%
                    for(Item item:items){
                        Long id = item.getId();
                        String desc = item.getDescription();
                        Double price = item.getUnitPrice();
                %>
                        <tr>
                            <td><b><%=id%></b></td>
                            <td><%=desc%></td>
                            <td><%=price%></td>
                        </tr>
                <%
                    }
                %>
                <tr>
                    <td>Enter item to buy (id):</td>
                    <td><input type="text" name="id"></td>
                </tr>
                <tr>
                    <td>Quantity:</td>
                    <td><input type="text" name="qty"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="ADD ITEM TO CART"></td>
                </tr>
            </table>
        </form>
    </body>
</html>

