/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.bl.MemoFacadeLocal;
import za.ac.tut.bl.StudentWorkFacadeLocal;
import za.ac.tut.entities.Memo;
import za.ac.tut.entities.StudentWork;

/**
 *
 * @author Student
 */
public class TestPreparationServlet extends HttpServlet {
@EJB
    private MemoFacadeLocal mfl;
    private StudentWorkFacadeLocal swl;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //session
        HttpSession session = request.getSession(true);
        
        //lets prepare the test for the std
        List<Memo> memo = mfl.findAll();
        Integer numQuestions = mfl.count();
        
        Integer cnt = 0;
        
        //prepare to save std work
        List<StudentWork> stdWork = new ArrayList<>(); 
        
        //prepare test reults calc
        Integer numCorrect = 0;
        Integer numWrong = 0;
        
        //pass back
        session.setAttribute("memo", memo);
        session.setAttribute("numQuestions", numQuestions);
        session.setAttribute("cnt", cnt);
        
        session.setAttribute("stdWork", stdWork);
        
        session.setAttribute("numCorrect", numCorrect);
        session.setAttribute("numWrong", numWrong);
        
               
        RequestDispatcher disp = request.getRequestDispatcher("./student/start_test.jsp");
        disp.forward(request, response);
    }
}
