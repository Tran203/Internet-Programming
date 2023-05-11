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
import za.ac.tut.bl.StudentFacadeLocal;
import za.ac.tut.entities.Student;

/**
 *
 * @author Student
 */
public class GetStudentUsingNamesServlet extends HttpServlet {
@EJB
    private StudentFacadeLocal sfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //get names
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        
        //create std
        Student std = sfl.findStudntUsingNames(name, surname);
        
        //pass
        request.setAttribute("std", std);
        
        //reuww
        RequestDispatcher disp = request.getRequestDispatcher("./outcome/getting_student_using_name.jsp");
        disp.forward(request, response);
    }
}
