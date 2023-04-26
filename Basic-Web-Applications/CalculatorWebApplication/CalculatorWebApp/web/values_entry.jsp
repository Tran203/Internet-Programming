<%-- 
    Document   : values_entry
    Created on : 07 Mar 2023, 5:28:51 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Values Entry Page</title>
    </head>
    <body>
		<div class="container">
			<h1>Enter Values</h1>
			<p>Please enter values to perform arithmetic operations</p>
			<form action="CalculatorServlet.do" method="POST">
				<table>
					<tr>
						<td>1st Value:</td>
						<td><input type="text" name="num1"></td>
					</tr>
					<tr>
						<td>2nd Value:</td>
						<td><input type="text" name="num2"></td>
					</tr>
					<tr>
						<td></td>
								<td>
									<select name="operator">
										<option>+</option>
										<option>-</option>
										<option>*</option>
										<option>/<option>
										<option>None<option>
									 </select>
								</td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="submit"></td>
					</tr>
				</table>
			</form>
		</div>
    </body>
</html>
