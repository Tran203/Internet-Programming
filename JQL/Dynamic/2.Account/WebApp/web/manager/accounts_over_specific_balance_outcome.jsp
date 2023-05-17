<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entities.Account"%>
<%
    List<Account> list = (List<Account>) request.getAttribute("list");
    Double amt = (Double)request.getAttribute("balance");
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
        <p>Please the details of the accounts with the balance greater or equal to R<%=amt%> below</p>
        <form action="./manager/manager_menu.jsp">
            <table>
                <caption>Accounts Details</caption>
                <thead>
                    <tr>
                        <td>Acc Number.</td>
                        <td>Holder Id.</td>
                        <td>Account Type</td>
                        <td>Balance</td>
                        
                    </tr>
                </thead>
                <tbody>
                <%
                    for (int i = 0; i < list.size(); i++) {
                        Account acc = list.get(i);
                %>
                <tr>
                    <td><%=acc.getId()%></td>
                    <td><%=acc.getAccountHlder().getId()%></td>
                    <td><%=acc.getAccountType()%></td>
                    <td>R<%=acc.getBalance()%></td>
                </tr>
                <%
                    }
                %>
                </tbody>
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
