/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
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
public class AddItemServlet extends HttpServlet {

    @EJB
    private ItemFacadeLocal ifl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //session
        HttpSession session = request.getSession(true);

        //get item data
        String code = request.getParameter("code");
        String desc = request.getParameter("desc");
        Double price = Double.parseDouble(request.getParameter("price"));
        Integer qty = Integer.parseInt(request.getParameter("qty"));

        //create item
        Item item = createItem(code, desc, price, qty);
        
        //add to database
        ifl.create(item);

        //requst Dispatcher
        RequestDispatcher disp = request.getRequestDispatcher("add_item_outcome.jsp");
        disp.forward(request, response);
    }

    private Item createItem(String code, String desc, Double price, Integer qty) {
        Item i = new Item();
        
        //set
        i.setCode(code);
        i.setDescription(desc);
        i.setUnitPrice(price);
        i.setQty(qty);
        
        return i;
    }
}
