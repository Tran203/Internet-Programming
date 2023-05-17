<%-- 
    Document   : accounts_over_specific_balance
    Created on : 17 May 2023, 8:00:31 PM
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
        <h1>Manager</h1>
        <p>Enter the minimum balance of the accounts to search for</p>
        <form action="../SearchAccountsUsingBalance.do" method="POST">
            <table>
                <tr>
                    <td>Balance:</td>
                    <td><input type="number" name="balance"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Search"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
