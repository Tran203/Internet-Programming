<%
    String name = (String)session.getAttribute("name");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Start Page</title>
    </head>
    <body>
        <h1>Hi <%=name%></h1>
        <p>Please select the numeracy test of your choice.</p>
        <form action="ChoiceServlet.do" method="POST">
            <table>
                <tr>
                    <td>Test Choice</td>
                    <td>
                        <select name="operator">
                            <option>Addition</option>
                            <option>Multiplication</option>
                            <option>Division</option>
                            <option>Subtraction</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" name="submit"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
