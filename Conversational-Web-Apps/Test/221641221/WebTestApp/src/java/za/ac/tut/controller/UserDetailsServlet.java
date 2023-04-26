/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Student
 */
public class UserDetailsServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Validate session
        HttpSession session = request.getSession(true);
        //get user details
        String name = request.getParameter("name");
        
        //pass name to session
        session.setAttribute("name", name);
        
        //reuquestD ipatcher
        RequestDispatcher disp = request.getRequestDispatcher("userChoice.jsp");
        disp.forward(request, response);
    }

}
