<%-- 
    Document   : get_orders_by_value_outcome
    Created on : 08 May 2023, 10:01:05 PM
    Author     : MemaniV
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="za.ac.tut.entities.Item"%>
<%@page import="java.util.Date"%>
<%@page import="za.ac.tut.entities.CustomerOrder"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get Orders By Date Outcome Page</title>
    </head>
        <%
            List<CustomerOrder> co = (List<CustomerOrder>)request.getAttribute("co");
            DecimalFormat df = new DecimalFormat("0.00");
        %>
        <h1>Get orders by date outcome</h1>
        <p>
            Below is the list of orders by date:
        </p>
        <table border="1">
            <th>Order no.</th>
            <th>Payable amount (R)</th>
            <th>Order date</th>
            <th>Customer address</th>
            <%
                for(CustomerOrder custOrder:co){
                    Long orderNum = custOrder.getId();
                    Double payableAmt = custOrder.getOrderValue();
                    Date date = custOrder.getCreationDate();
                    String addr =  custOrder.getCustomerAddress().toString();
            %>
                    <tr>
                        <td><%=orderNum%></td>
                        <td><%=df.format(payableAmt)%></td>
                        <td><%=date.toString()%></td>
                        <td><%=addr%></td>
                    </tr>
            <%
                }
            %>
        </table>
        <p>
            Please click <a href="managerMenu.jsp">here</a> to go back to the menu page or <a href="index.html">here</a> to the main page.
        </p>
    </body>
</html>

