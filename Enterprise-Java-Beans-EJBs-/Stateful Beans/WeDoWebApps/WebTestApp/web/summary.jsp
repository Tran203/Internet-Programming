<%@page import="za.ac.tut.model.QuestionHistory"%>
<%@page import="java.util.List"%>
<%@page import="za.ac.tut.ejb.bl.WebTestSBLocal"%>
<%
    Integer numQuestions = (Integer) session.getAttribute("numQuestions");
    Integer totQuestions = (Integer) session.getAttribute("totQuestions");

    Integer numCorrect = (Integer) session.getAttribute("numCorrect");
    Integer numWrong = (Integer) session.getAttribute("numWrong");

    String testOption = (String) session.getAttribute("testOption");
    String name = (String) session.getAttribute("name");
    String gender = (String) session.getAttribute("gender");

    //get User Data
    WebTestSBLocal record = (WebTestSBLocal) session.getAttribute("record");
    List<QuestionHistory> history = record.getHistory();

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
        <p>Dear <b><%=gender%></b> <em><%=name%></em>, please see your summary below</p>

        <table>
            <caption>Test Taken Information</caption>
            <thead>
                <tr>
                    <td>Q.Number</td>
                    <td>Question Asked</td>
                    <td>Your Answer</td>
                    <td>Actual Answer</td>
                    <td>Outcome</td>
                </tr>
            </thead>
            <tbody>
                <% for (QuestionHistory question : history) {%>
                <tr>
                    <td><%= question.getqNum()%></td>
                    <td><%= question.getQuestion()%></td>
                    <td><%= question.getUserAnswer()%></td>
                    <td><%= question.getAnswer()%></td>
                    <td>You were <b><%= question.getResult()%></b></td>
                </tr>
                <% }%>
        </table>

        <br><br>

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
