/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.entities.Account;
import za.ac.tut.entities.AccountHolder;

/**
 *
 * @author Student
 */
public class CreateAccountServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //GET DETAILS
     Long id = Long.parseLong(request.getParameter("id"));
     String name = request.getParameter("name");
     String surname = request.getParameter("surname");
     String gender = request.getParameter("gender");
     Integer age = Integer.parseInt(request.getParameter("age"));
     Date dateOfBirth = new Date();
    String status = request.getParameter("status");
    //acc details
    String accountType = request.getParameter("type");
    Double balance = Double.parseDouble(request.getParameter("balance"));
    
    //create
    AccountHolder accountHlder = createHolder(id,name,surname,gender,age,dateOfBirth,status);
    Account account = createAccount(accountType,balance,accountHlder);

    //request
    RequestDispatcher disp = request.getRequestDispatcher("");

    disp.forward (request, response);
}

    private AccountHolder createHolder(Long id, String name, String surname, String gender, Integer age, Date dateOfBirth, String status) {
        AccountHolder accountHlder = new AccountHolder();
        
        //set
        accountHlder.setId(id);
        accountHlder.setName(name);
        accountHlder.setSurname(surname);
        accountHlder.setGender(gender);
        accountHlder.setAge(age);
        accountHlder.setDateOfBirth(dateOfBirth);
        
        return accountHlder;
    }

    private Account createAccount(String accountType, Double balance, AccountHolder accountHlder) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
