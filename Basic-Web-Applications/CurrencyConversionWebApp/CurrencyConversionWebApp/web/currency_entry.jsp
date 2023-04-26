<%-- 
    Document   : currency_entry
    Created on : 04 Mar 2023, 12:23:41
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Currency Conversion Entry Page</title>
    </head>
    <body>
        <h1>Currency Convertor</h1>
        <p>
            <h1>Steps to follow:<h1>
            <ol>
                <li>Enter the amount you want to convert</li>
                <li>Select the conversion rate</li>
           </ol>
        </p>
        <form action="ConversionServlet.do" method="POST">
            <table>
                <tr>
                    <td>Amount TO convert:</td>
                    <td><input type="text" name="amt"></td>
                </tr>
                <tr>
					<td>Conversion rate:</td>
					<td>
						<select name="rate">
                        <option>Zar to Usd</option>
                        <option>Usd to Zar</option>
						</select>
					</td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="submit"></td>
				</tr>
            </table>
        </form>        
    </body>
</html>
