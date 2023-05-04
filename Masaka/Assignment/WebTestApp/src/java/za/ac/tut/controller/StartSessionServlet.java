/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.ejb.bl.WebTestSBLocal;

/**
 *
 * @author Student
 */
public class StartSessionServlet extends HttpServlet {
    //ejb
    @EJB
    private WebTestSBLocal record;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(true);
       
        Integer totQuestions= 5;
        Integer  numQuestions = 0;
        Integer numCorrect= 0;
        Integer numWrong= 0;
        
        session.setAttribute("record", record);
        session.setAttribute("totQuestions", totQuestions);
        session.setAttribute("numQuestions",  numQuestions);
        session.setAttribute("numCorrect", numCorrect);
        session.setAttribute("numWrong", numWrong);
        
        RequestDispatcher disp = request.getRequestDispatcher("choice.jsp");
        disp.forward(request, response);
    }
}
