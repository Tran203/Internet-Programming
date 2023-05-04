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
import za.ac.tut.ejb.bl.WebTestSBLocal;
import za.ac.tut.model.TestData;

/**
 *
 * @author Student
 */
public class CheckAnswerServlet extends HttpServlet {
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        
        //get user Data
        String question =(String)session.getAttribute("question");
        Integer userAnswer = Integer.parseInt(request.getParameter("userAnswer"));
        
        Integer  numQuestions = (Integer)session.getAttribute("numQuestions");
        Integer  totQuestions = (Integer)session.getAttribute("totQuestions");
        
        Integer  numCorrect = (Integer)session.getAttribute("numCorrect");
        Integer  numWrong = (Integer)session.getAttribute("numWrong");
        
        WebTestSBLocal record = (WebTestSBLocal)session.getAttribute("record");
        
        Integer CorrectAnswer = (Integer)session.getAttribute("CorrectAnswer");
        
        String result = "Wrong";
        if(userAnswer ==  CorrectAnswer){
            numCorrect++;
            result = "Correct";
        }else{
            numWrong++;
        }
        
         //record data
        TestData questionData = new TestData(numQuestions,question,userAnswer,CorrectAnswer,result);
        record.recordData(questionData);
        
        //pass into session
        session.setAttribute("numCorrect", numCorrect);
        session.setAttribute("numWrong", numWrong);
        session.setAttribute("record", record);
        
        request.setAttribute("userAnswer", userAnswer);
        request.setAttribute("result", result);
        
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
