
<%
   Integer numTickets = (Integer)request.getAttribute("numTicket");
   Integer numTicketsIssued = (Integer)request.getAttribute("numTicketsIssued");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outcome Page</title>
    </head>
    <body>
        <h1>Tickets Purchase Outcome</h1>
        <p>
            You requested <b><%=numTickets%></b> tickets, and <b><%=numTicketsIssued%></b> were issued to you.<br><br>
            Please click <a href="menu.jsp">here</a> to go to the menu page or <a href="index.jsp">here</a> to the main page
        </p>
    </body>
</html>
