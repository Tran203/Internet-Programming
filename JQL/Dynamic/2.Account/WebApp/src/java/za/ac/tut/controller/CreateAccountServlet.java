/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.bl.AccountFacadeLocal;
import za.ac.tut.entities.Account;
import za.ac.tut.entities.AccountHolder;

/**
 *
 * @author Student
 */
public class CreateAccountServlet extends HttpServlet {

    @EJB
    private AccountFacadeLocal afl;

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
        AccountHolder accountHlder = createHolder(id, name, surname, gender, age, dateOfBirth, status);
        Account account = createAccount(accountType, balance, accountHlder);

        //insert into database
        afl.create(account);

        //request
        RequestDispatcher disp = request.getRequestDispatcher("./admin/create_acount_outcome.jsp");
        disp.forward(request, response);
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
        Account a = new Account();
        //set
        a.setAccountType(accountType);
        a.setBalance(balance);
        a.setCreationDate(new Date());
        a.setAccountHlder(accountHlder);

        return a;
    }
}
