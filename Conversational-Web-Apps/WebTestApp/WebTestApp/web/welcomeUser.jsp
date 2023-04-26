<%-- 
    Document   : welcomeUser
    Created on : 04 Mar 2023, 20:52:57
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Welcome Page</title>
    </head>
    <body>
        <%
           String name = session.getAtrribute("name");
           Intger numQuestions = Integer.parseInt(session.getAttribute("numQuestions"));
        %>
        <h1>Hello <%=name%></h1>
        <p>
            We have <b><%=numQuestions%></b> questions for you.<br>
            Please click <a href="QuestionServlet.do">here</a> to start the Test.
        </p>
    </body>
</html>
