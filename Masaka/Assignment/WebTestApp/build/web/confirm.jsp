<%
    String choice = (String) session.getAttribute("choice");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmation  Page</title>
    </head>
    <body>
        <h1>Test Confirmation</h1>
        <p>
            Hi, you have chosen to complete the <%=choice%>
            <br>
            
        <form action="QuestionPreparationServlet.do" method="POST">
            Please click here to <input type="submit" value="start">
        </form>
        </p>

    </body>
</html>
