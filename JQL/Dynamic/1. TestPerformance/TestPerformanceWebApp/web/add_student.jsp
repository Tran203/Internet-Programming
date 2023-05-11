<%-- 
    Document   : add_student
    Created on : 11 May 2023, 4:15:46 PM
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
        <h1>Record Student Data</h1>
        <p>Please enter the student Test result</p>
        <form action="AddStudentServlet.do" method="POST">
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
                    <td>Gender:</td>
                    <td>
                        <select name="gender">
                            <option vale="M">Male</option
                            <option valuer="F">Female</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Age:</td>
                    <td><input type="number" name="age"></td>
                </tr>
                <tr>
                    <td>Mark Obtained:</td>
                    <td><input type="number" name="mark"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" name="Add"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
