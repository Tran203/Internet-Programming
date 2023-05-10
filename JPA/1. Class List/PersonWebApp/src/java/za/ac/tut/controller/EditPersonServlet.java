/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
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
public class EditPersonServlet extends HttpServlet {
    @EJB
    private PersonFacadeLocal pfl;
 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //get user data
        Long id =  Long.parseLong(request.getParameter("id"));
        String surname = request.getParameter("surname");
        
        //
        Person person = createPerson(id,surname);
        pfl.edit(person);
        
        request.setAttribute("person", person);
        
        //request
        RequestDispatcher disp=  request.getRequestDispatcher("./outcome_pages/edit_person_outcome.jsp");
        disp.forward(request, response);
    }

    private Person createPerson(Long id, String surname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
