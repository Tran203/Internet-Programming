/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;
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
public class CheckAnswerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //validtae session
        HttpSession session = request.getSession(true);

        //get user answer
        Integer userAnswer = Integer.parseInt(request.getParameter("userAns"));
        //get data from the session
        Integer answer = (Integer)session.getAttribute("answer");
        Integer totQuestions = (Integer)session.getAttribute("totQuestions");
        //mark user
        Integer wrong = (Integer)session.getAttribute("wrong");
        Integer correct = (Integer)session.getAttribute("correct");

        String outcome = "You're wrong";
        if (answer == userAnswer) {
            outcome = "You're correct";
            correct++;
        }else{
            wrong++;
        }
        
        //pass valuess
       
        session.setAttribute("wrong", wrong);
        session.setAttribute("correct", correct);
        request.setAttribute("outcome", outcome);
        request.setAttribute("userAnswer", userAnswer);
        request.setAttribute("answer", answer);

        if (totQuestions < 5 ) {
            RequestDispatcher disp = request.getRequestDispatcher("outcome.jsp");
            disp.forward(request, response);
        } else {
            
            RequestDispatcher disp = request.getRequestDispatcher("summary.jsp");
            disp.forward(request, response);
        }

    }
}
