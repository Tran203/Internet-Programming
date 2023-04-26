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
public class QuestionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //validtae session
        HttpSession session = request.getSession(true);
        //get choice
        String choice = (String)session.getAttribute("choice");
        Integer totQuestions = (Integer)session.getAttribute("totQuestions");
        
        //get the question and answer
        Calculator cal = new Calculator();
        String question = cal.getQustion(choice,session);
        //Increase questin number
        totQuestions++;
        
        //pass
        session.setAttribute("question", question);
        session.setAttribute("totQuestions", totQuestions);
        
        RequestDispatcher disp = request.getRequestDispatcher("question.jsp");
        disp.forward(request, response);
    }
}
