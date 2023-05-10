<%-- 
    Document   : add_accountHolder
    Created on : 11 May 2023, 12:20:46 AM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Account Page</title>
    </head>
    <body>
        <h1>Add ACCOUNT</h1>
        <p>Please enter the account details  below</p>
        <form action="AddHolderServlet.do" method="POST">
            <table>
                <tr>
                    <td>ID:</td>
                    <td><input type="text" name="id"></td>
                </tr>
                <tr>
                    <td>Full Name:</td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td>City:</td>
                    <td><input type="text" name="city"></td>
                </tr>
                <tr>
                    <td>Code:</td>
                    <td><input type="text" name="code"></td>
                </tr>
                <tr>
                    <td>Cell No:</td>
                    <td><input type="text" name="cellNo"></td>
                </tr>
                <tr>
                    <td>Email Address:</td>
                    <td><input type="email" name="email"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Add"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
