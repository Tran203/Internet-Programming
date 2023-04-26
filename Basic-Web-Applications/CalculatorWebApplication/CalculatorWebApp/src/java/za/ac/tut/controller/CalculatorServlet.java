package za.ac.tut.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.ArithmeticOperator;
import za.ac.tut.model.ArithmeticOperatorException;

/**
 *
 * @author Student
 */
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            //get values from the user
            Integer num1 = Integer.parseInt(request.getParameter("num1"));
            Integer num2 = Integer.parseInt(request.getParameter("num2"));
            Character op = (request.getParameter("operator")).charAt(0);
            
            //Perform Arithmetic operations
            ArithmeticOperator ap = new ArithmeticOperator();
            
            String result = ap.getResult(num1,num2,op);
            
            //pass results back to user
            request.setAttribute("num1", num1);
            request.setAttribute("num2", num2);
            request.setAttribute("op", op);
            request.setAttribute("result", result);
            
            
            //RequestDispatcher
            RequestDispatcher disp = request.getRequestDispatcher("output.jsp");
            disp.forward(request, response);
        } catch (ArithmeticOperatorException ex) {
            RequestDispatcher disp = request.getRequestDispatcher("arithmetic_operator_error_page.jsp");
            disp.forward(request, response);
        }
    }
}
