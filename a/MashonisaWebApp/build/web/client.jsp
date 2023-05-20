<%-- 
    Document   : client
    Created on : 17 May 2023, 10:27:53 AM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Client Page</title>
    </head>
    <body>
       <h1> Welcome </h1>
       
       <p>Please enter your details to log in :</p>    
    
       <form action="clientServlet.do" method="POST">
           <table>
               <tr>
                   <td>Username :</td>
                   <td><input type="text" name="username"></td>
               </tr>
               
               <tr>
                   <td>Password :</td>
                   <td><input type="text" name="password"></td>
               </tr>
               
                <tr>
                   <td>ID number :</td>
                   <td><input type="text" name="id"></td>
               </tr>
               
               <tr>
                   <td></td>
                   <td><input type="submit" value="LOG IN"></td>
               </tr>
           </table>
       </form>
    </body>
</html>
