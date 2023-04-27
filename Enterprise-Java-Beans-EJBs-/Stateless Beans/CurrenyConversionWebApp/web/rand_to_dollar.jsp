<%-- 
    Document   : rand_to_dollar
    Created on : 27 Apr 2023, 3:09:39 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conversion Page</title>
    </head>
    <body>
        <h1>Rand To Dollar</h1>
        <p>
            <summary>Please enter the Rand amount below to convert.</summary>
        </p>
        <form action="" method="POST">
            <table>
                <tr>
                    <td>Rand Amount(R):</td>
                    <td><input type="number" name="amt"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Convert"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
