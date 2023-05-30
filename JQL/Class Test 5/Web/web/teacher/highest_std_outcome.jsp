<%@page import="za.ac.tut.entities.Student"%>
<%
    Student std =(Student)request.getAttribute("std");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Highest</h1>
        <table>
            <tr>
                <td>STUDENT No.</td>
                <td><%=std.getId()%></td>

            </tr>
            <tr>
                <td>Name</td>
                <td><%=std.getName()%></td>
            </tr>
            <tr>
                <td>Mark</td>
                <td><%=std.getMark()%></td>
            </tr>
        </table>
    </body>
</html>
