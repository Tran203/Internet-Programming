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
import javax.servlet.http.HttpSession;
import za.ac.tut.ejb.bl.CartSBLocal;

/**
 *
 * @author Student
 */
public class StartSessionServlet extends HttpServlet {
    //ejb
    @EJB
    private CartSBLocal cart;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //session
        HttpSession session = request.getSession(true);
        
        //pass Bean to the session
        session.setAttribute("cart", cart);
        
        //Request Dispacther
        RequestDispatcher disp = request.getRequestDispatcher("menu.jsp");
        disp.forward(request, response);
    }
}
