/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
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
public class AddItemToCartServlet extends HttpServlet {   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        Long id = Long.parseLong(request.getParameter("id"));
        Integer qty = Integer.parseInt(request.getParameter("qty"));
        List<Item> items = (List<Item>)session.getAttribute("items");
        Integer code = getCode(items, id);
        String desc = getDescription(items, id);
        Double unitPrice = getUnitPrice(items, id);
                
        Item item = createItem(id, code, desc, unitPrice, qty);
        CartSBLocal col = (CartSBLocal)session.getAttribute("col");
        col.addItem(item.toString());
        session.setAttribute("col", col);
        String url = "confirm_item_addition.jsp";
               
        RequestDispatcher disp = request.getRequestDispatcher(url);
        disp.forward(request, response);
    }

    private Item createItem(Long id, Integer code, String desc, Double price, Integer qty) {
        Item item = new Item();
        item.setId(id);
        item.setCode(code);
        item.setDescription(desc);
        item.setUnitPrice(price);
        item.setQuantity(qty);
        return item;
    }

    private String getDescription(List<Item> items, Long id) {
        String desc = "";
        for(Item item:items){
            if(item.getId().equals(id)){
                desc = item.getDescription();
                break;
            }
        }
        
        return desc;
    }

    private Double getUnitPrice(List<Item> items, Long id) {
        Double unitPrice = 0.0;

        for(Item item:items){
            if(item.getId().equals(id)){
                unitPrice = item.getUnitPrice();
                break;
            }
        }
        
        return unitPrice;   
    }

    private Integer getCode(List<Item> items, Long id) {
        Integer code = 0;
        
        for(Item item:items){
            if(item.getId().equals(id)){
                code = item.getCode();
                break;
            }
        }
        
        return code;
    }

}