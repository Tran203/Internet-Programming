<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entities.AccountHolder"%>
<% 
    List<AccountHolder> list = (List<AccountHolder>) request.getAttribute("list");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>View ALL</h1>
        <p>The following is the list of all records available on the database</p>
        <table>
            <%
                for(int i = 0; i < list.size(); i++){
                    AccountHolder ah = list.get(i);
            %>
            <tr>
                <td>ID:</td>
                <td><%=ah.getId()%></td>
            </tr>
            <tr>
                <td>Full Name:</td>
                <td><%=ah.getName()%></td>
            </tr>
            <tr>
                <td>City:</td>
                <td><%=ah.getStreet()%></td>
            </tr>
            <tr>
                <td>Code:</td>
                <td><%=ah.getCode()%></td>
            </tr>
            <tr>
                <td>Cell No:</td>
                <td><%=ah.getCellNo()%></td>
            </tr>
            <tr>
                <td>Email Address:</td>
                <td><%=ah.getEmailAddress()%></td>
            </tr>
            <%
                 }
            %>
        </table>
        
        <p>Click <a href="menu.jsp">here</a> to return to the menu</p>
    </body>
</html>
