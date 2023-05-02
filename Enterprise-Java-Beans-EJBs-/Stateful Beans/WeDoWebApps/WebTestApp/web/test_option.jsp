<%
    String name = (String)session.getAttribute("name");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test Option Page</title>
    </head>
    <body>
        <h1>Hello <%=name%></h1>
        <details>
            <summary><h2>Please see information below</h2></summary>
            <p>
                As a potential candidate you are required to complete a <em>Numeracy Test</em>
                <br><br>
                You can select the <em>Test of your <b>choice</b></em>.
            </p>
        </details>
        <form action="ChoiceServlet.do" method="POST">
            <table>
                <tr>
                    <td>Test Choice<td>
                    <td>
                        <select name="testOption">
                            <option>Addition</option>
                            <option>Subtraction</option>
                            <option>Division</option>
                            <option>Multiplication</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Submit"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
