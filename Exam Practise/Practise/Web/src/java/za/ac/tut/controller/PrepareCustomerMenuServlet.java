/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
public class PrepareCustomerMenuServlet extends HttpServlet {
    @EJB
    private ItemFacadeLocal ifl;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //session
        HttpSession session = request.getSession(true);
        
        //create the cart
        List<Item> items = ifl.findAll();
        
        //
        List<Item> cart = new ArrayList<>();
        
        //set to session
        session.setAttribute("items", items);
        session.setAttribute("cart", cart);
        
        //requst Dispatcher
        RequestDispatcher disp = request.getRequestDispatcher("buyItems.jsp");
        disp.forward(request, response);
    }
}
