/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.controller;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import za.ac.tut.model.AgeCategory;

/**
 *
 * @author Admin
 */
public class AgeCategoryServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //get age from the user
        Integer age = Integer.valueOf(request.getParameter("age"));
        //pass the age to be verified
        AgeCategory ac = new AgeCategory();
        String result = ac.ageResult(age);
        //set the results
        request.setAttribute("result", result);
        //request dispatcher
        RequestDispatcher disp = request.getRequestDispatcher("outcome.jsp");
        disp.forward(request, response);
    }

}
