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
import za.ac.tut.bl.ClientFacadeLocal;
import za.ac.tut.bl.Loan_applicationFacadeLocal;
import za.ac.tut.entities.Client;
import za.ac.tut.entities.Loan_application;

/**
 *
 * @author Student
 */
public class ChangeStatusServlet extends HttpServlet {

    @EJB
    private ClientFacadeLocal client;
    private Loan_applicationFacadeLocal loan;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //get client id
        Long id = Long.parseLong(request.getParameter("clientId"));
        String status = request.getParameter("response");

        if (status.equalsIgnoreCase("Accept") || status.equalsIgnoreCase("Reject")) {
            //find the client
            Client client1 = editStatus(id, status);
            //update database
            client.edit(client1);
            
            String name = client.find(id).getName();
            String surname = client.find(id).getSurname();
            

            //pass 
            request.setAttribute("status", status);
            request.setAttribute("name", name);
            request.setAttribute("surname", surname);

            //go to outcome
            RequestDispatcher disp = request.getRequestDispatcher("status_change.jsp");
            disp.forward(request, response);
        } else {
            //go to menu
            RequestDispatcher disp = request.getRequestDispatcher("adminMenu.jsp");
            disp.forward(request, response);
        }

    }

    private Client editStatus(Long id, String status) {
        //find client
        Client c = client.find(id);
        Loan_application application = c.getApplication();

        //set status
        application.setStatus(status);
        
        loan.edit(application);
        
        //save
       

        //update application
        c.setApplication(application);

        return c;
    }
}
