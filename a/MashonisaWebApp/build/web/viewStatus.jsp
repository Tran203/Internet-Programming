<%-- 
    Document   : viewStatus
    Created on : 17 May 2023, 11:18:07 AM
    Author     : Student
--%>

<%@page import="za.ac.tut.entities.Client"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Loan Status Page</title>
        <style>
            table {
                border-collapse: collapse;
                width: 100%;
            }

            th, td {
                text-align: left;
                padding: 8px;
                border-bottom: 1px solid #ddd;
            }

            th {
                background-color: #f2f2f2;
            }
        </style>
    </head>
    <body>
        <h1>Your Status</h1>
        <%
            Client client1 = (Client) session.getAttribute("client");
            String name = client1.getName();
            double amount = client1.getApplication().getLoanAmnt();
            String status = client1.getApplication().getStatus();
            Long id = client1.getApplication().getId();

            String msg = "";

            if (status.equalsIgnoreCase("PENDING")) {
                msg = "your requested amount is R" + amount;
            } else if (status.equalsIgnoreCase("Accept")) {
                msg = "you are currently owing R" + amount;
            }

            //calc loan information
            Double interest = 0.30;
            Double monthlyPay = 0.00;
            Double amt = 0.00;
            Integer numOfPayments = 1;
            //get numPayments
            if (client1.getApplication().getLoanTerm().equalsIgnoreCase("2 Months")) {
                numOfPayments = 2;
                interest = 0.35;
            } else if (client1.getApplication().getLoanTerm().equalsIgnoreCase("3 Months")) {
                numOfPayments = 3;
                interest = 0.40;
            }
            //cal loan total
            amt = amount + (amount * interest);
            monthlyPay = amt / numOfPayments;

        %>

        <p>
            Hi <b><%= name%></b>, <%=id%> your loan status is <b><%= status%></b> <b><%= msg%></b>. <br><br>
            <% if (status.equalsIgnoreCase("Accept")) {%>
        <table>
            <caption>Your Loan Information</caption>
            <tr>
                <td>Amount Requested</td>
                <td><input type="text" value="<%=client1.getApplication().getLoanAmnt()%>" readonly></td>
                <td>Loan Term</td>
                <td><input type="text" value="<%=client1.getApplication().getLoanTerm()%>" readonly></td>
            </tr>
            <tr>
                <td>Total Loan Amount</td>
                <td><input type="text" value="<%=amt%>" readonly></td>
                <td>Interest Rate</td>
                <td><input type="text" value="<%=interest*100%>" readonly></td>
            </tr>
            <tr>
                <td>Amount To Pay(*Monthly)</td>
                <td><input type="text" value="<%=monthlyPay%>" readonly></td>
                <td>Number of Payments</td>
                <td><input type="text" value="<%=numOfPayments%>" readonly></td>
            </tr> 
        </table>
        <% }%>
        Please click <a href="Clientmenu.jsp">here</a> to go back to the menu.
    </p>
</body>
</html>

