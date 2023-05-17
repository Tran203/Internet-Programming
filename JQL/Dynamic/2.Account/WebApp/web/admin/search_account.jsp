<%-- 
    Document   : search_account
    Created on : 17 May 2023, 7:09:12 PM
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
        <h1>Hello World!</h1>
        <p>Enter the account number of the account to search for</p>
        <form action="../SearchAccount.do" method="POST">
            <table>
                <tr>
                    <td>ID:</td>
                    <td><input type="number" name="id"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Search"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
