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
import za.ac.tut.bl.AccountHolderFacadeLocal;
import za.ac.tut.entities.AccountHolder;

/**
 *
 * @author Student
 */
public class AddHolderServlet extends HttpServlet {
    @EJB
    private AccountHolderFacadeLocal pfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //get user data
        Long id = Long.parseLong(request.getParameter("id"));
        String name = request.getParameter("name");
        String city = request.getParameter("city");
        String code = request.getParameter("code");
        String cell = request.getParameter("cellNo");
        String email = request.getParameter("email");
        
        //creat acc holder
        AccountHolder ah = createAccount(id,name,city,code,cell,email);
        pfl.create(ah);
        
        request.setAttribute("name", name);
        
        //request
        RequestDispatcher disp = request.getRequestDispatcher("adding_accountHolder_outcome.jsp");
        disp.forward(request, response);
    }

    private AccountHolder createAccount(Long id, String name, String city, String code, String cell, String email) {
       AccountHolder ah = new AccountHolder();
       
       //set
       ah.setId(id);
       ah.setName(name);
       ah.setStreet(city);
       ah.setCode(code);
       ah.setCellNo(cell);
       ah.setEmailAddress(email);
       ah.setCreataionDate(new Date());
       
       return ah;
    }
}
