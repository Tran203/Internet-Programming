<%@page import="za.ac.tut.entities.AccountHolder"%>
<%
    AccountHolder ah = (AccountHolder) request.getAttribute("ah");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Search Account</h1>
        <p>See the account information below:</p>
        <table>
            <tr>
                <td>ID:</td>
                <td><%=ah.getId()%></td>
            </tr>
            <tr>
                <td>Full Name:</td>
                <td><%=ah.getName()%></td>
            </tr>
            <tr>
                <td>City:</td>
                <td><%=ah.getStreet()%></td>
            </tr>
            <tr>
                <td>Code:</td>
                <td><%=ah.getCode()%></td>
            </tr>
            <tr>
                <td>Cell No:</td>
                <td><%=ah.getCellNo()%></td>
            </tr>
            <tr>
                <td>Email Address:</td>
                <td><%=ah.getEmailAddress()%></td>
            </tr>
        </table>

        <p>Click <a href="menu.jsp">here</a> to return to the menu</p>
    </body>
</html>
