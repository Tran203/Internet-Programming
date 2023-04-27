<%-- 
    Document   : request_deposit
    Created on : 27 Apr 2023, 4:54:31 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Deposit Page</title>
    </head>
    <body>
        <h1>Deposit</h1>
        <p>Please enter the amount to deposit below</p>
        <form action=""  method="POST">
            <table>
                <tr>
                    <td>Amount</td>
                    <td><input type="number" name="amt"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Deposit"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
