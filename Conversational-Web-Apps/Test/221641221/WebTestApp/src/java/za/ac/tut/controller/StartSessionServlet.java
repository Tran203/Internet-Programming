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
public class StartSessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //start session
        HttpSession session =  request.getSession(true);
        Integer totQuestions = 0;
        Integer wrong = 0;
        Integer correct =0;
        
        //spass values to session
        session.setAttribute("totQuestions", totQuestions);
        session.setAttribute("wrong", wrong);
        session.setAttribute("correct", correct);
        
        //RequestDispatcher
        RequestDispatcher disp = request.getRequestDispatcher("userDetails.jsp");
        disp.forward(request, response);
    }
}
