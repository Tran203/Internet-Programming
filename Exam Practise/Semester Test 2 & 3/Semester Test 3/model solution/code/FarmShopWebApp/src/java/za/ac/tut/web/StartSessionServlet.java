/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.ejb.bl.CartSBLocal;

/**
 *
 * @author MemaniV
 */
public class StartSessionServlet extends HttpServlet {
    @EJB
    private CartSBLocal col;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        String name = request.getParameter("name");
        String role = request.getParameter("role");
        String url;
        
        if(role.equals("manager")){
            url = "managerMenu.jsp";
        } else {
            url = "customerMenu.jsp";
            session.setAttribute("col", col);
        }
        
        session.setAttribute("name", name);          
        
        RequestDispatcher disp = request.getRequestDispatcher(url);
        disp.forward(request, response);
    }

}
