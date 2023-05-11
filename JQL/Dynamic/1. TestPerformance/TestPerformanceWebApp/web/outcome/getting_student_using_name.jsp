<%@page import="za.ac.tut.entities.Student"%>
<%
    Student std = (Student)request.getAttribute("std");
    
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Getting Student Using Names Outcome</h1>
        <p>See the details of the student obtained below</p>
        <table>
                <tr>
                    <td>Name:</td>
                    <td><%=std.getName()%></td>
                </tr>
                <tr>
                    <td>Surname:</td>
                    <td><%=std.getSurname()%></td>
                </tr>
                <tr>
                    <td>Gender:</td>
                    <td><%=std.getGender()%></td>
                </tr>
                <tr>
                    <td>Age:</td>
                    <td><%=std.getAge()%></td>
                </tr>
                <tr>
                    <td>Mark Obtained:</td>
                    <td><%=std.getPercMark()%></td>
                </tr>
            </table>
        
        <p> Please click <a href="./menu.jsp">here</a> to go to menu</p>
    </body>
</html>
