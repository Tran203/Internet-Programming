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
import za.ac.tut.bl.Customer_OrderFacadeLocal;
import za.ac.tut.entities.Customer_Order;

/**
 *
 * @author Student
 */
public class GetOrdersServlet extends HttpServlet {
     @EJB
    private Customer_OrderFacadeLocal cfl;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Customer_Order> list = cfl.findAll();
        
        request.setAttribute("list", list);
        
        //requst Dispatcher
        RequestDispatcher disp = request.getRequestDispatcher("view_all.jsp");
        disp.forward(request, response);
    }
}
