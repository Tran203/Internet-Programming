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
import za.ac.tut.bl.MemoFacadeLocal;
import za.ac.tut.entities.Memo;

/**
 *
 * @author Student
 */
public class CreateTestServlet extends HttpServlet {

    @EJB
    private MemoFacadeLocal mfl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //get questions
        String q = request.getParameter("q");
        String ans = request.getParameter("ans");

        //create questiion
        Memo m = createQuestion(q, ans);

        //INSEER INTO DATABASE
        mfl.create(m);
        
        //

        RequestDispatcher disp = request.getRequestDispatcher("./teacher/creating_test_outcome.jsp");
        disp.forward(request, response);
    }

    private Memo createQuestion(String q, String ans) {
        Memo m = new Memo();
        
        //set
        m.setQuestion(q);
        m.setAnswer(ans);

        return m;
    }

}
