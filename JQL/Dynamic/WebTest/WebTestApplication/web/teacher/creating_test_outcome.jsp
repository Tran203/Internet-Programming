<%
    String q = (String)request.getParameter("q");
    String ans = (String)request.getParameter("ans");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>Question <em><%=q%> with answer <b><%=ans%></b></em> has been created</p>
        <ul>
            <li>Click <a href="./teacher/create_test.jsp">here</a> to Add another question to the test</li>
            <li>Click <a href="./teacher/teacher_menu.jsp">here</a> to go to the Teacher's menu</li>
            <li>Click <a href="index.html">here</a> to go to Homepage</li>
        </ul>
    </body>
</html>
