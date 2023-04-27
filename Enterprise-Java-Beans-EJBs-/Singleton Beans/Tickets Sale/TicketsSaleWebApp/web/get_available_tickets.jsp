<%@page import="za.ac.tut.ejb.bl.TicketSaleSingletonLocal"%>
<%
    TicketSaleSingletonLocal counter = (TicketSaleSingletonLocal)session.getAttribute("counter");
    Integer availableTickets = counter.getAvailableTickets();
        
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outcome Page</title>
    </head>
    <body>
        <h1>Available Tickets</h1>
        <p>
            There are <b><%=availableTickets%></b> tickets available. <br><br>
            Please click <a href="menu.jsp">here</a> to go to the menu page or <a href="index.jsp">here</a> to the main page
        </p>
    </body>
</html>
