<%
    String status = (String) request.getAttribute("status");
    String sbjName = (String) request.getAttribute("sbjName");
    Integer grade = (Integer) request.getAttribute("grade");
    Integer sbjAps = (Integer)request.getAttribute("sbjAps");
    String name = (String) session.getAttribute("name");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outcome Page</title>
    </head>
    <body>
        <h1>Hey <%=name%></h1>
        <p>
            Please see the outcome below:
        </p>
        <form action="subject_info_entry.jsp">
            <table>
                <tr>
                    <td>Subject Name:</td>
                    <td><%=sbjName%></td>
                </tr>
                <tr>
                    <td>Mark Obtained:</td>
                    <td><%=grade%></td>
                </tr>
                <tr>
                    <td>APS point obtained:</td>
                    <td><%=sbjAps%></td>
                </tr>
                <tr>
                    <td>Status:</td>
                    <td><%=status%></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Procced"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
