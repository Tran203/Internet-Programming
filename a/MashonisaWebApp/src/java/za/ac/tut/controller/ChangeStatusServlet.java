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
            //Client client1 = editStatus(id, status);
            //update database
            //client.edit(client1);

            Client c = editLoanApplication(id, status);
            client.create(c);

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
        //Loan_application application = new Loan_application();
        Loan_application application = c.getApplication();

        //set status
        application.setStatus(status);

        loan.edit(application);

        //save
        //update application
        c.setApplication(application);

        return c;
    }

    private Client editLoanApplication(Long id, String status) {
        //find client
        Client c = client.find(id);
        Loan_application application = new Loan_application();

        //DELETE CLIENT
        Client d = c;
        c = removeC(id);
        client.remove(c);

        //
        Long id_num = d.getId();
        String name = d.getName();
        String surname = d.getSurname();
        String username = d.getUsername();
        String password = d.getPassword();
        String gender = d.getGender();
        String cellNo = d.getCellNo();
        String age = d.getAge();
        String occupation = d.getOccupation();
        String address = d.getAddress();

        Long accNo = d.getApplication().getAccNo();
        String bankAcc = d.getApplication().getBankAcc();
        Double incomeAmt = d.getApplication().getIncomeAmt();
        String incomeType = d.getApplication().getIncomeType();
        Double loanAmnt = d.getApplication().getLoanAmnt();
        String loanTerm = d.getApplication().getLoanTerm();

        //set
        application.setAccNo(accNo);
        application.setBankAcc(bankAcc);
        application.setIncomeAmt(incomeAmt);
        application.setIncomeType(incomeType);
        application.setLoanAmnt(loanAmnt);
        application.setLoanTerm(loanTerm);
        application.setStatus(status);

        //set
        d.setId(id_num);
        d.setName(name);
        d.setSurname(surname);
        d.setUsername(username);
        d.setPassword(password);
        d.setGender(gender);
        d.setAge(age);
        d.setCellNo(cellNo);
        d.setOccupation(occupation);
        d.setAddress(address);

        // loan.edit(application);
        //update
        d.setApplication(application);

        return d;
    }

    private Client removeC(Long id) {
        Client c = new Client();
        //remove loan
        
        
        c.setId(id);
        
        return c;
    }
}
