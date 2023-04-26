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
public class UserDetailsServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        //Validate Session
        HttpSession session = request.getSession(true);
        
        //get User Details
        String name = (String)request.getParameter("name");
        String surname = (String)request.getParameter("surname");
        Integer numSbj = Integer.parseInt(request.getParameter("numSbj"));
        
        Integer count = (Integer)session.getAttribute("count");
        count++;
        
        //set user Details to the session
        session.setAttribute("name", name);
        session.setAttribute("surname", surname);
        session.setAttribute("numSbj", numSbj);
        session.setAttribute("count", count);
        
        //RequestDispatcher
        RequestDispatcher disp = request.getRequestDispatcher("subject_info_entry.jsp");
        disp.forward(request, response);
    }
}
