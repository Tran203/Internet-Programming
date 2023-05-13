/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.entities.Teacher;
import za.ac.tut.entities.TeacherFacadeLocal;

/**
 *
 * @author Student
 */
public class TakingTestPreparationServlet extends HttpServlet {
 @EJB
    private TeacherFacadeLocal tfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        
        //get std details
        Long stdNo = Long.parseLong(request.getParameter("stdNo"));
        String name = request.getParameter("name");
        
        Long lectureID = Long.parseLong(request.getParameter("id"));
        
        //find the test prepared by a specific teacher
        Teacher testData = tfl.find(lectureID);
        //record the number of questions in the test
        Integer cnt = tfl.count();
        Integer numQuestion =1;
        
        //pass back to the student
        //record std details for future purposes
        session.setAttribute("stdNo", stdNo);
        session.setAttribute("name", name);
        session.setAttribute("testData", testData);
        session.setAttribute("cnt", cnt);
        session.setAttribute("numQuestion", numQuestion);
     
        
        RequestDispatcher disp = request.getRequestDispatcher("std_details_confirm.jsp");
        disp.forward(request, response);
    }
}
