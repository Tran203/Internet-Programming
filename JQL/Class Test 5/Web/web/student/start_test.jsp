<%
    Integer numQuestions = (Integer)session.getAttribute("numQuestions");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Student</h1>
        <p>There are <%=numQuestions%> available on your test.<br>Click the button below to start the test</p>
        <form action="./QuestionPreparationServlet.do" method="POST">
            <table>
                <tr>
                    <td><input type="submit" value="Start"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
