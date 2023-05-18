/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
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
public class GetItemsServlet2 extends HttpServlet {

     @EJB   
    private ItemsFacadeLocal ifl;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //get the updated items from the database
        List<Items> item = ifl.findAll();
        
        
        request.setAttribute("item", item);
        
         RequestDispatcher disp = request.getRequestDispatcher("customer.jsp");
        disp.forward(request, response);
    }
}
