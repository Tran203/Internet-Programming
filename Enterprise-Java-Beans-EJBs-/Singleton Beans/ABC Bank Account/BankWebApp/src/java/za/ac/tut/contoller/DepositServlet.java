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
import za.ac.tut.ejb.bl.AccountTransactionSingletonLocal;

/**
 *
 * @author Student
 */
public class DepositServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //session
         HttpSession session = request.getSession(true);
         
         //get DATA
         Double amt = Double.parseDouble(request.getParameter("amt"));
         AccountTransactionSingletonLocal bank = ( AccountTransactionSingletonLocal)session.getAttribute("bank");
          
        //bank with us
        bank.deposit(amt);
        
        //update
        session.setAttribute("bank", bank);
        request.setAttribute("amt", amt);
        
        //req
        RequestDispatcher disp = request.getRequestDispatcher("deposit_outcome.jsp");
        disp.forward(request, response);
        
    }
}
