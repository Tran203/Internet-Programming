<% 
    String question = (String) session.getAttribute("question");
    String outcome = (String) request.getAttribute("outcome");
    Integer answer = (Integer) session.getAttribute("answer");
    Integer userAnswer = (Integer) request.getAttribute("userAnswer");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outcome Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table>
                <tr>
                    <td>Question</td>
                    <td><%=question%></td>
                </tr>
                <tr>
                    <td>Outcome</td>
                    <td><%=outcome%></td>
                </tr>
                <tr>
                    <td>Answer</td>
                    <td><%=answer%></td>
                </tr>
                <tr>
                    <td>Your Answer</td>
                    <td><%=userAnswer%></td>
                </tr>
            </table>
                
                <p><a href="QuestionServlet.do">Next Question</a></p>
    </body>
</html>
