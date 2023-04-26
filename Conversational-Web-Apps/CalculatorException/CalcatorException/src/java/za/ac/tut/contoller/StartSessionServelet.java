/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.contoller;

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
public class StartSessionServelet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Start Sesssion
        HttpSession session = request.getSession(true);
        
        //preset Variables
        String name = "";
        
        //set
        session.setAttribute("name", name);
        
        
        //request
        RequestDispatcher disp = request.getRequestDispatcher("userDetails.jsp");
        disp.forward(request, response);
    }

}
