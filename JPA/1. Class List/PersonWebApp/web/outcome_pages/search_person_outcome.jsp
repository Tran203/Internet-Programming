<%@page import="za.ac.tut.entities.Person"%>
<%
    Person person = (Person)request.getAttribute("Person");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>
            <b><%=person.getName()%> <%=person.getSurname()%> [<%=person.getId()%>]</b>
        </p>
    </body>
</html>
