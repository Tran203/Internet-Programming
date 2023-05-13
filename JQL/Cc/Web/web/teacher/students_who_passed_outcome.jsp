<%@page import="za.ac.tut.entities.Student"%>
<%@page import="java.util.List"%>
<%
    List<Student> list = (List<Student>)request.getAttribute("list");
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
        <table>
            <%
                for(int i = 0; i < list.size(); i++){
                    Student std = list.get(i);
            %>
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
            <%
                 }
            %>
        </table>
    </body>
</html>
