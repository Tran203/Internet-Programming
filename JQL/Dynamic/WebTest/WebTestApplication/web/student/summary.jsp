<%@page import="za.ac.tut.entities.StudentWork"%>
<%@page import="java.util.List"%>
<%
    Integer numQuestions = (Integer) session.getAttribute("numQuestions");

    Integer numCorrect = (Integer) session.getAttribute("numCorrect");
    Integer numWrong = (Integer) session.getAttribute("numWrong");

   
    String name = (String) session.getAttribute("name");

    //get User Data
    List<StudentWork> stdWork = (List<StudentWork>) session.getAttribute("stdWork");

    //calculate Final Results
    Double perResult = ((double) numCorrect / numQuestions) * 100;
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
        <p>Dear std please see your summary below</p>

        <table>
            <caption>Test Taken Information</caption>
            <thead>
                <tr>
                    <td>No.</td>
                    <td>Question</td>
                    <td>Your Answer</td>
                    <td>Actual Answer</td>
                    <td>Outcome</td>
                </tr>
            </thead>
            <tbody>
                <% for (StudentWork question : stdWork) {%>
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
            
            <p>Click <a href="./RecordStdDataServlet.do">here</a> to go to student menu</p>
    </body>
</html>
