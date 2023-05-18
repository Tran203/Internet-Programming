<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entities.Items"%>
<%
    //get cart info
    List<Items> cart = (List<Items>) session.getAttribute("cart");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirm Page</title>
    </head>
    <body>
        <h1>Confirm order Page</h1>
        <p>
            Please see items in your cart
        </p>
        <table>
            <caption>Cart Details</caption>
            <thead>
                <tr>
                    <td>No</td>
                    <td>code</td>
                    <td>description</td>
                    <td>Cost price</td>
                    <td>Quantity</td>
                </tr>

            </thead>

            <tbody>
                <%
                    for (int i = 0; i < cart.size(); i++) {

                        Items item = cart.get(i);
                        String code = item.getCode();
                        String description = item.getDescription();
                        Double unitPrice = item.getUnitPrice();
                        Double quantity = item.getQuantity();

                %>
                <tr>
                    <td><%=item.getId()%></td>
                    <td><%=code%></td>
                    <td><%=description%></td>
                    <td>R<%=unitPrice%></td>
                    <td><%=quantity%></td>

                </tr>
                <%
                    }
                %>
            </tbody>
        </table>

        <br>

        <form action="ConfirmOrderServlet.do" method="POST">
            <caption>Address Information</caption>
            <table>
                <tr>
                    <td>Street</td>
                    <td><input type="text" name="street"></td>
                </tr>
                <tr>
                    <td>Area</td>
                    <td><input type="text" name="area"></td>
                </tr>
                <tr>
                    <td>Code</td>
                    <td><input type="text" name="code"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="text" value="Confirm Order"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
