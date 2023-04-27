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
import za.ac.tut.ejb.bl.CurrencyConvertorSBLocal;

/**
 *
 * @author Student
 */
public class DollarToRandServlet extends HttpServlet {//ejb
    @EJB
    private CurrencyConvertorSBLocal convert;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //get Data from user
        Double dollar = Double.parseDouble(request.getParameter("amt"));
        
        //convert
        Double rand = convert.convertToRand(dollar);
        
        //return data to user
        request.setAttribute("rand", rand);
        request.setAttribute("dollar", dollar);
        
        //Request Dispatcher
        RequestDispatcher disp = request.getRequestDispatcher("rand_outcome.jsp");
        disp.forward(request, response);
    }
}
