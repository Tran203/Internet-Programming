/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.util.List;
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
public class EndSessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        HttpSession session = request.getSession();
        
        if(session.isNew()){
           System.out.println("New session");
        } else {
            System.out.println("Old session");
        }
        CartSBLocal col = (CartSBLocal)session.getAttribute("col");
        List<String> emptyList = col.emptyList();
        col.setList(emptyList);
        session.setAttribute("col", col);
        session.invalidate();
        String url = "index.html";       
        
        RequestDispatcher disp = request.getRequestDispatcher(url);
        disp.forward(request, response);
    }
}
