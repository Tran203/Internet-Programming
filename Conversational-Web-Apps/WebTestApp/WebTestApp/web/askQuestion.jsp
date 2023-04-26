<html>
	<head>
		<title>Question</title>
	</head>
	<body>
		<%
			String question = request.getAttribute("question");
			Interger count = session.getAttribute("count");
			Interger numQuestions = session.getAttribute("numQuestions");
		%>
		<h1>Question <%=count%> of <%=numQuestions%> </h1>
		<p>Please ansewer the following question.</p>
		<form action="AnswerServlet.do" mmethod="POST">
			<table>
				<tr>
					<td>Question:<td>
					<td><%=question%></td>
				</tr>				
				<tr>
					<td>Answer:</td>
					<td><input type="text" name="answer"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="submit"></td>
				</tr>
			</table>
		</form>
	</body>
</html>