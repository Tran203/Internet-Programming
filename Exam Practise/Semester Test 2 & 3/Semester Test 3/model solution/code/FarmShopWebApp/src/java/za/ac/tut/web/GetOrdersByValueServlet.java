/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.ejb.bl.CustomerOrderFacadeLocal;
import za.ac.tut.entities.CustomerOrder;

/**
 *
 * @author MemaniV
 */
public class GetOrdersByValueServlet extends HttpServlet {
    @EJB
    private CustomerOrderFacadeLocal cofl;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Double minOrderValue = Double.parseDouble(request.getParameter("minOrderValue"));
        Double maxOrderValue = Double.parseDouble(request.getParameter("maxOrderValue"));

        List<CustomerOrder> co = cofl.findAllByOrderValuesRange(minOrderValue, maxOrderValue);
        request.setAttribute("co", co);
        String url = "get_orders_by_value_outcome.jsp";

        RequestDispatcher disp = request.getRequestDispatcher(url);
        disp.forward(request, response);    
    }

}
