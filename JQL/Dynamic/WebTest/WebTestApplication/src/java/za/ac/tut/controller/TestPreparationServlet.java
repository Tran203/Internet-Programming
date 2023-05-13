/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.bl.MemoFacadeLocal;
import za.ac.tut.entities.Memo;

/**
 *
 * @author Student
 */
public class TestPreparationServlet extends HttpServlet {
    @EJB
    private MemoFacadeLocal mfl;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        
        //lets prepare the test for the std
        List<Memo> memo = mfl.findAll();
        Integer numQuestions = mfl.count();
        
        Integer cnt = 0;
        
        //pass back
        session.setAttribute("memo", memo);
        session.setAttribute("numQuestions", numQuestions);
        session.setAttribute("cnt", cnt);
        
               
        RequestDispatcher disp = request.getRequestDispatcher("./student/start_test.jsp");
        disp.forward(request, response);
    }
}
