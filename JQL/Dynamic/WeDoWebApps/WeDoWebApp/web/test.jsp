<%@page import="za.ac.tut.entities.Teacher"%>
<%
    //get our testDat
    Teacher t = (Teacher)request.getAttribute("testData");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Test Question Information</h1>
        <table>
                <tr>
                    <td>Question 1</td>
                    <td><%=t.getTestData().get(0).getQuestion()%></td>
                </tr>
                <tr>
                    <td>Answer To Question 1</td>
                    <td><%=t.getTestData().get(0).getAnswer()%></td>
                </tr>
                <tr>
                    <td>Question 2</td>
                    <td><%=t.getTestData().get(1).getQuestion()%></td>
                </tr>
                <tr>
                    <td>Answer To Question 2</td>
                    <td><%=t.getTestData().get(1).getAnswer()%></td>
                </tr>
            </table>
    </body>
</html>
