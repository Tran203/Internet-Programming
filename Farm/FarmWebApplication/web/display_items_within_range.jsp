<%-- 
    Document   : display_items_within_range
    Created on : 20 May 2023, 4:38:19 AM
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
        <p>Please enter the minimum and maximum amount of the order value you want to display</p>
        <form action="SearchOrderUsingRange.do" method="POST">
            <table>
                <tr>
                    <td>Minimum Amount:</td>
                    <td><input type="text" name="min"></td>
                </tr>
                <tr>
                    <td>Maximum Amount:</td>
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
