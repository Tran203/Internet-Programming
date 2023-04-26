<%-- 
    Document   : output
    Created on : 04 Mar 2023, 12:58:42
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Output Page</title>
    </head>
    <body>
        <h1>Result:</h1>
        <%
            String rate = request.getAttribute("rate");
            Double result = Double.parseDouble(request.getAtrribute("result"));
        %>
        <p>
            You opted a conversion rate from <%=rate%> <br>
            You now have:
        </p>
        <table>
            <td><%=result%></td>
            <td></td>
        </table>
    </body>
</html>
