<%@page import="za.ac.tut.entities.Account"%>
<%
    Account acc = (Account)request.getAttribute("account");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Admin</h1>
        <p>Please the details of the account below:</p>
        <form action="./admin/admin_menu.jsp">
            <table>
                <caption>Account Details</caption>
                <tr>
                    <td>Account Type:</td>
                    <td><%=acc.getAccountType()%></td>
                </tr>
                <tr>
                    <td>Balance:</td>
                    <td>R<%=acc.getBalance()%></td>
                </tr>
            </table>
                <br>
            <table>
                <caption>Holder Details</caption>
                <tr>
                    <td>ID:</td>
                    <td><%=acc.getAccountHlder().getId()%></td>
                </tr>
                <tr>
                    <td>Name:</td>
                    <td><%=acc.getAccountHlder().getName()%></td>
                </tr>
                <tr>
                    <td>Surname:</td>
                    <td><%=acc.getAccountHlder().getSurname()%></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Menu"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
