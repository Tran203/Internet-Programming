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
import za.ac.tut.ejb.bl.TicketSaleSingletonLocal;

/**
 *
 * @author Student
 */
public class BuyTicketsServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //start Session
        HttpSession session= request.getSession(true);
        
        //get DATA
        Integer numTickets = Integer.parseInt(request.getParameter("numTickets"));
        TicketSaleSingletonLocal counter = (TicketSaleSingletonLocal)session.getAttribute("counter");
        
        //buy
        Integer numTicketsIssued = counter.getTickets(numTickets);
        
        //pass back to the user
        session.setAttribute("counter", counter);
        request.setAttribute("numTickets", numTickets);
        request.setAttribute("numTicketsIssued", numTicketsIssued);
        
        //Reuqst
        RequestDispatcher disp = request.getRequestDispatcher("purchase_outcome.jsp");
        disp.forward(request, response);
    }
}
