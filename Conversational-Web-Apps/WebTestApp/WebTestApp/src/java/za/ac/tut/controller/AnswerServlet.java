/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.controller;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import java.util.List;
import za.ac.tut.model.TestHelper;

/**
 *
 * @author Admin
 */
public class AnswerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        //Validate session
        HttpSession session = request.getSession(true);
        //Get the question from the list
        List<String> questions = (List<String>)session.getAttribute("questions");
        Integer count = Integer.valueOf((String) session.getAttribute("count"));
        Integer size = questions.size();
        //Get user's answer
        Integer userAnswer = Integer.valueOf(request.getParameter("answer"));
        TestHelper help = new TestHelper();
        String question = help.getQuestion(questions, count);
        Integer correctAnswer = help.getCorrectAnswer(questions, count);
        String outcome = help.markUser(userAnswer,correctAnswer,session);
        
        //set attributes back to the user
        request.setAttribute("answer", userAnswer);
        request.setAttribute("question", question);
        request.setAttribute("correctAnswer", correctAnswer);
        request.setAttribute("outcome",outcome);
        
        
        //get the relevent next page
        count++;
        session.setAttribute("count", count);
        String nextPage = help.getNextPage(count,size);
        //requestDispatcher 
        RequestDispatcher disp = request.getRequestDispatcher(nextPage);
        disp.forward(request, response);
    }

}
