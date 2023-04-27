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
import za.ac.tut.model.QuestionPaper;

/**
 *
 * @author Student
 */
public class TestOptionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //session
        HttpSession session = request.getSession(true);
        
        //get user Data
        String testOption = request.getParameter("testOption");
        
        //call for help
        QuestionPaper help = new QuestionPaper();
        String question = help.getQuestion(session, testOption);
        
        //pass into session
        session.setAttribute("testOption", testOption);
        request.setAttribute("question", question);
        
        //request
        RequestDispatcher disp = request.getRequestDispatcher("question.jsp");
        disp.forward(request, response);
    }
}
