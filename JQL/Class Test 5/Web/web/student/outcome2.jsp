<%
    String question =(String)session.getAttribute("question");
    
    String answer =(String)request.getAttribute("correctAnswer");
    String result =(String)request.getAttribute("result");
    String userAnswer =(String)request.getAttribute("userAnswer");
    
%>

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
        <form action="./student/summary.jsp">
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
                    <td><%=answer%></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Summary"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
