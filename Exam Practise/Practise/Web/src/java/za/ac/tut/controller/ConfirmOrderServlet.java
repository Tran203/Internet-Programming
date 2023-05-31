/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

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
import za.ac.tut.bl.Customer_OrderFacadeLocal;
import za.ac.tut.entities.Address;
import za.ac.tut.entities.Customer_Order;
import za.ac.tut.entities.Item;

/**
 *
 * @author Student
 */
public class ConfirmOrderServlet extends HttpServlet {

    @EJB
    private Customer_OrderFacadeLocal cfl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //session
        HttpSession session = request.getSession(true);

        //get addres
        String street = request.getParameter("street");
        String area = request.getParameter("area");
        String code = request.getParameter("code");

        //prepare to create order
        List<Item> cart = (List<Item>) session.getAttribute("cart");
        Double tot = (Double) session.getAttribute("tot");
        Address add = createAddress(street, area, code);

        //create order
        Customer_Order o = createOrder(cart, tot);
        cfl.create(o);

        //requst Dispatcher
        RequestDispatcher disp = request.getRequestDispatcher("order_outcome.jsp");
        disp.forward(request, response);
    }

    private Address createAddress(String street, String area, String code) {
        Address a = new Address();

        //set
        a.setStreet(street);
        a.setArea(area);
        a.setCode(code);

        return a;
    }

    private Customer_Order createOrder(List<Item> cart, Double tot) {
        Customer_Order o = new Customer_Order();

        //set
        o.setCart(cart);
        o.setTotValue(tot);
        o.setCreationDate(new Date());

        return o;
    }
}
