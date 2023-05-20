/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.bl.Order_InfoFacadeLocal;
import za.ac.tut.entities.Order_Info;

/**
 *
 * @author Student
 */
public class SearchOrderUsingRange extends HttpServlet {
    @EJB
    private Order_InfoFacadeLocal ofl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //get the range values
        Integer min = Integer.parseInt(request.getParameter("min"));
        Integer max = Integer.parseInt(request.getParameter("max"));
        
        //serch
        List<Order_Info> list = ofl.findOrdersUsingRange(min, max);
        
        
        //request
        RequestDispatcher disp = request.getRequestDispatcher("order_info_outcome.jsp");
        disp.forward(request, response);
    }
}
