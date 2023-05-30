/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.ejb.bl.CartSBLocal;
import za.ac.tut.entities.Item;

/**
 *
 * @author MemaniV
 */
public class CheckoutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        CartSBLocal col = (CartSBLocal)session.getAttribute("col");
        List<String> items = col.getItems();
        
        Double amtDue = determineAmountDue(items);
        session.setAttribute("amtDue", amtDue);
        String url = "checkout.jsp";
                  
        RequestDispatcher disp = request.getRequestDispatcher(url);
        disp.forward(request, response);
    }

    private Double determineAmountDue(List<String> items) {
        Double amountDue = 0.0, unitPrice, cost;
        Integer qty;

        for(String item:items){
            String[] tokens = item.split(",");
            unitPrice = Double.parseDouble(tokens[3]);
            qty = Integer.parseInt(tokens[4]);
            cost = unitPrice * qty;
            amountDue += cost;
        }
       
        return amountDue;
    }

}
