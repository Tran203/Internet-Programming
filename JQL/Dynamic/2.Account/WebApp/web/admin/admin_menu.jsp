<%-- 
    Document   : admin_menu
    Created on : 17 May 2023, 6:11:19 PM
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
        <h1>Hello Admin</h1>
        <p>Please select one of the following</p>
        <ul>
            <li>Click <a href="create_account.jsp">here</a> to create an account</li>
            <li>Click <a href="search_account.jsp">here</a> to Search for an account</li>
            <li>Click <a href="../DisplayAccountsServlet.do">here</a> to display all the accounts</li>
        </ul>
    </body>
</html>
