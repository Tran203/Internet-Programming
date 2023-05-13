/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.bl.StudentFacadeLocal;
import za.ac.tut.entities.Student;
import za.ac.tut.entities.StudentWork;

/**
 *
 * @author Student
 */
public class RecordStdDataServlet extends HttpServlet {
@EJB
    private StudentFacadeLocal sfl;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //session
        HttpSession session = request.getSession(true);
        
        //get std details & work
        Long stdNo = (Long)session.getAttribute("stdNo");
        String name = (String)session.getAttribute("name");
        List<StudentWork> stdWork = (List<StudentWork>) session.getAttribute("stdWork");
        Double mark = (Double)session.getAttribute("mark");
        
        //create std
        Student std = createStd(stdNo,name,stdWork,mark);
        sfl.create(std);

        RequestDispatcher disp = request.getRequestDispatcher("./student/student_menu.jsp");
        disp.forward(request, response);
    }

    private Student createStd(Long stdNo, String name, List<StudentWork> stdWork, Double mark) {
        Student s = new Student();
        
        //set
        s.setId(stdNo);
        s.setName(name);
        s.setStdData(stdWork);
        s.setMark(mark);
        
        return s;
    }
}
