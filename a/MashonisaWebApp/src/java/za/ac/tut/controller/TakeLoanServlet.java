/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.bl.ClientFacadeLocal;
import za.ac.tut.bl.Loan_applicationFacadeLocal;
import za.ac.tut.entities.Client;
import za.ac.tut.entities.Loan_application;

/**
 *
 * @author Student
 */
public class TakeLoanServlet extends HttpServlet {

    @EJB
    private ClientFacadeLocal client;
    
    private Loan_applicationFacadeLocal loan;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession  session = request.getSession(true);
        
        String incomeType = (String)request.getParameter("incomeType");
        Double loanAmnt = Double.parseDouble(request.getParameter("loanAmnt"));
        Double incomeAmt = Double.parseDouble(request.getParameter("incomeAmt"));
        String bankAcc = (String)request.getParameter("bankAcc");
        Long accNo = Long.parseLong(request.getParameter("accNo"));
        String loanTerm = (String)request.getParameter("loanTerm");
        
        
        String status = "Pending";
        
        //get our client information
        Client client1 =(Client)session.getAttribute("client");
        Long id = client1.getId();
        
        //edit client
        client1 = editLoanApplication(incomeType,loanAmnt,incomeAmt,bankAcc,accNo,loanTerm,status,id);
        client.edit(client1);
        
        //request
        request.setAttribute("loanAmnt", loanAmnt);
        request.setAttribute("loanTerm", loanTerm);
        
        RequestDispatcher disp = request.getRequestDispatcher("take_loan_outcome.jsp");
        disp.forward(request, response);
        
   
    }

    private Client editLoanApplication(String incomeType, double loanAmnt, Double incomeAmt, String bankAcc, Long accNo, String loanTerm, String status, Long id) {
        //find client
        Client c = client.find(id);
       Loan_application application = new Loan_application();
       //Loan_application application = c.getApplication();
       
       //set
       application.setAccNo(accNo);
       application.setBankAcc(bankAcc);
       application.setIncomeAmt(incomeAmt);
       application.setIncomeType(incomeType);
       application.setLoanAmnt(loanAmnt);
       application.setLoanTerm(loanTerm);
       application.setStatus(status);
       
       
       loan.edit(application);
       
       //update
       c.setApplication(application);
       
       return c;
    }
}
