<html>
 <head>
	<title>Sum Values Page</title>
 </head>
 <body>
	<h1>Values To Add</h1>
	<p>
		Please enter the numbers to add:
	</p>
	<form action="AdditionServlet.do" method="POST">
		<table>
			<tr>
				<td>First Number:</td>
				<td><input type="text" name="num1" /></td>
			</tr>
			<tr>
				<td>Second Number:</td>
				<td><input type="text" name="num2" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add" /></td>
			</tr>
		</table>
	</form>
 </body>
</html>