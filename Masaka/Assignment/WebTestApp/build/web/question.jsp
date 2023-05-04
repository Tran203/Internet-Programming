<%
    String question =(String)session.getAttribute("question");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Question Page</title>
    </head>
    <body>
        <h1>QUESTION</h1>
        
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
