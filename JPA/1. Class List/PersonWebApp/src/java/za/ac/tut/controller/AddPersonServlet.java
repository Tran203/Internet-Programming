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
public class AddPersonServlet extends HttpServlet {
    @EJB
    private PersonFacadeLocal pfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //get user data
        String name =  request.getParameter("name");
        String surname = request.getParameter("surname");
        String gender = request.getParameter("gender");
        
        //create a person
        Person person = createPerson(name,surname,gender);
        
        //request
        RequestDispatcher disp=  request.getRequestDispatcher("");
        disp.forward(request, response);
    }

    private Person createPerson(String name, String surname, String gender) {
        Person p =new Person();
        
        //set
        p.setName(name);
        p.setSurname(surname);
        p.setSex(gender);
        
        return p;
    }
}
