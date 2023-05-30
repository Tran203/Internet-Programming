<%-- 
    Document   : checkout
    Created on : 08 May 2023, 10:26:06 PM
    Author     : MemaniV
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entities.Item"%>
<%@page import="za.ac.tut.ejb.bl.CartSBLocal"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Checkout Page</title>
    </head>
    <body>
        <h1>Checkout</h1>
        <%
            CartSBLocal col = (CartSBLocal)session.getAttribute("col");
            List<String> items = col.getItems();
            Double amtDue = (Double)session.getAttribute("amtDue");
        %>
        <p>
            Here are the items you want to buy:
        </p>
        <table border="1">
            <th>Item id</th>
            <th>Description</th>
            <th>Unit price (R)</th>
            <th>Quantity requested</th>
            <%
                for(String item:items){
                    String[] tokens = item.split(",");
                    Long id = Long.parseLong(tokens[0]);
                    String desc = tokens[2];
                    Double price = Double.parseDouble(tokens[3]);
                    Integer qty = Integer.parseInt(tokens[4]);
            %>
                    <tr>
                        <td><b><%=id%></b></td>
                        <td><b><%=desc%></b></td>
                        <td><%=price%></td>
                        <td><%=qty%></td>
                    </tr>
            <%
                }
            %>
            <tr>
                <td>Total amount due: R</td>
                <td><%=amtDue%></td>
            </tr>
        </table>  
        <p>
            Please enter your address below.
        </p>
        <form action="PlaceOrderServlet.do" method="POST">
            <table>
                <tr>
                    <td>Street:</td>
                    <td><input type="text" name="street"/></td>
                </tr>
                <tr>
                    <td>Area:</td>
                    <td><input type="text" name="area"/></td>
                </tr>
                <tr>
                    <td>Code:</td>
                    <td><input type="text" name="code"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="PLACE ORDER"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>


