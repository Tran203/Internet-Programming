<%-- 
    Document   : add_customer
    Created on : 04 May 2023, 9:16:54 AM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Customer Page</title>
    </head>
    <body>
        <h1>Add customer</h1>
        <p>
            Please enter customer details below.
        </p>
        <form action="AddCustomerServlet.do" method="POST">
            <table>
                <tr>
                    <td>ID:</td>
                    <td><input type="text" name="id"/></td>
                </tr>
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name="name"/></td>
                </tr>
                <tr>
                    <td>Surname:</td>
                    <td><input type="text" name="surname"/></td>
                </tr>
                <tr>
                    <td>Age:</td>
                    <td><input type="text" name="age"/></td>
                </tr>
                <tr>
                    <td>Gender: </td>
                    <td>
                        <select name="gender">
                            <option value="M">Male</option>
                            <option value="F">Female</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Is customer married? </td>
                    <td>
                        <select name="status">
                            <option value="True">Yes</option>
                            <option value="False">No</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Contact:</td>
                    <td><input type="text" name="contact"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="SUBMIT"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
