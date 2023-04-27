<%-- 
    Document   : ouctome
    Created on : 28 Apr 2023, 1:10:27 AM
    Author     : Student
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
        <p>See outcome below</p>
        <form action="CheckAnswerServlet.do" method="POST">
            <table>
                <tr>
                    <td>Result</td>
                    <td>You're are <%=result%></td>
                </tr>
                <tr>
                    <td>Question</td>
                    <td><%=question%></td>
                </tr>
                <tr>
                    <td>Your Answer</td>
                    <td><%=userAnswer%></td>
                </tr>
                <tr>
                    <td>Actual Answer</td>
                    <td><%=Answer%></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Next"></td>
                </tr>
            </table>
    </body>
</html>
