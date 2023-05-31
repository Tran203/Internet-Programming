<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entities.Item"%>
<%
    List<Item> items = (List<Item>) session.getAttribute("item");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Customer</h1>
        <p>Please see our menu below:</p>
        <table>
            <caption>Menu</caption>
            <thead>
                <tr>
                    <td>ID</td>
                    <td>Code</td>
                    <td>Desc</td>
                    <td>Price</td>
                    <td>Available(qty)</td>
                </tr>
            </thead>
            <%
                for (int b = 0; b < items.size(); b++) {
                    Item i = items.get(b);
            %>
            <tr>
                <td><%=i.getId()%></td>
                <td><%=i.getCode()%></td>
                <td><%=i.getDescription()%></td>
                <td><%=i.getUnitPrice()%></td>
                <td><%=i.getQty()%></td>
            </tr>
            <%
                }
            %>
        </table>
        <table>
            <caption>Buy Item</caption>
            <tr>
                <td>ID:</td>
                <td><input type="number" name="id"></td>
            </tr>
            <tr>
                <td>Quantity:</td>
                <td><input type="number" name="qty"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="SUBMIT" value="BUY"</td>
            </tr>
        </table>
    </body>
</html>
