<%-- 
    Document   : viewApplicants
    Created on : 20 May 2023, 1:35:35 PM
    Author     : Student
--%>

<%@page import="za.ac.tut.entities.Client"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Application Page</title>
    </head>
    <body>
        <h1>Loan Application</h1>
        <%
            List<Client> listClient = (List<Client>) request.getAttribute("listClient");

        %>
        <p>
        <table>
            <thead>
                <tr>
                    <td>NAME:</td>
                    <td>SURNAME:</td>
                    <td>OCCUPATION:</td>
                    <td>INCOME AMOUNT:</td>
                    <td>LOAN AMOUNT:</td>
                    <td>LOAN TERM:</td>
                </tr>
            </thead>
            <%                for (int i = 0; i < listClient.size(); i++) {
                    Client client1 = listClient.get(i);

            %>
            <tr>
                    <td><%=client1.getName()%></td>
                    <td>SURNAME:</td>
                    <td>OCCUPATION:</td>
                    <td>INCOME AMOUNT:</td>
                    <td>LOAN AMOUNT:</td>
                    <td>LOAN TERM:</td>
                </tr>
            <%                }
            %>
        </table>

    </p>
</body>
</html>
