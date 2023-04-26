package za.ac.tut.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Student
 */
public class UserDetailServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //get user details
        String username = request.getParameter("name");
        
        //passback to the session
        request.setAttribute("name", username);
        
        //Request Dipatcher
        RequestDispatcher disp = request.getRequestDispatcher("user_password_entry.jsp");
        disp.forward(request, response);
    }

}
