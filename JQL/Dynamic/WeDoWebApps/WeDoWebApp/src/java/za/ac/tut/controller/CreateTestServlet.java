/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.entities.QuestionPaper;
import za.ac.tut.entities.Teacher;
import za.ac.tut.entities.TeacherFacadeLocal;

/**
 *
 * @author Student
 */
public class CreateTestServlet extends HttpServlet {
    @EJB
    private TeacherFacadeLocal tfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //get questions
        String q1 = request.getParameter("q1");
        String q2 = request.getParameter("q2");
        
        Integer ans1 = Integer.parseInt(request.getParameter("ans1"));
        Integer ans2 = Integer.parseInt(request.getParameter("ans2"));
        
        //create test
        Teacher t = createTest(q1,q2,ans1,ans2);
        
        //INSEER INTO DATABASE
        tfl.create(t);
        
        RequestDispatcher disp = request.getRequestDispatcher("creating_test_outcome.jsp");
        disp.forward(request, response);
    }

    private Teacher createTest(String q1, String q2, Integer ans1, Integer ans2) {
        Teacher t = new Teacher();
        List<QuestionPaper> questions = new ArrayList<>();
        QuestionPaper qp1 = new QuestionPaper();
        QuestionPaper qp2 = new QuestionPaper();
        
        //set
        qp1.setQuestion(q1);
        qp1.setAnswer(ans1);
        
        qp2.setQuestion(q2);
        qp2.setAnswer(ans2);
        
        //ADD
        questions.add(qp1);
        questions.add(qp2);
        
        //set teacher
        t.setTestData(questions);
        
        return t;
    }
}
