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
import za.ac.tut.model.Calculator;

/**
 *
 * @author Student
 */
public class ChoiceServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //validtae session
        HttpSession session = request.getSession(true);
        
        //get user choice
        String choice = request.getParameter("operator");
        
    
        
        //pass int session
        session.setAttribute("choice", choice);
        
        
        RequestDispatcher disp = request.getRequestDispatcher("confirmTest.jsp");
        disp.forward(request, response);
    }


}
