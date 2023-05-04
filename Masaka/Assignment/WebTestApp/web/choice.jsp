<%
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test Option Page</title>
    </head>
    <body>
        <h1>Hello</h1>
        <details>
          <p>
               Select the Test 
            </p>
        </details>
        <form action="ChoiceServlet.do" method="POST">
            <table>
                <tr>
                    <td>Test Choice<td>
                    <td>
                        <select name="choice">
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
