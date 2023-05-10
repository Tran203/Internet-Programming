<%@page import="za.ac.tut.entities.Person"%>
<%
    Person person = (Person)request.getAttribute("person");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remove Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>
            The person with ID: <b><%=person.getId()%></b> was removed
            Please click <a href="./menu.jsp">here</a> to go to menu
        </p>
    </body>
</html>
