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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.ejb.bl.CartSBLocal;
import za.ac.tut.ejb.bl.CustomerOrderFacadeLocal;
import za.ac.tut.entities.Address;
import za.ac.tut.entities.CustomerOrder;
import za.ac.tut.entities.Item;

/**
 *
 * @author MemaniV
 */
public class PlaceOrderServlet extends HttpServlet {
    @EJB
    private CustomerOrderFacadeLocal cofl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        CartSBLocal col = (CartSBLocal)session.getAttribute("col");
        List<String> items = col.getItems();
        Double amtDue = (Double)session.getAttribute("amtDue");
        
        String street = request.getParameter("street");
        String area = request.getParameter("area");
        String code = request.getParameter("code"); 
        
        Address custAddr = createCustomerAddress(street, area, code);
        CustomerOrder custOrder = createCustomerOrder(items, amtDue, custAddr);
        
        cofl.create(custOrder);
        String url = "confirm_order.jsp";
        
        RequestDispatcher disp = request.getRequestDispatcher(url);
        disp.forward(request, response);        
    }

    private Address createCustomerAddress(String street, String area, String code) {
        Address ca = new Address();    
        ca.setStreet(street);
        ca.setArea(area);
        ca.setCode(code);
        return ca;
    }

    private CustomerOrder createCustomerOrder(List<String> items, Double amtDue, Address custAddr) {
        CustomerOrder co = new CustomerOrder();
        co.setItems(items);
        co.setOrderValue(amtDue);
        co.setCustomerAddress(custAddr);
        co.setCreationDate(new Date());
        return co;
    }
}
