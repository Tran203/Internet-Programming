/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.contoller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.model.Calculator;

/**
 *
 * @author Student
 */
public class ValueEntryServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //get Session
        HttpSession session = request.getSession(true);

        //get user info
        Integer num1 = Integer.parseInt(request.getParameter("num1"));
        Integer num2 = Integer.parseInt(request.getParameter("num2"));
        Character op = (request.getParameter("op")).charAt(0);

        ///cal for help
        Calculator cal = new Calculator();
        String outcome = cal.getOutcome(num1, num2, op);

        //pass
        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);
        request.setAttribute("op", op);
        request.setAttribute("outcome", outcome);

        //request
        RequestDispatcher disp = request.getRequestDispatcher("outcome.jsp");
        disp.forward(request, response);

    }

}
