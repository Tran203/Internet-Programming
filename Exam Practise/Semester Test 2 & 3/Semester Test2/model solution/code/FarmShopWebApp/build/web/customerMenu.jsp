<%-- 
    Document   : customerMenu
    Created on : 08 May 2023, 10:02:32 PM
    Author     : MemaniV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Menu Page</title>
    </head>
    <body>
        <h1>Customer Menu</h1>
        <%
            String name = (String)session.getAttribute("name");
        %>
        <p>
            Hi <b><%=name%></b>. Please click <a href="GetItemsToBuyServlet.do">here</a> to view all the items on offer.
        </p>
    </body>
</html>
