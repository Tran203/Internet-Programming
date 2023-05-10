<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entities.Person"%>
<%
    List<Person> list = (List<Person>)request.getAttribute("list");
    
    Integer min = (Integer)request.getAttribute("min");
    Integer max = (Integer)request.getAttribute("max");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>The list below retrieves data between <%=min%> and <%=max%></p>
        <table>
            <%
                for(int i = 0; i < list.size(); i++){
                    Person p = list.get(i);
                    Long id  = p.getId();
                    String name = p.getName();
                    String surname = p.getSurname();
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
            <%
                }
            %>
        </table>
        
        <p>Please click <a href="./menu.jsp">here</a> to go to menu</p>
    </body>
</html>
