<%
    String name = (String) session.getAttribute("name");
    String outcome = (String) request.getAttribute("outcome");
    Integer num1 = (Integer) request.getAttribute("num1");
    Integer num2 = (Integer) request.getAttribute("num2");
    Character op = (Character) request.getAttribute("op");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outcome Page</title>
    </head>
    <body>
        <h1>Hello <%=name%>!</h1>
        <p>Please see the outcome below:</p>
        <br>
        <p>
            <%=num1%> <%=op%> <%=num2%> = <%=outcome%>.
            <br>
            Please click <a href="index.html">here</a> to go back to the main page.

        </p>
    </body>
</html>
