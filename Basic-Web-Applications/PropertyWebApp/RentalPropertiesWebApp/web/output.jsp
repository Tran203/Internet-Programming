<%-- 
    Document   : output
    Created on : 02 Mar 2023, 16:31:19
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Output Page</title>
    </head>
    <body>
        <h1>Please see outcome below:</h1>
        <%
            String result = request.getAttribute("result");
        %>
        <p><%=result%></p>
    </body>
</html>
