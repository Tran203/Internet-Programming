<%@page import="za.ac.tut.ejb.bl.AccountTransactionSingletonLocal"%>
<%
    AccountTransactionSingletonLocal bank = ( AccountTransactionSingletonLocal)session.getAttribute("bank");
    Double balance =bank.checkBalance();
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outcome Page</title>
    </head>
    <body>
        <h1>Check Balance</h1>
        <p>
            The amount <b>R<%=balance%></b> is available.
            <br><br>
            Please click <a href="menu.jsp">here</a> to go to the menu page or <a href="index.html">here</a> to the main page.
        </p>
    </body>
</html>
