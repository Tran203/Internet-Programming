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
import za.ac.tut.bl.PersonFacadeLocal;

/**
 *
 * @author Student
 */
public class GetListSizeServlet extends HttpServlet {
    @EJB
    private PersonFacadeLocal pfl;
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer size = pfl.count();
        
        //pass back to user
        request.setAttribute("size", size);
        //request
        RequestDispatcher disp=  request.getRequestDispatcher("./outcome_pages/get_size_outcome.jsp");
        disp.forward(request, response);
    }
}
