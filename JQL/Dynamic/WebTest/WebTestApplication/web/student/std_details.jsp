<%
    
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Student Details</h1>
        <p>Please remember to enter the lecture ID in order to write the correct Test</p>
        <form action="./StudentDetailsServlet.do" method="POST">
            <table>
                <tr>
                    <td>STUDENT No.</td>
                    <td><input type="text" name="stdNo"></td>
                    
                </tr>
                <tr>
                   <td>Name</td>
                    <td><input type="text" name="name"></td>
                </tr>
                 <tr>
                    <td></td>
                    <td><input type="submit" value="Create Test"</td>
                </tr>
            </table>
        </form>
    </body>
</html>
