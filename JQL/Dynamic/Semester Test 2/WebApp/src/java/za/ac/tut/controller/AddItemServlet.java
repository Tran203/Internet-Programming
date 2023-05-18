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
        
        //get item details
        String code = request.getParameter("code");
        String desc = request.getParameter("desc");
        Double price = Double.parseDouble(request.getParameter("price"));
        Integer qty = Integer.parseInt(request.getParameter("qty"));
        
        //create item
        Item item = createItem(code,desc,price,qty);
        //add to database
        ifl.create(item);
        
        //request
        RequestDispatcher disp = request.getRequestDispatcher("");
        disp.forward(request, response);
    }

    private Item createItem(String code, String desc, Double price, Integer qty) {
        Item i = new Item();
        
        //set
        i.setCode(code);
        i.setDescription(desc);
        i.setPrice(price);
        i.setQty(qty);
        
        return i;
    }
}
