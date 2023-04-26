package za.ac.tut.controller;

import za.ac.tut.model.Calculation;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;

public class AdditionServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
	 //collect data using http request
	 Integer num1 = Integer.parseInt(request.getParameter("num1"));
	 Integer num2 = Integer.parseInt(request.getParameter("num2"));
	 
	 //call the method to do the calculation
	 Calculation cal = new Calculation();
	 Integer sum = cal.AdditionMethod(num1,num2);
	 
	 //set Attributes *make it easy to use them again
	 request.setAttribute("num1", num1);
	 request.setAttribute("num2", num2);
	 request.setAttribute("sum", sum);
	 
	 //allow data to be displayed via RequestDispatcher
	 RequestDispatcher disp = request.getRequestDispatcher("sum_output.jsp");
	 //
	 disp.forward(request,response);
	 
	
	}
}