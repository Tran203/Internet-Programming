<%@page import="za.ac.tut.entities.Client"%>
<%
    Client client1 = (Client) session.getAttribute("client");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Client Menu Page</title>
    </head>
    <body>
        <h1>Menu</h1>
        <p>
            Please select one of the following menu options to begin
        </p>     
        <%
            if (client1.getApplication().getStatus().equalsIgnoreCase("None")) {
        %>
        <ul>
            <li>Click <a href="takeLoan.jsp"/>here</a>To take a loan</li>
        </ul>
        <%} else if (client1.getApplication().getStatus().equalsIgnoreCase("PENDING")) {%>
        <ul>
            <li>Click <a href="viewStatus.jsp"/>here</a>To view your loan status</li>
        </ul>
        <%}else if (client1.getApplication().getStatus().equalsIgnoreCase("Rejected")) {%>
        <ul>
            <li>Click <a href="viewStatus.jsp"/>here</a>To view your loan status</li>
            <li>Click <a href="takeLoan.jsp"/>here</a>To take a loan</li>
        </ul>
        <%}else {%>
        <ul>
            <li>Click <a href="viewStatus.jsp"/>here</a>To view your loan status</li>
            <li>Click <a href="payLoan.jsp"/>here</a>To pay your loan</li>
        </ul>
        <%}%>

    </body>
</html>
