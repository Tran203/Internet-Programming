<% 
    Double rand = (Double)request.getAttribute("rand");
    Double dollar = (Double)request.getAttribute("dollar");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outcome Page</title>
    </head>
    <body>
        <h1>Rand Outcome</h1>
        <p>
            <b>$<%=dollar%></b> is equivalent to <b>R<%=rand%></b><br>
            Please click <a href="menu.jsp">here</a> to return to the menu page or <a href="index.jsp">here</a> to main page
        </p>
    </body>
</html>
