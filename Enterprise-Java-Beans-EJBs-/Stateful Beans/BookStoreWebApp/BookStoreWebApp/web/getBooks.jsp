<%@page import="java.util.List"%>
<%@page import="za.ac.tut.ejb.bl.CartSBLocal"%>
<%
    CartSBLocal cart = (CartSBLocal) session.getAttribute("cart");
    List<String> books = cart.getBooks();
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get All Books Page</title>
    </head>
    <body>
        <h1>Get Books</h1>
        <p>
            The books available on the cart are <%=books%> <br>
            Click  <a href="menu.jsp">here</a> to go to the menu or <a href="index.html">here</a> to the main page.
        </p>
        <table>
            <thead>
                <tr>
                    <td>Book Name:</td>
                </tr>
            </thead>
            <tbody>
                <%for (String book : books) {%>
                <tr>
                    <td><%=book%></td>
                </tr>
                <% }%>
            </tbody>
        </table>
    </body>
</html>
