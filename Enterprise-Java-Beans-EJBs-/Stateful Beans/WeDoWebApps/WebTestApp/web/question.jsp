<%
    String name = (String)session.getAttribute("name");
    Integer  numQuestions = (Integer)session.getAttribute("numQuestions");
    Integer  totQuestions = (Integer)session.getAttribute("totQuestions");
    String question =(String)request.getAttribute("question");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Question Page</title>
    </head>
    <body>
        <h1>Hello <%=name%></h1>
        <h3>This is Question <%=numQuestions%> of (<%=totQuestions%>)</h3>
        <details>
            <summary><h2>Please see information below</h2></summary>
            <p>
                Follow these rules when answering.
            </p>
            <ul>
                <li>The Answer cannot be null</li>
                <li>Only numbers are accepted as answers</li>
            </ul>
        </details>
        <form action="CheckAnswerServlet.do" method="POST">
            <table>
                <tr>
                    <td>Question</td>
                    <td><%=question%></td>
                </tr>
                <tr>
                    <td>Your Answer</td>
                    <td><input type="number" name="userAnswer" required></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Submit"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
