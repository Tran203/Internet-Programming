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
public class GetListServlet extends HttpServlet {
     @EJB
    private PersonFacadeLocal pfl;
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //get ALL
        List<Person> list = pfl.findAll();
        
        //pass back to user
        request.setAttribute("list", list);
        
        //request
        RequestDispatcher disp=  request.getRequestDispatcher("./outcome_pages/get_all_outcome.jsp");
        disp.forward(request, response);
    }
}
