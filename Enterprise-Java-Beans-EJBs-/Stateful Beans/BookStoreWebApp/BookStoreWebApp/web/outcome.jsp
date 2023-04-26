<%
    String type = (String)request.getAttribute("type");
    String status = (String)request.getAttribute("status");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outcome Page</title>
    </head>
    <body>
        <h1><%=type%> Outcome</h1>
        <p>
            <%=status%> <br>
            Click  <a href="menu.jsp">here</a> to go to the menu or <a href="index.html">here</a> to the main page.
        </p>
    </body>
</html>
