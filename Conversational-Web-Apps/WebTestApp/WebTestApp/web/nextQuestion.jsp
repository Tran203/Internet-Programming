<%-- 
    Document   : nextQuestion.jsp
    Created on : 05 Mar 2023, 13:23:28
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outcome Page</title>
    </head>
    <body>
        <h1>Outcome</h1>
        <%
            String name = session.getAttribute("name");
            String question = request.getAttribute("question");
            Integer answer = Integer.parseInt(request.getAttribute("answer"));
            Integer correctAnswer = Integer.parseInt(request.getAttribute("correctAnswer"));
            String outcome = request.getAttribute("outcome");
        %>
        <p>Hi <%=name%>, kindly find below the outcome:</p>
        <table>
            <tr>
                <td>Question:</td>
                <td><%=question%></td>
            </tr>
            <tr>
                <td>Your answer:</td>
                <td><%=answer%></td>
            </tr>
            <tr>
                <td>Correct Answer:</td>
                <td><%=correctAnswer%></td>
            </tr>
            <tr>
                <td>Outcome:</td>
                <td><%=outcome%></td>
            </tr>
        </table>
            <p>Please <a href="AskQuestion.do">click here</a> to get the next question</p>
    
    </body>
</html>
