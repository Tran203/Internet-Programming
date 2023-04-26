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
import java.util.List;
import za.ac.tut.model.QuestionBank;

/**
 *
 * @author Admin
 */
public class StartSessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        //Start Session
        HttpSession session = request.getSession(true);
        //Prepare the Test
        QuestionBank qb = new QuestionBank();
        //Use list to get questions 
        List<String> questions = qb.getQuestions();
        //Get data according to the user
        Integer numQuestions = questions.size();
        Integer count = 0;
        Integer numCorrect = 0;
        
        //pass the values back to the session
        session.setAttribute("questions", questions);
        session.setAttribute("numQuestions", numQuestions);
        session.setAttribute("count", count);
        session.setAttribute("numCorrect", numCorrect);
        
        //RequestDispatcher
        RequestDispatcher disp = request.getRequestDispatcher("userDetails.jsp");
        disp.forward(request,response);
    }
}
