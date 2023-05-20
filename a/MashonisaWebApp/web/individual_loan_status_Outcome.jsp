<%@page import="za.ac.tut.entities.Client"%>
<%
    Client client1 = (Client) session.getAttribute("client");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Client Loan Application Details</h1>
        <p>See the full details for client ()</p>
        <form>
            <table>
                <caption>Client Information</caption>
                <tr>
                    <td>Name</td>
                    <td>Surname</td>
                </tr>
                <tr>
                    <td>Gender</td>
                    <td>Age</td>
                </tr>
                <tr>
                    <td>Cell No</td>
                    <td>Source of Income</td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td></td>
                </tr>
            </table>

            <br>

            <table>
                <caption>Client Requested Loan Application</caption>
                <tr>
                    <td>Pay Frequency</td>
                    <td>Income R</td>
                </tr>
                <tr>
                    <td>Amount Requested</td>
                    <td>Loan Term</td>
                </tr>     
            </table>

            <br>
            <table>
                <caption>Respond to Client</caption>
                <tr>
                    <td>Your response</td>
                    <td>
                        <select name="response">
                            <option>No Response</option>
                            <option>Accept</option>
                            <option>Reject</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Save"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
