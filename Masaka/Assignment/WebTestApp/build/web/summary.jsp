<%
    Integer numQuestions = (Integer) session.getAttribute("numQuestions");
    Integer totQuestions = (Integer) session.getAttribute("totQuestions");
    Integer numCorrect = (Integer) session.getAttribute("numCorrect");
    Integer numWrong = (Integer) session.getAttribute("numWrong");
    String testOption = (String) session.getAttribute("choice");
    String name = (String) session.getAttribute("name");

    //calculate Final Results
    Double perResult = ((double) numCorrect / totQuestions) * 100;
    String msg = "Congratulations, You've qualify for the next round";

    if (perResult < 70.00) {
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
        <p>Please see your summary below</p>

       
        <table>
            <caption>Test Results</caption>
            <tr>
                <td>Test Chosen</td>
                <td><%=testOption%> Test</td>
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
                <td><%=perResult%>%</td>
            </tr>
            <tr>
                <td>Status:</td>
                <td><b><%=msg%></b></td>
            </tr>
        </table>
    </body>
</html>
