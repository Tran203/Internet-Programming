<%-- 
    Document   : removeBook
    Created on : 26 Apr 2023, 9:41:23 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>Remove Book Page</title>
    </head>
    <body>
        <h1>Remove Book</h1>
        <p>Please remove a book</p>
        <form action="RemoveBookServlet.do" method="POST">
            <table>
                <tr>
                    <td>Book Name:</td>
                    <td><input type="text" name="bookName" ></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="ADD" ></td>
                </tr>
            </table>
        </form>
    </body>
</html>
