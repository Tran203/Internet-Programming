<%-- 
    Document   : managerMenu
    Created on : 08 May 2023, 9:54:34 PM
    Author     : MemaniV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manager Menu Page</title>
    </head>
    <body>
        <h1>Manager Menu</h1>
        <%
            String name = (String)session.getAttribute("name");
        %>
        <p>
            Hi <b><%=name%></b>. Please select one of the following options:
        </p>
        <ol>
            <li><a href="add_item.jsp">Add item.</a></li>
            <li><a href="get_orders_by_value.jsp">Get orders by value.</a></li>
        </ol>
    </body>
</html>
