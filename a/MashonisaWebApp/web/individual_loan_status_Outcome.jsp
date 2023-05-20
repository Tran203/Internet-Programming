<%@page import="za.ac.tut.entities.Client"%>
<%
    Client client1 =(Client)session.getAttribute("client");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Client Details</h1>
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
            </table>
        </form>
    </body>
</html>
