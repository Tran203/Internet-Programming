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
import za.ac.tut.model.SubjectCheck;

/**
 *
 * @author Student
 */
public class SubjectInfoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Validate Session
        HttpSession session = request.getSession(true);
        //get the subject info
        String sbjName = request.getParameter("sbjName");
        Integer grade = Integer.parseInt(request.getParameter("grade"));
        //get page
        Integer count = (Integer) session.getAttribute("count");
        Integer numSbj = (Integer) session.getAttribute("numSbj");
        count++;

        //Check Validity of data provided
        SubjectCheck help = new SubjectCheck();
        String status = help.check(sbjName, grade, session);
        Integer sbjAps = help.getSubAps(grade);

        //pass entered subject details back to the user
        request.setAttribute("sbjAps", sbjAps);
        request.setAttribute("sbjName", sbjName);
        request.setAttribute("grade", grade);
        request.setAttribute("status", status);
        session.setAttribute("count", count);

        if (count > numSbj) {
            //RequestDispatcher
            RequestDispatcher disp = request.getRequestDispatcher("summary.jsp");
            disp.forward(request, response);
        } else {
            //RequestDispatcher
            RequestDispatcher disp = request.getRequestDispatcher("outcome.jsp");
            disp.forward(request, response);
        }
    }
}
