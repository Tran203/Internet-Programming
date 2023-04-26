<%
    String name = (String) session.getAttribute("name");
    String choice = (String) session.getAttribute("choice");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmintion  Page</title>
    </head>
    <body>
        <h1>Test Confirm!</h1>
        <p>
            Hi, <%=name%> you have chosen to complete the <%=choice%> Completency Test.
            <br>
            Please click here to <a href="QuestionServlet.do">start</a>
        </p>

    </body>
</html>
