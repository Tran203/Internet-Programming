<%-- 
    Document   : search_person
    Created on : 10 May 2023, 10:28:40 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Page</title>
    </head>
    <body>
        <h1>Search Person</h1>
        <p>Enter the details of the person to search for.</p>
        <form action="SearchPersonServlet.do" method="POST">
            <table>
                <tr>
                    <td>ID:</td>
                    <td><input type="text" name="id"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value=="Search"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
