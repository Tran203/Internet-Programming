<%-- 
    Document   : request_withdraw
    Created on : 27 Apr 2023, 4:58:07 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Withdrawal Page</title>
    </head>
    <body>
        <h1>Withdraw</h1>
        <p>Please enter the amount to withdraw below</p>
        <form action="WithdrawServlet.do"  method="POST">
            <table>
                <tr>
                    <td>Amount</td>
                    <td><input type="number" name="amt"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Withdraw"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
