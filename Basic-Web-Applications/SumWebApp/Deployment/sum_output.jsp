<html>
<head>
 <title>Sum Output page</title>
</head>

<body>
 <h1>Sum</h1>
 <%--Use scriplet to display collected and calculated data--%>
 <%
	Integer num1 = Integer.parseInt(request.getParameter("num1"));
	Integer num2 = Integer.parseInt(request.getParameter("num2"));
	Integer sum = num1 + num2;
 %>
 <p>
	The sum of <%=num1%> and <%=num2%> is <%=sum%>
 </p>
 
 
</body>

</html>