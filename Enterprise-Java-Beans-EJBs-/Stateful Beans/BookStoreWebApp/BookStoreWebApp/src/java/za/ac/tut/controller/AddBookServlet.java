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
import za.ac.tut.ejb.bl.CartSBLocal;

/**
 *
 * @author Student
 */
public class AddBookServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //session
        HttpSession session = request.getSession(true);
        
        //get Details
        String bookName = request.getParameter("bookName");
        CartSBLocal cart = (CartSBLocal)session.getAttribute("cart");
        
        //add
        cart.addBook(bookName);
        
        //pass Bean to the session
        session.setAttribute("cart", cart);
        
        //outcome
        String type = "Add";
        String status = bookName + " was added to the cart";
        
        //pass next
        request.setAttribute("type", type);
        request.setAttribute("status", status);
        
        //Request Dispacther
        RequestDispatcher disp = request.getRequestDispatcher("outcome.jsp");
        disp.forward(request, response);
    }
}
