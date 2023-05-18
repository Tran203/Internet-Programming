<%@page import="za.ac.tut.entities.Items"%>
<%@page import="java.util.List"%>
<%
    List<Items> list = (List<Items>) request.getAttribute("item");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Page</title>
    </head>
    <body>
        <h1>Welcome Customer</h1>
        <p>
            Please select the items you willing to buy.
        </p>
        <form action="BuyItemsServlet.do" method="POST">
            <table>
                <caption>Menu</caption>
                <thead>
                    <tr>
                        <td>No</td>
                        <td>code</td>
                        <td>description</td>
                        <td>unit price</td>
                        <td>Quantity</td>
                    </tr>

                </thead>

                <tbody>
                    <%
                        for (int i = 0; i < list.size(); i++) {

                            Items item = list.get(i);
                            String code = item.getCode();
                            String description = item.getDescription();
                            Double unitPrice = item.getUnitPrice();
                            Double quantity = item.getQuantity();
                       
                    %>
                    <tr>
                        <td><%=item.getId()%></td>
                        <td><%=code%></td>
                        <td><%=description%></td>
                        <td><%=unitPrice%></td>
                        <td><%=quantity%></td>
                       
                    </tr>
                    <% 
                        }
                    %>
                </tbody>
            </table>
            <table border="1">
              
                <tbody>
         
                     <tr>
                        <td>ID:</td>
                        <td><input type="text" name="id"></td>
                    </tr>
                    
                     <tr>
                        <td>Quantity:</td>
                        <td><input type="text" name="quantity"></td>
                    </tr>
                      <td></td>
                        <td><input type="submit" value="BUY"></td>
                   
                </tbody>
            </table>

        </form>
    </body>
</html>
