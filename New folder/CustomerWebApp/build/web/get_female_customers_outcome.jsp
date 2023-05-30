<%-- 
    Document   : get_female_customers_outcome
    Created on : 04 May 2023, 9:56:44 AM
    Author     : Student
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entities.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get Female Customers Outcome Page</title>
    </head>
    <body>
        <h1>Get Female customers outcome</h1>
        <%
            List<Customer> customers = ( List<Customer>)request.getAttribute("customers");
        %>
        <p>
            Below is the list of all female customers.
        </p>
        <p>
            <table>
                <%
                    for(Customer c: customers){
                        Long id = c.getId();
                        String name = c.getName();
                        String surname = c.getSurname();
                        Integer age = c.getAge();
                        Character gender = c.getGender();
                        Boolean status = c.getStatus();
                        String contact = c.getContact().getContactValue();
                %>
                        <tr>
                            <td>ID:</td>
                            <td><%=id%></td>
                        </tr>
                        <tr>
                            <td>Name:</td>
                             <td><%=name%></td>
                        </tr>
                        <tr>
                            <td>Surname:</td>
                            <td><%=surname%></td>
                        </tr>
                        <tr>
                            <td>Age:</td>
                             <td><%=age%></td>
                        </tr>
                        <tr>
                            <td>Gender: </td>
                            <td><td><%=gender%></td></td>
                        </tr>
                        <tr>
                            <td>Is customer married? </td>
                            <td><td><td><%=status%></td>
                            </td>
                        </tr>
                        <tr>
                            <td>Contact:</td>
                            <td><td><%=contact%></td></td>
                        </tr>
                <%
                    }
                %>
            </table>
        </p>
        <p>
            Please click <a href="menu.jsp">here</a> to go back to the menu page or <a href="index.html">here</a> to the main page.
        </p>            
    </body>
</html>