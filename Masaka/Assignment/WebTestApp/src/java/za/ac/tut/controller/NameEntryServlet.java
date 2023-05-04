/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
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
public class NameEntryServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //session
        HttpSession session = request.getSession(true);
        
        //get user Data
        String name = request.getParameter("name");
        String genderOp = request.getParameter("gender");
        
        //pay respect to user
        String gender = "Mrs/Miss";
        if(genderOp.equalsIgnoreCase("male")){
            gender = "Mr";
        }
        
        //pass into session
        session.setAttribute("name", name);
        session.setAttribute("gender", gender);
        
        //request
        RequestDispatcher disp = request.getRequestDispatcher("test_option.jsp");
        disp.forward(request, response);
    }
}
