/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
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
public class QuestionPreparationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        HttpSession session = request.getSession(true);
        
        String choice = (String)session.getAttribute("choice");
        Integer  numQuestions = (Integer)session.getAttribute("numQuestions");
        
       
        String question = getQuestion(session,  choice);
 
        session.setAttribute("numQuestions",numQuestions);
        session.setAttribute("question", question);
        
        //request
        RequestDispatcher disp = request.getRequestDispatcher("question.jsp");
        disp.forward(request, response);
    }

    private String getQuestion(HttpSession session, String choice) {
        String question = "",op ="/";

        Integer num1 = 10 + (int) (Math.random() * 90);
        Integer num2 = 10 + (int) (Math.random() * 90);
        if (choice.equalsIgnoreCase("multiplication")) {
            num1 = 1 + (int) (Math.random() * 10);
            num2 = 1 + (int) (Math.random() * 10);
            op="*";
        }else if(choice.equalsIgnoreCase("addition")){
            op="+";
        }else if(choice.equalsIgnoreCase("subtraction")){
            op="-";
        }
       
        question = num1 + " " + op + " " + num2;

        Integer answer = getAnswer(num1, num2, op);
       
        session.setAttribute("CorrectAnswer", answer);
        
        return question;
    }

    private Integer getAnswer(Integer num1, Integer num2, String op) {
         Integer answer;

        switch (op.charAt(0)) {
            case '+':
                answer = num1 + num2;
                break;
            case '-':
                answer = num1 - num2;
                break;
            case '/':
                answer = num1 / num2;
                break;
            default:
                answer = num1 * num2;
        }
        
        return answer;
    }
}
