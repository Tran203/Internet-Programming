<%@page import="za.ac.tut.entities.Items"%>
<%@page import="za.ac.tut.entities.Order_Info"%>
<%@page import="java.util.List"%>
<%
    List<Order_Info> list = (List<Order_Info>) request.getAttribute("list");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Manager</h1>
        <p>Please see the details of all orders with order value falling withing your price range</p>
        <table>
            <caption>Orders Information</caption>
            <thead>
                <tr>
                    <td>No</td>
                    <td>Order Value</td>
                </tr>

            </thead>

            <tbody>
                <%
                    for (int i = 0; i < list.size(); i++) {

                        Order_Info o = list.get(i);
                %>
                <tr>
                    <td><%=o.getId()%></td>
                    <td><%=o.getTotAmt()%></td>
                </tr>
                <%
                    }
                %>
            </tbody>
    </body>
</html>
