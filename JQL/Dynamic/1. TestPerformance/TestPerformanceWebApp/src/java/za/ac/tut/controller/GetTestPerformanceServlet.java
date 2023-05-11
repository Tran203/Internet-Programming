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
public class GetTestPerformanceServlet extends HttpServlet {
@EJB
    private StudentFacadeLocal sfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //collect data from database
        List<Student> list = sfl.findAll();
        Integer totInClass = sfl.count();
        //Marks
        Double lowestMark = sfl.getLowestMark();
        Double highestMark = sfl.getHighestMArk();
        Double avgMark = sfl.getAvgMark();
        
        //countable data
        Integer cntPassed =sfl.cntAllPassed();
        Integer cntFailed = sfl.cntAllFailed();
        
        Integer cntMales = sfl.cntAllMaleStd();
        Integer cntFemales = sfl.cntAllFemaleStd();
        
        //passe && failed data
        Integer cntFailedMale = sfl.cntFailedAllMaleStd();
        Integer cntPassedMale = sfl.cntPassedAllMaleStd();
        
        Integer cntFailedFemale = sfl.cntFailedAllFemaleStd();
        Integer cntPassedFemale = sfl.cntPassedAllFemaleStd();
        
        //reuww
        RequestDispatcher disp = request.getRequestDispatcher("./outcome/class_performance_outcome.jsp");
        disp.forward(request, response);
    }
}
