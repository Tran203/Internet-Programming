<%-- 
    Document   : output
    Created on : 07 Mar 2023, 6:10:22 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outcome Page</title>
    </head>
    <body>
		<div class="container">
			<h1>Outcome</h1>
			<%
				Integer num1 = (Integer)request.getAttribute("num1");
				Integer num2 = (Integer)request.getAttribute("num2");
				Character op = (Character)request.getAttribute("op");
				String result = (String)request.getAttribute("result");
			%>
			<p>
				<%=num1%> <%=op%> <%=num2%> = <%=result%>.
				<br>
				Please click <a href="index.html">here</a> to go back to the main page.
			</p>
		</div>
    </body>
</html>
