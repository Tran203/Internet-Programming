<%-- 
    Document   : buy_tickets
    Created on : 27 Apr 2023, 4:00:46 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buy Tickets Page</title>
    </head>
    <body>
        <h1>You're about to Buy Tickets</h1>
        <p>
            Please enter the number of tickets you want  below.
        </p>
        <form action="BuyTicketsServlet.do" method="POST">
            <table>
                <tr>
                    <td>Number of tickets: </td>
                    <td><input type="number" name="numTickets"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" name="Buy"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
