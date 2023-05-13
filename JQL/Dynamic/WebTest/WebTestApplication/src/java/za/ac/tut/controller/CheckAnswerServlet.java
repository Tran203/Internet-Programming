/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.bl.StudentWorkFacadeLocal;
import za.ac.tut.entities.Memo;
import za.ac.tut.entities.StudentWork;

/**
 *
 * @author Student
 */
public class CheckAnswerServlet extends HttpServlet {
    @EJB
    private StudentWorkFacadeLocal swl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //session
        HttpSession session = request.getSession(true);

        //get std answer Data
        String question = (String) session.getAttribute("question");
        String userAnswer = request.getParameter("userAnswer");

        Integer numQuestions = (Integer) session.getAttribute("numQuestions");
        Integer cnt = (Integer) session.getAttribute("cnt");

        Integer numCorrect = (Integer) session.getAttribute("numCorrect");
        Integer numWrong = (Integer) session.getAttribute("numWrong");

        //prepare to save std work
        List<StudentWork> stdWork = (List<StudentWork>) session.getAttribute("stdWork");

        //get memo Data
        List<Memo> memo = (List<Memo>) session.getAttribute("memo");
        String correctAnswer = memo.get(cnt-1).getAnswer();

        //mark user
        String result = "Wrong";
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            numCorrect++;
            result = "Correct";
        } else {
            numWrong++;
        }

        //record data
        StudentWork stdQuestionData = recordQustionData(cnt,question,userAnswer,correctAnswer,result);
        stdWork.add(stdQuestionData);

        //pass into session
        session.setAttribute("numCorrect", numCorrect);
        session.setAttribute("numWrong", numWrong);
        session.setAttribute("stdWork", stdWork);
        
        request.setAttribute("correctAnswer", correctAnswer);
        request.setAttribute("userAnswer", userAnswer);
        request.setAttribute("result", result);

        //navigation
        if (numQuestions == cnt) {
            RequestDispatcher disp = request.getRequestDispatcher("./student/outcome2.jsp");
            disp.forward(request, response);
        } else {
            RequestDispatcher disp = request.getRequestDispatcher("./student/ouctome.jsp");
            disp.forward(request, response);
        }
    }

    private StudentWork recordQustionData(Integer cnt, String question, String userAnswer, String correctAnswer, String result) {
        StudentWork s = new StudentWork();
        
        s.setqNum(cnt);
        s.setQuestion(question);
        s.setUserAnswer(userAnswer);
        s.setAnswer(correctAnswer);
        s.setResult(result);
        
        return s;
    }

}
