<%
    Long stdNo = (Long)session.getAttribute("stdNo");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello <%=stdNo%></h1>
        <form action="AskQuestionServlet.do" method="POST">
            <table>
                <tr>
                    <td><input type="submit" value="Start"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
