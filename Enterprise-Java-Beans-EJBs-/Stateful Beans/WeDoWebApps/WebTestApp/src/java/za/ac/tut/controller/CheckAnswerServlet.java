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
public class CheckAnswerServlet extends HttpServlet {
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //session
        HttpSession session = request.getSession(true);
        
        //get user Data
        Integer userAnswer = Integer.parseInt(request.getParameter("userAnswer"));
        
        Integer  numQuestions = (Integer)session.getAttribute("numQuestions");
        Integer  totQuestions = (Integer)session.getAttribute("totQuestions");
        Integer  numCorrect = (Integer)session.getAttribute("numCorrect");
        Integer  numWrong = (Integer)session.getAttribute("numWrong");
        Integer answer = (Integer)session.getAttribute("answer");
        
        //mark user
        if(userAnswer ==  answer){
            numCorrect++;
        }else{
            numWrong++;
        }
        
        //pass into session
        session.setAttribute("numCorrect", numCorrect);
        session.setAttribute("numWrong", numWrong);
        
        //navigation
        if(numQuestions == totQuestions){
            RequestDispatcher disp = request.getRequestDispatcher("outcome2.jsp");
            disp.forward(request, response);
        }else{
            RequestDispatcher disp = request.getRequestDispatcher("ouctome.jsp");
            disp.forward(request, response);
        }
    }
}
