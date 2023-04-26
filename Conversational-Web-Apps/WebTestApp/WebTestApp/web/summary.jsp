<%-- 
    Document   : summary
    Created on : 05 Mar 2023, 13:26:00
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Outcome</h1>
        <%
            String name = session.getAttribute("name");
            Integer numQuestions = session.getAttribute("numQuestions");
            Intger numCorrect = session.getAttribute("numCorrect");
            
            DecimalFormat df =new DecimalFormat("0");
            Double perMark = Double.parseDouble(numCorrect/ numQuestions) * 100;
        %>
        <p>Hi <%=name%>, below is the test summary:</p>
        <table>
            <tr>
                <td>Number of questions asked:</td>
                <td><%=numQuestion%></td>
            </tr>
            <tr>
                <td>Number of question correctly answered::</td>
                <td><%=numCorrect%></td>
            </tr>
            <tr>
                <td>Percentage mark obtained:</td>
                <td><%=perMark%></td>
            </tr>
        </table>
            <p>Please <a href="EndSessionServlet.do">click here</a> to go back to the main page</p>
    </body>
</html>
