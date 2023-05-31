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
import javax.servlet.http.HttpSession;
import za.ac.tut.bl.ItemFacadeLocal;
import za.ac.tut.entities.Item;

/**
 *
 * @author Student
 */
public class AddToCartServlet extends HttpServlet {
    @EJB
    private ItemFacadeLocal ifl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //session
        HttpSession session = request.getSession(true);
        
        //get details
        Long id = Long.parseLong(request.getParameter("id"));
        Integer qty = Integer.parseInt(request.getParameter("qty"));
        
        //get the item from database
        Item item = ifl.find(id);
        
        //calc the cost
        Double price = item.getUnitPrice();
        Double cost = price * qty;
        //calc tot
        Double tot = (Double)session.getAttribute("tot");
        tot+= cost;
        
        //add item to cart
        List<Item> cart = (List<Item>) session.getAttribute("cart");
        cart.add(item);
        
        //save changes
        session.setAttribute("cart", cart);
        session.setAttribute("tot", tot);
        
        //requst Dispatcher
        RequestDispatcher disp = request.getRequestDispatcher("buy_outcome.jsp");
        disp.forward(request, response);
    }
}
