/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.PasswordCheckHelper;

/**
 *
 * @author Student
 */
public class PasswordServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //get password
        String password = request.getParameter("password");

        //call for help
        PasswordCheckHelper help = new PasswordCheckHelper();
        String status = help.checkMyPassword(password);

        //if
        if (!(status.equalsIgnoreCase("Approved"))) {
            //request dispatcher
            RequestDispatcher disp = request.getRequestDispatcher("outcome");
        } else {
            //request dispatcher
            RequestDispatcher disp = request.getRequestDispatcher("result");
        }
    }
}
