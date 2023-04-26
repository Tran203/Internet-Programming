/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.contoller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import za.ac.tut.model.RentalIncomeData;

/**
 *
 * @author Admin
 */
public class RentalPropertyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        //get options
        String areaCode = request.getParameter("areaCode");
        String monthCode = request.getParameter("monthCode");
        
        //Validate options && call necessary methods
         //declare
         String result = "";
         RentalIncomeData data = new RentalIncomeData();
        
        if(areaCode.equalsIgnoreCase("none") && monthCode.equalsIgnoreCase("none")){
            result="Please select a valid option";
        }else if(areaCode.equalsIgnoreCase("none") && (!(monthCode.equalsIgnoreCase("none")))){
            result = data.MonthData(monthCode);
        }else if((!areaCode.equalsIgnoreCase("none")) && monthCode.equalsIgnoreCase("none")){
            result = data.areaCodeData(areaCode);
        }
        
        //set atrribute so that the user can view data
        request.setAttribute("result", result);
        //Request Dispatcher
        RequestDispatcher disp = request.getRequestDispatcher("output.jsp");
        disp.forward(request, response);
    }
}
