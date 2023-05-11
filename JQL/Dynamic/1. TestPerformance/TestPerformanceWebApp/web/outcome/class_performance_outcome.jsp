<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entities.Student"%>
<%
    List<Student> list = (List<Student>) request.getAttribute("list");
    Integer totInClass = (Integer) request.getAttribute("totInClass");

    Double lowestMark = (Double) request.getAttribute("lowestMark");
    Double highestMark = (Double) request.getAttribute("highestMark ");
    Double avgMark = (Double) request.getAttribute("avgMark");

    Integer cntPassed = (Integer) request.getAttribute("cntPassed");
    Integer cntFailed = (Integer) request.getAttribute("cntFailed");

    Integer cntMales = (Integer) request.getAttribute("cntMales");
    Integer cntFemales = (Integer) request.getAttribute("cntFemales");

    Integer cntFailedMale = (Integer) request.getAttribute("cntFailedMale");
    Integer cntPassedMale = (Integer) request.getAttribute("cntPassedMale");

    Integer cntFailedFemale = (Integer) request.getAttribute("cntFailedFemale");
    Integer cntPassedFemale  = (Integer) request.getAttribute("cntPassedFemale ");
%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Class Performance</h1>
        <p>Please see the class performance below:</p>
        <table>

        </table>


        <p><b>Class List</b></p>
        <table>
            <%
                for (int i = 0; i < list.size(); i++) {
                    Student std = list.get(i);
            %>
            <tr>
                <td>Name:</td>
                <td><%=std.getName()%></td>
            </tr>
            <tr>
                <td>Surname:</td>
                <td><%=std.getSurname()%></td>
            </tr>
            <tr>
                <td>Gender:</td>
                <td><%=std.getGender()%></td>
            </tr>
            <tr>
                <td>Age:</td>
                <td><%=std.getAge()%></td>
            </tr>
            <tr>
                <td>Mark Obtained:</td>
                <td><%=std.getPercMark()%></td>
            </tr>
            <%
                }
            %>
        </table>
    </body>
</html>
