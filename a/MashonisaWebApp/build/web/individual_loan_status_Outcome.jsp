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
        <form action="ChangeStatusServlet.do" method="POST">
            <table>
                <caption>Client Information</caption>
                <tr>
                    <td>Name</td>
                    <td><input type="text" value="<%=client1.getName()%>" readonly></td>
                    <td>Surname</td>
                    <td><input type="text" value="<%=client1.getSurname()%>" readonly></td>
                </tr>
                <tr>
                    <td>Gender</td>
                    <td><input type="text" value="<%=client1.getGender()%>" readonly></td>
                    <td>Age</td>
                    <td><input type="text" value="<%=client1.getAge()%>" readonly></td>
                </tr>
                <tr>
                    <td>Cell No</td>
                    <td><input type="text" value="<%=client1.getCellNo()%>" readonly></td>
                    <td>Source of Income</td>
                    <td><input type="text" value="<%=client1.getOccupation()%>" readonly></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td><input type="text" value="<%=client1.getAddress()%>" readonly></td>
                </tr>
            </table>

            <br>

            <table>
                <caption>Client Requested Loan Application</caption>
                <tr>
                    <td>Pay Frequency</td>
                    <td><input type="text" value="<%=client1.getApplication().getIncomeType()%>" readonly></td>
                    <td>Income Amount</td>
                    <td><input type="text" value="<%=client1.getApplication().getIncomeAmt()%>" readonly></td>
                </tr>
                <tr>
                    <td>Amount Requested</td>
                    <td><input type="text" value="<%=client1.getApplication().getLoanAmnt()%>" readonly></td>
                    <td>Loan Term</td>
                    <td><input type="text" value="<%=client1.getApplication().getLoanTerm()%>" readonly></td>
                </tr>     
            </table>

            <br>
            <table>
                <caption>Respond to Client's Application</caption>
                <tr>
                    <td></td>
                    <td>Your response</td>
                    <td>
                        <select name="response">
                            <option>No Response</option>
                            <option>Accept</option>
                            <option>Reject</option>
                        </select>
                    </td>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <input type="hidden" name="clientId" value="<%=client1.getId()%>">
                    <td><input type="submit" value="Save"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
