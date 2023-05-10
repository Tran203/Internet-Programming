<%
    Integer size = (Integer)request.getAttribute("size");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Size Page</title>
    </head>
    <body>
        <h1>Size</h1>
        <p>
            There are <%=size%> records
            Please click <a href="./menu.jsp">here</a> to go to menu
        </p>
    </body>
</html>
