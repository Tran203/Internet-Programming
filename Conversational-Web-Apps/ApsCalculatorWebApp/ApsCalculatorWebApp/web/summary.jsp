<%
    Integer aps = (Integer)session.getAttribute("apsCount");
    Integer numSbj = (Integer)session.getAttribute("numSbj");
    String name = (String) session.getAttribute("name");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Summary Page</title>
    </head>
    <body>
        <h1>Hello <%=name%>!</h1>
        <p>Please see the summary below:</p>
        <table>
            <tr>
                <td>Number of Subjects</td>
                <td><%=numSbj%></td>
            </tr>
            <tr>
                <td>Aps Score:</td>
                <td><%=aps%></td>
            </tr>
        </table>
    </body>
</html>
