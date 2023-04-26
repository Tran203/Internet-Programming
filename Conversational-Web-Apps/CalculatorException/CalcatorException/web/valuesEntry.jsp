<%
    String name = (String) session.getAttribute("name");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Values Page</title>
    </head>
    <body>
        <h1>Dear <%=name%>!</h1>
        <details>
            <summary>Please note</summary>
            <p>Complete your arithmatic calculation,by following instructions below.</p>
            <br>
            <ol>
                <li>Enter <b>First<b> number</li>
                <li>Enter <b>Second<b> number</li>
                <li>Enter <b>Arithmetic Operation<b></li>
            </ol>
        </details>
        
        <form action="ValueEntryServlet.do" method="POST">
            <table>
                <tr>
                    <td>First Number:</td>
                    <td><input type="text" name="num1"></td>
                </tr>
                <tr>
                    <td>Second Number:</td>
                    <td><input type="text" name="num2"></td>
                </tr>
                <tr>
                    <td><b>Arithmetic Operation( +, - , / , *)</b></td>
                    <td><input type="text" name="op"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="submit"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
