<%-- 
    Document   : manager_menu
    Created on : 17 May 2023, 7:51:58 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Manager</h1>
        <p>Please select one of the following</p>
        <ul>
            <li>Click <a href="accounts_over_specific_balance.jsp">here</a> to view accounts over a specific balance</li>
            <li>Click <a href="search_account_using_holder.jsp">here</a> to Search for an account</li>
            <li>Click <a href="../DisplayAccountsServlet.do">here</a> to display all the accounts</li>
        </ul>
    </body>
</html>
