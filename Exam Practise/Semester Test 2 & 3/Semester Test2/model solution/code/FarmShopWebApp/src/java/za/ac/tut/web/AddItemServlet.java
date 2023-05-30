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
import za.ac.tut.ejb.bl.ItemFacadeLocal;
import za.ac.tut.entities.Item;

/**
 *
 * @author MemaniV
 */
public class AddItemServlet extends HttpServlet {
    @EJB
    private ItemFacadeLocal ifl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer code = Integer.parseInt(request.getParameter("code"));
        String desc = request.getParameter("desc");
        Double price = Double.parseDouble(request.getParameter("price"));
        Integer qty = Integer.parseInt(request.getParameter("qty"));
                
        Item item = createItem(code, desc, price, qty);
        ifl.create(item);
        String url = "add_item_outcome.jsp";
               
        RequestDispatcher disp = request.getRequestDispatcher(url);
        disp.forward(request, response);
    }

    private Item createItem(Integer code, String desc, Double price, Integer qty) {
        Item item = new Item();
        item.setCode(code);
        item.setDescription(desc);
        item.setUnitPrice(price);
        item.setQuantity(qty);
        item.setCreatiionDate(new Date());
        return item;
    }

}