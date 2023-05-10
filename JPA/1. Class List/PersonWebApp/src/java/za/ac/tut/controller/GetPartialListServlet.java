/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.bl.PersonFacadeLocal;
import za.ac.tut.entities.Person;

/**
 *
 * @author Student
 */
public class GetPartialListServlet extends HttpServlet {
@EJB
    private PersonFacadeLocal pfl;
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       Integer min = Integer.parseInt(request.getParameter("min"));
       Integer max = Integer.parseInt(request.getParameter("max"));
       
       int[] range = {min, max};
       
       List<Person> list = pfl.findRange(range);
       
       request.setAttribute("min", min);
       request.setAttribute("max", max);
       request.setAttribute("list", list);
        
        //request
        RequestDispatcher disp=  request.getRequestDispatcher("./outcome_pages/get_partial_list_outcome.jsp");
        disp.forward(request, response);
    }
}
