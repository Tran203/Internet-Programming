/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.ejb.bl.CustomerFacadeLocal;
import za.ac.tut.entities.Contact;
import za.ac.tut.entities.Customer;

/**
 *
 * @author Student
 */
public class AddCustomerServlet extends HttpServlet {
    @EJB
    private CustomerFacadeLocal cfl;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        Integer age = Integer.parseInt(request.getParameter("age"));
        Character gender = request.getParameter("gender").charAt(0);
        Boolean status = Boolean.parseBoolean(request.getParameter("status"));
        String contact = request.getParameter("contact");
        
        Customer customer = createCustomer(id, name, surname, age, gender, status, contact);
        cfl.create(customer);
        
        RequestDispatcher disp = request.getRequestDispatcher("add_customer_outcome.jsp");
        disp.forward(request, response);
    }

    private Customer createCustomer(Long id, String name, String surname, Integer age, Character gender, Boolean status, String myContact) {
        Contact contact = new Contact();
        contact.setContactValue(myContact);
        
        Customer customer = new Customer();
        customer.setId(id);
        customer.setName(name);
        customer.setSurname(surname);
        customer.setAge(age);
        customer.setGender(gender);
        customer.setStatus(status);
        customer.setContact(contact);
        customer.setCreationDate(new Date());
        return customer;
    }

}
