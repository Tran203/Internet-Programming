<%-- 
    Document   : create_test
    Created on : 12 May 2023, 12:09:19 AM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Creating a Test</h1>
        <p>Enter both the question and answer, for each question</p>
        <form action="CreateTestServlet.do" method="POST">
            <table>
                <thead>
                    <tr>
                        <td>No.</td>
                        <td>Question</td>
                        <td>Answer</td>
                    </tr>
                </thead>
                <tr>
                    <td>1.</td>
                    <td><input type="text" name="q1"></td>
                    <td><input type="text" name="ans1"></td>
                </tr>
                 <tr>
                    <td>2.</td>
                    <td><input type="text" name="q2"></td>
                    <td><input type="text" name="ans2"></td>
                </tr>
                 <tr>
                    <td></td>
                    <td></td>
                    <td><input type="submit" value="Create Test"</td>
                </tr>
            </table>
        </form>
    </body>
</html>
