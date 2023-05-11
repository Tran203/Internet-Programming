<%-- 
    Document   : get_student_using_names
    Created on : 11 May 2023, 4:32:19 PM
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
       <h1>Get Student Using Names</h1>
        <p>Please enter the Names of the student to get below</p>
        <form action="GetStudentUsingNamesServlet.do" method="POST">
            <table>
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td>Surname:</td>
                    <td><input type="text" name="surname"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Search"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
