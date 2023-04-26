<!DOCTYPE html>
<html>
<head>
	<title>Calculator - Values Page</title>
	<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<div class="container">
		<h1>Values</h1>
		<p>Please Enter values to add</p>
		<form action="CalculatorServlet.do" method="POST">
			<table>
				<tr>
					<td>First Number:</td>
					<td><input type="text" name="num1"><td> 
				</tr>
				<tr>
					<td>Second Number:</td>
					<td><input type="text" name="num2"></td>
				</tr>
				<tr>
					<td>Calculation Method:</td>
					<td>
						<select name="calMethod">
							<option>ADD</option>
							<option>SUBTRACT</option>
							<option>MULTIPLY</option>
							<option>DIVIDE</option>
						</select>
					</td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Add"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>

