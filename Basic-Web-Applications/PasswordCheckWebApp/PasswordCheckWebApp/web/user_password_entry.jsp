<%
    String name = (String)request.getAttribute("name");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Password Entry Page</title>
    </head>
    <body>
        <h1>@<%=name%></h1>
        <form action="PasswordServlet.do" method="POST">
            <table>
                <tr>
                    <td>Please enter a password:</td>
                    <td><input type="text" name="password"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="submit"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
