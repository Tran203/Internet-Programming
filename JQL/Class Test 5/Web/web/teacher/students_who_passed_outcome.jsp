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
        <h1>Students Who Passed</h1>
        <table>
            <caption>Students Who Passed</caption>
            <thead>
                <tr>
                    <td>STUDENT No.</td>
                    <td>Name</td>
                    <td>Mark</td>
                </tr>
            </thead>
            <%
                for(int i = 0; i < list.size(); i++){
                    Student std = list.get(i);
            %>
            <tr>
                
                <td><%=std.getId()%></td>
                <td><%=std.getName()%></td>
                <td><%=std.getMark()%></td>
            </tr>
            <%
                 }
            %>
        </table>
    </body>
</html>
