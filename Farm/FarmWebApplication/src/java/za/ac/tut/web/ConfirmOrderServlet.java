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
import javax.servlet.http.HttpSession;
import za.ac.tut.bl.CustomerFacadeLocal;
import za.ac.tut.bl.OrderFacadeLocal;
import za.ac.tut.entities.Customer;
import za.ac.tut.entities.Items;
import za.ac.tut.entities.Order;

/**
 *
 * @author Student
 */
public class ConfirmOrderServlet extends HttpServlet {

    @EJB
    private OrderFacadeLocal ofl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);

        //GET ADDRESS
        String street = request.getParameter("street");
        String area = request.getParameter("area");
        String code = request.getParameter("code");

        //get cart info
        List<Items> cart = (List<Items>) session.getAttribute("cart");
        Double totalOrderAmt = (Double)session.getAttribute("totalOrderAmt");

        //create customer or address
        Customer address = createCustomer(street, area, code);
        //create order and save into database
        Order order = createOreder(cart,totalOrderAmt, address);
        ofl.create(order);

        RequestDispatcher disp = request.getRequestDispatcher("order_info_outcome.jsp");
        disp.forward(request, response);
    }

    private Customer createCustomer(String street, String area, String code) {
           Customer c = new Customer();
           
           //set
           c.setStreet(street);
           c.setArea(area);
           c.setCode(code);
           
           return c;
    }

    private Order createOreder(List<Items> cart, Double totalOrderAmt, Customer address) {
        Order o = new Order();
        
        //set
        o.setCreationDate(new Date());
        o.setTotAmt(totalOrderAmt);
        o.setAddress(address);
        o.setItem(cart);
        
        return o;
    }
}
