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
import za.ac.tut.bl.AccountHolderFacadeLocal;
import za.ac.tut.entities.AccountHolder;

/**
 *
 * @author Student
 */
public class SearchServlet extends HttpServlet {
 @EJB
    private AccountHolderFacadeLocal pfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //get user id
        Long id = Long.parseLong(request.getParameter("id"));
        
        //Search
        AccountHolder ah = pfl.find(id);
        
        //pass back to user
        request.setAttribute("ah", ah);
        
        //request
        RequestDispatcher disp = request.getRequestDispatcher("search_outcome.jsp");
        disp.forward(request, response);
    }
}
