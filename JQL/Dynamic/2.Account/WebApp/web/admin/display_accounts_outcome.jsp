<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entities.Account"%>
<%
    List<Account> list = (List<Account>) request.getAttribute("list");
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
                <caption>Accounts Details</caption>
                <thead>
                    <tr>
                        <td>Acc No.</td>
                        <td>Type</td>
                        <td>Balance</td>
                        <td>Holder Id.</td>
                        <td>Holder Name</td>
                        <td>Holder Surname</td>
                    </tr>
                </thead>
                <%
                    for (int i = 0; i < list.size(); i++) {
                        Account acc = list.get(i);
                %>
                <tr>
                    <td><%=acc.getId()%></td>
                    <td><%=acc.getAccountType()%></td>
                    <td>R<%=acc.getBalance()%></td>
                    <td><%=acc.getAccountHlder().getId()%></td>
                    <td><%=acc.getAccountHlder().getName()%></td>
                    <td><%=acc.getAccountHlder().getSurname()%></td>
                </tr>
                <%
                    }
                %>
            </table>
            <table>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Menu"></td>
                </tr>

            </table>
        </form>
    </body>
</html>
