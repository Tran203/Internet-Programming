
<%
    String name = (String)request.getAttribute("name");
    String surname = (String)request.getAttribute("surname");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outcomes Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>
            <b><%=name%> <%=surname%></b> was added to the database
            lease click <a href="./menu.jsp">here</a> to go to menu
        </p>
    </body>
</html>
