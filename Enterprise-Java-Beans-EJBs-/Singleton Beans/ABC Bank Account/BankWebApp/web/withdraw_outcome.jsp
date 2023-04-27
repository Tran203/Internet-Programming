<%
  Double amt = (Double)request.getAttribute("amt");
  Double amtGot = (Double)request.getAttribute("amtGot");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outcome Page</title>
    </head>
    <body>
        <h1>WITHDRAW Outcome</h1>
        <p>
            The amount <b>R<%=amt%></b> was requested, and <b>R<%=amtGot%></b> was withdrawn.
            <br><br>
            Please click <a href="menu.jsp">here</a> to go to the menu page or <a href="index.html">here</a> to the main page.
        </p>
    </body>
</html>
