<%
    String name = (String)request.getAttribute("name");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ouctome Page</title>
    </head>
    <body>
        <h1>Adding Outcome</h1>
        <p>
            The account for <b><%=name%></b> has been created
            <br>
            Click <a href="menu.jsp">here</a> to return to the menu
        </p>
    </body>
</html>
