/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.ejb.bl.CustomerFacadeLocal;
import za.ac.tut.entities.Contact;
import za.ac.tut.entities.Customer;

/**
 *
 * @author Student
 */
public class GetFemaleCustomersServlet extends HttpServlet {
    @EJB
    private CustomerFacadeLocal cfl;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Customer> customers = cfl.findAllFemaleCustomers();
        request.setAttribute("customers", customers);
        
        RequestDispatcher disp = request.getRequestDispatcher("get_female_customers_outcome.jsp");
        disp.forward(request, response);
    }
}
