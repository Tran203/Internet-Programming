/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.entities.Memo;

/**
 *
 * @author Student
 */
public class QuestionPreparationServlet extends HttpServlet {
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //session
        HttpSession session = request.getSession(true);

        //get memo Data
        List<Memo> memo = (List<Memo>) session.getAttribute("memo");
        
        Integer cnt = (Integer) session.getAttribute("cnt");

        //get the question
        String question = memo.get(cnt).getQuestion();
        cnt++;

        //pass into session
        session.setAttribute("cnt", cnt);
        session.setAttribute("question", question);

        //request
        RequestDispatcher disp = request.getRequestDispatcher("./student/question.jsp");
        disp.forward(request, response);
    }
}
