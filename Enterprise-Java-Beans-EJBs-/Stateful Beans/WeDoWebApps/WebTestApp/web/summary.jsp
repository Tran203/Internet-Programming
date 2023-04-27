<%
    Integer numQuestions = (Integer) session.getAttribute("numQuestions");
    Integer totQuestions = (Integer) session.getAttribute("totQuestions");

    Integer numCorrect = (Integer) session.getAttribute("numCorrect");
    Integer numWrong = (Integer) session.getAttribute("numWrong");
    
    String testOption = (String)session.getAttribute("testOption");    
     //calculate
    Double result = ((double)numCorrect/totQuestions)* 100;
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
        <h1>Summary</h1>
        <h1>Test Result</h1>
        <table>
                <tr>
                    <td>Test Chosen</td>
                    <td><%=testOption%> compentacy  Test</td>
                </tr>
                <tr>
                    <td>Total Question Asked:</td>
                    <td><%=numQuestions%></td>
                </tr>
                <tr>
                    <td>Total Correct</td>
                    <td><%=numCorrect%></td>
                </tr>
                <tr>
                    <td>Total Wrong</td>
                    <td><%=numWrong%></td>
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
