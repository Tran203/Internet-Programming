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
public class StartSessionServlet extends HttpServlet {protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        //Start Session
        HttpSession session = request.getSession(true);
        
        Integer count = 0;
        Integer numSbj = 0;
        Integer apsCount = 0;
        
        //Pass values into the session
        session.setAttribute("numSbj", numSbj);
        session.setAttribute("apsCount", apsCount);
        session.setAttribute("count", count);
        //RequestDispatcher
        RequestDispatcher disp = request.getRequestDispatcher("details_entry.jsp");
        disp.forward(request, response);
    }

}
