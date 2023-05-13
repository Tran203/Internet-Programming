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
import za.ac.tut.bl.StudentFacadeLocal;
import za.ac.tut.entities.Student;

/**
 *
 * @author Student
 */
public class GetHighestStudent extends HttpServlet {

    @EJB
    private StudentFacadeLocal sfl;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //get
        Student std = sfl.higestStd();

        //pass
        request.setAttribute("std", std);

        RequestDispatcher disp = request.getRequestDispatcher("./teacher/highest_std_outcome.jsp");
        disp.forward(request, response);
    }
}
