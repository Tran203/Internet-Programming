<%-- 
    Document   : option
    Created on : 02 Mar 2023, 13:20:43
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Option Page</title>
    </head>
    <body>
        <h1>Options</h1>
        <p>Select how would you like to view income generated by the Rental Properties.</p>
        <form action="RentalPropertyServlet.do" method="POST">
            <table>
                <tr>
                    <td>Area code:</td>
                    <td>
                        <select name="areaCode">
                            <option>None</option>
                            <option>GA</option>
                            <option>SO</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Month:</td>
                    <td>
                        <select name="monthCode">
                            <option>None</option>
                            <option>JAN</option>
                            <option>FEB</option>
                            <option>MAR</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="submit"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
