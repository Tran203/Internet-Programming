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
    </head>
    <body>
        <h1>Your Status</h1>
        <%
            Client client1 =(Client)session.getAttribute("client");
            String name = client1.getName();
            double amount = client1.getApplication().getLoanAmnt();
            String status = client1.getApplication().getStatus();
            
            String msg = "";
            
            if((status.equalsIgnoreCase("PENDING"))){
                msg = "your requested amount is R" + amount;
            }else if(status.equalsIgnoreCase("Approved")){
                msg = "you are owing R" + amount; 
            }
        %>
        
        <p>
            Hi <b><%=name%></b>, your loan status is <b><%=status%></b>  <b><%=msg%></b>. <br><br>
           Please click <a href="Clientmenu.jsp">here</a> to go back to the menu.
        </p>
    </body>
</html>
