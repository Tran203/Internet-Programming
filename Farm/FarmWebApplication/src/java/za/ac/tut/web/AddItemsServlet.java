/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.bl.ItemsFacadeLocal;
import za.ac.tut.entities.Items;

/**
 *
 * @author Student
 */
public class AddItemsServlet extends HttpServlet {

    @EJB   
    private ItemsFacadeLocal ifl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         
        String description = request.getParameter("description");
        Double unitPrice = Double.parseDouble(request.getParameter("unitPrice"));
        Double quantity = Double.parseDouble(request.getParameter("quantity"));
        
        
        Items item = createItems(description,unitPrice,quantity);
        ifl.create(item);
      
        request.setAttribute("item", item);
        
        RequestDispatcher disp = request.getRequestDispatcher("add_items_outcome.jsp");
        disp.forward(request, response);
    }

    private Items createItems(String description, Double unitPrice, Double quantity) {
         
       Items items = new Items();
       items.setDescription(description);
       items.setUnitPrice(unitPrice);
       items.setQuantity(quantity);
       items.setCreationDate(new Date());
       return items;
    }

    }


