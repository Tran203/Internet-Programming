<%-- 
    Document   : get_female_customers
    Created on : 04 May 2023, 9:52:38 AM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get female Customer Page</title>
    </head>
    <body>
        <h1>Get female customers</h1>
        <p>
            Please click on the button below to get all the female customers.
        </p>
        <form action="GetFemaleCustomersServlet.do" method="GET">
            <table>
                <tr>
                    <td></td>
                    <td><input type="submit" value="GET ALL FEMALE CUSTOMERS"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
