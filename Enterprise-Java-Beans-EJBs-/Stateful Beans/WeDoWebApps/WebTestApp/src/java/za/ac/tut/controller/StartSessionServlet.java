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
        //start session
        HttpSession session = request.getSession(true);
        
        //prepare  Data
        Integer totQuestions= 5;
        Integer  numQuestions = 0;
        Integer numCorrect= 0;
        Integer numWrong= 0;
        
        //pass into session
        session.setAttribute("record", record);
        session.setAttribute("totQuestions", totQuestions);
        session.setAttribute("numQuestions",  numQuestions);
        session.setAttribute("numCorrect", numCorrect);
        session.setAttribute("numWrong", numWrong);
        
        
        //request
        RequestDispatcher disp = request.getRequestDispatcher("name_entry.jsp");
        disp.forward(request, response);
    }
}
