<%-- 
    Document   : get_students_using_age_range
    Created on : 11 May 2023, 4:33:57 PM
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
       <h1>Get Student Using Age Criteria</h1>
        <p>Please enter the min and max age  of the students to get below</p>
        <form action="GetStudentsUsingAgeServlet.do" method="POST">
            <table>
                <tr>
                    <td>Min:</td>
                    <td><input type="text" name="min"></td>
                </tr>
                <tr>
                    <td>Max:</td>
                    <td><input type="text" name="max"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Search"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
