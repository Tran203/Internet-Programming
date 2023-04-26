<%-- 
    Document   : subject_info_entry
    Created on : 08 Mar 2023, 5:13:32 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Subject Entry Page</title>
    </head>
    <body>
        <%
            String name = (String)session.getAttribute("name");
            Integer numSbj = (Integer)session.getAttribute("numSbj");
            Integer count = (Integer)session.getAttribute("count");
        %>
        <h1>Hello <%=name%></h1>
        <p>
            Please enter details for subject <b>(<%=count%>)</b> of <%=numSbj%>
        </p>
        <form action="SubjectInfoServlet.do" method="POST">
            <table>
                <tr>
                    <td>Subject Name</td>
                    <td><input type="text" name="sbjName"></td>
                </tr>
                <tr>
                    <td>Subject Grade(%)</td>
                    <td><input type="text" name="grade"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="submit"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
