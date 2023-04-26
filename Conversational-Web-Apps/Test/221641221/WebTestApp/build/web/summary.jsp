<% 
    String name = (String) session.getAttribute("name");
    String choice = (String)session.getAttribute("choice");
    Integer wrong = (Integer) session.getAttribute("wrong");
    Integer correct = (Integer) session.getAttribute("correct");
    Integer totQuestions = 5;
    
    //calculate
    Double result = ((double)correct/totQuestions)* 100;
    String msg = "Congratulations, You've qualify for the next round";
    
    if(result < 70.00){
        msg = "Sorry, You've failed the test";
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Summary Page</title>
    </head>
    <body>
        <h1>Hello <b><%=name%>!</b></h1>
        <p>Please see your test result below:</p>
        <table>
                <tr>
                    <td>Name:</td>
                    <td><%=name%></td>
                </tr>
                <tr>
                    <td>Test Chosen</td>
                    <td><%=choice%> compentacy  Test</td>
                </tr>
                <tr>
                    <td>Total Question Asked:</td>
                    <td>5</td>
                </tr>
                <tr>
                    <td>Total Correct</td>
                    <td><%=correct%></td>
                </tr>
                <tr>
                    <td>Total Wrong</td>
                    <td><%=wrong%></td>
                </tr>
                <tr>
                    <td>Result:</td>
                    <td><%=result%>%</td>
                </tr>
                <tr>
                    <td>Status:</td>
                    <td><%=msg%></td>
                </tr>
            </table>
    </body>
</html>
