<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entities.Item"%>
<%
    List<Item> cart = (List<Item>) session.getAttribute("cart");
    Double tot = (Double)session.getAttribute("tot");
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
        <p>
            Please see your cart details below
            <br>
            Your cart currently worth <em><b>R<%=tot%></b></em>
        </p>
        <
         <table>
            <caption>Menu</caption>
            <thead>
                <tr>
                    <td>ID</td>
                    <td>Code</td>
                    <td>Desc</td>
                    <td>Qty</td>
                    <td>Cost</td>
                </tr>
            </thead>
            <%
                for (int b = 0; b < cart.size(); b++) {
                    Item i = cart.get(b);
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
        <p>Fill in your address below and confirm the order</p>
        <form action="ConfirmOrderServlet.do" method="POST">
            <table>
                <caption>Customer Address</caption>
                <tr>
                    <td>Street:</td>
                    <td><input type="text" name="street"></td>
                </tr>
                <tr>
                    <td>Area:</td>
                    <td><input type="text" name="area"></td>
                </tr>
                <tr>
                    <td>Code:</td>
                    <td><input type="text" name="code"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="SUBMIT" value="Confirm"</td>
                </tr>
            </table>
        </form>
    </body>
</html>
