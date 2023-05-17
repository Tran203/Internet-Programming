/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.bl.AccountFacadeLocal;
import za.ac.tut.entities.Account;

/**
 *
 * @author Student
 */
public class SearchAccountsUsingBalance extends HttpServlet {

   
    @EJB
    private AccountFacadeLocal afl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //get min balance
        Double balance = Double.parseDouble(request.getParameter("balance"));

        List<Account> list = afl.findUsingBalance(balance);

        request.setAttribute("list", list);
        request.setAttribute("balance", balance);

        //request
        RequestDispatcher disp = request.getRequestDispatcher("./manager/accounts_over_specific_balance_outcome.jsp");
        disp.forward(request, response);
    }
}
