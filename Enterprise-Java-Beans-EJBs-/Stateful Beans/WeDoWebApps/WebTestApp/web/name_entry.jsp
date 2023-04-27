<%-- 
    Document   : name_entry
    Created on : 27 Apr 2023, 11:58:12 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Name Entry Page</title>
    </head>
    <body>
        <h1>Hello Potential Employee!</h1>
        <p>Please fill in your information below</p>
        <form action="NameEntryServlet.do" method="POST">
            <table>
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name="name" required></td>
                </tr>
                <tr>
                    <td>Gender</td>
                    <td>
                        <select name="gender">
                            <option>Female</option>
                            <option>Male</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Submit"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
