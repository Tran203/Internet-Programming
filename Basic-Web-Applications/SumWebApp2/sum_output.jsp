<html>
 <head>
	<title>Sum Page</title>
 </head>
 <body>
	<h1>Sum</h1>
	
	<%-- scriplet --%>
	<%-- Remember now we are getting the values from the objects(attribute) --%>
	<%
		Integer num1 = (Integer)request.getAttribute("num1");
		Integer num2 = (Integer)request.getAttribute("num2");
		Integer sum = (Integer)request.getAttribute("sum");
	%>
	
	<p>
		The sum of <%=num1%> and <%=num2%> is <%=sum%>.
	</p>
 </body>
</html>