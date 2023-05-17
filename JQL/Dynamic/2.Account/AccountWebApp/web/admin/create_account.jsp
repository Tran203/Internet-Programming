<%-- 
    Document   : create_account
    Created on : 17 May 2023, 6:12:45 PM
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
        <h1>Create Account</h1>
        <p>Fill in the form to create a account</p>
        <form>
            <table>
                <caption>Account Holder Details</caption>
                <tr>
                    <td>ID:</td>
                    <td><input type="number" name="id"></td>
                </tr>
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td>Surname:</td>
                    <td><input type="text" name="surname"></td>
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
                    <td>Age</td>
                    <td><input type="number" name="age"></td>
                </tr>
                <tr>
                    <td>Date of Birth:</td>
                    <td><input type="date" name="dob"></td>
                </tr>
                <tr>
                    <td>Marital Status</td>
                    <td>
                        <select name="status">
                            <option>Single</option>
                            <option>Married</option>
                        </select>
                    </td>
                </tr>
            </table>
            <table>
                <caption>Account Details</caption>
                <tr>
                    <td></td>
                    <td>
                        <select name="type">
                            <option>Savings</option>
                            <option>Debit</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Balance:</td>
                    <td><input type="number" name="balance"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" name="Create Account"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
