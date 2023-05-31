<%@page import="za.ac.tut.entities.Customer_Order"%>
<%@page import="java.util.List"%>
<%
    List<Customer_Order> list = (List<Customer_Order>)request.getAttribute("list");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Manager</h1>
        <table>
            <thead>
                <tr>
                    <td>Items</td>
                    <td>Value</td>
                </tr>
            </thead>
            <%
                for(int i = 0; i < list.size(); i++){
                    Customer_Order o = list.get(i);
            %>
            <tr>
                <td><%=o.getCart().toString()%></td>
                
            </tr>
            <%
                 }
            %>
        </table>
    </body>
</html>
