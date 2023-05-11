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
public class AddStudentServlet extends HttpServlet {
    @EJB
    private StudentFacadeLocal sfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //collect data
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String gender = request.getParameter("gender");
        Integer age = Integer.parseInt(request.getParameter("age"));
        Double mark = Double.parseDouble(request.getParameter("mark"));
        
        //create std
        Student std = createStudent(name,surname,gender,age,mark);
        sfl.create(std);
        
       
        //reuww
        RequestDispatcher disp = request.getRequestDispatcher("");
        disp.forward(request, response);
    }

    private Student createStudent(String name, String surname, String gender, Integer age, Double mark) {
        //
        Student std = new Student();
        
        //set
        std.setName(name);
        std.setSurname(surname);
        std.setGender(gender);
        std.setAge(age);
        std.setPercMark(mark);
        
        return std;
    }
}
