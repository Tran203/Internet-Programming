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

/**
 *
 * @author Student
 */
public class StudentDetailsServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);

        //get std details
        Long stdNo = Long.parseLong(request.getParameter("stdNo"));
        String name = request.getParameter("name");

        //record std details for future purposes
        session.setAttribute("stdNo", stdNo);
        session.setAttribute("name", name);

        RequestDispatcher disp = request.getRequestDispatcher("./student/student_menu.jsp");
        disp.forward(request, response);
    }
}
