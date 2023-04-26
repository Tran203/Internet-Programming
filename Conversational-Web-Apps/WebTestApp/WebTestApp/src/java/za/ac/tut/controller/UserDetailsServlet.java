/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class UserDetailsServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        //Validate Session
        HttpSession session = request.getSession(true);
        //get User's Details
        String name = request.getParameter("name");
        //store the name in the session
        session.setAttribute("name",name);
        //RquestDispatcher
        RequestDispatcher disp = request.getRequestDispatcher("welcomeUser.jsp");
        disp.forward(request, response);
    }

}
