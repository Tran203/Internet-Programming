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
import za.ac.tut.bl.AccountFacadeLocal;
import za.ac.tut.entities.Account;

/**
 *
 * @author Student
 */
public class SearchAccount extends HttpServlet {

    @EJB
    private AccountFacadeLocal afl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //get account num
        Long id = Long.parseLong(request.getParameter("id"));

        Account account = afl.find(id);

        request.setAttribute("account", account);

        //request
        RequestDispatcher disp = request.getRequestDispatcher("./admin/search_account_outcome.jsp");
        disp.forward(request, response);
    }
}
