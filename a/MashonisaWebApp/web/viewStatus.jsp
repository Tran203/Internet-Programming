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

            String msg = "";

            if (status.equalsIgnoreCase("PENDING")) {
                msg = "your requested amount is R" + amount;
            } else if (status.equalsIgnoreCase("Accept")) {
                msg = "you are owing R" + amount;
            }
        %>

        <p>
            Hi <b><%= name %></b>, your loan status is <b><%= status %></b> <b><%= msg %></b>. <br><br>
            <% if (status.equalsIgnoreCase("Approved")) { %>
                <table>
                    <tr>
                        <th>Phone</th>
                        <th>Surname</th>
                    </tr>
                    <tr>
                        <td><%= client1.getSurname() %></td>
                    </tr>
                </table>
            <% } %>
            Please click <a href="Clientmenu.jsp">here</a> to go back to the menu.
        </p>
    </body>
</html>

