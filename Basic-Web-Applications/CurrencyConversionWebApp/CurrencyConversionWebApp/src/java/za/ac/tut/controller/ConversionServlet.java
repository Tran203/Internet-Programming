/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import za.ac.tut.model.CurrencyConvertor;

/**
 *
 * @author Admin
 */
public class ConversionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        //get valuest from the user
        Double amt = Double.valueOf(request.getParameter("amt"));
        String rate = request.getParameter("rate");
        
        //pass the values for conversion
        CurrencyConvertor cc = new CurrencyConvertor();
        Double result = cc.convertorMethod(amt,rate);
        
        //pass the result back to the user
        request.setAttribute("result", result);
        request.setAttribute("rate",rate);
        
        //Request Dispatcher
        RequestDispatcher disp = request.getRequestDispatcher("output.jsp");
        disp.forward(request, response);
    }
}
