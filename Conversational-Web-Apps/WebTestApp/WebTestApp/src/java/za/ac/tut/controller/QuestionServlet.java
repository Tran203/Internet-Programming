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
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.List;
import za.ac.tut.model.TestHelper;

/**
 *
 * @author Admin
 */
public class QuestionServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        //validate session
        HttpSession session = request.getSession(true);
        
        //Get the question from the list
        List<String> questions = (List<String>)session.getAttribute("questions");
        Integer count = Integer.parseInt((String) session.getAttribute("count"));
        //get question
        TestHelper help =new TestHelper();
        String question = help.getQuestion(questions,count);
        
        //pass the question to user
        request.setAttribute("question", question);
        //RequestDispatcher
        RequestDispatcher disp = request.getRequestDispatcher("askQuestion.jsp");
        disp.forward(request, response);
    }
}
