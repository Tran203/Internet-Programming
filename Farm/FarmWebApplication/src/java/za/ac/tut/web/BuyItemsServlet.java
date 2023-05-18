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
import javax.mail.FetchProfile.Item;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.bl.ItemsFacadeLocal;
import za.ac.tut.entities.Items;

/**
 *
 * @author Student
 */
public class BuyItemsServlet extends HttpServlet {

    @EJB
    private ItemsFacadeLocal ifl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        
        //
        Long id = Long.parseLong(request.getParameter("id"));
        //fnd
        Items item = ifl.find(id);
        
        //get the item qty and price
        Double unitPrice = item.getUnitPrice();
        Double quantity = item.getQuantity();
        
        //
        Double customerQuantity = Double.parseDouble(request.getParameter("quantity"));
        Double newItemNum = quantity - customerQuantity;
        //calcate total unit price
        Double totalUnitPrice = customerQuantity * unitPrice;
        //update order total price
        Double totalOrderAmt = (Double)session.getAttribute("totalOrderAmt");
        totalOrderAmt += totalUnitPrice;
        
        //update database
        item = editItem(newItemNum,id);
        ifl.edit(item);
        
        //add to cart
        List<Items> cart = (List<Items>)session.getAttribute("cart");
        item = new Items(item.getId(), item.getCode(), item.getDescription(), totalUnitPrice,customerQuantity, new Date());
        cart.add(item);
        
        //update session
        session.setAttribute("cart", cart);
        session.setAttribute("totalOrderAmt", totalOrderAmt);
        
        RequestDispatcher disp = request.getRequestDispatcher("buy_item_outcome.jsp");
        disp.forward(request, response);
    }

    private Items editItem(Double newItemNum, Long id) {
        Items item = ifl.find(id);
        //update
        item.setQuantity(newItemNum);
        
        return item;
    }

}
