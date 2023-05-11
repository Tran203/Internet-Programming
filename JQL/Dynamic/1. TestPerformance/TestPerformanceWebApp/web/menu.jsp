<%-- 
    Document   : menu
    Created on : 11 May 2023, 4:09:39 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Menu</h1>
        <p>Please select one of the following actions below:</p>
        <ul>
            <li>Click <a href="add_student.jsp">here</a> to create student record</li>
            <li>Click <a href="GetTestPerformanceServlet.do">here</a> to view the class Test Performance</li>
            
            
            <li>Click <a href="get_student_using_id.jsp">here</a> to get student using ID</li>
            <li>Click <a href="get_student_using_names.jsp">here</a> to get student using Name and Surname</li>
            <li>Click <a href="get_students_using_age_range.jsp">here</a> to get a list of Student under a specific age criteria</li>
        </ul>
    </body>
</html>
