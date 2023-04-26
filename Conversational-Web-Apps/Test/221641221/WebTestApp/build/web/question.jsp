<%
    String question = (String) session.getAttribute("question");
    Integer totQuestions = (Integer)session.getAttribute("totQuestions");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>Please see  the quetion <b>(<%=totQuestions%> of 5)</b></p>
        <form action="CheckAnswerServlet.do" method="POST">
            <table>
                <tr>
                    <td><%=question%></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Answer:</td>
                    <td><input type="number" name="userAns" required></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" name="submit"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
