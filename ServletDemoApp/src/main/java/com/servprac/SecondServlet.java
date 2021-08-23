package com.servprac;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class SecondServlet extends GenericServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws IOException {
		res.setContentType("text/html");;
		PrintWriter out = res.getWriter();
		//out.println("<h1>Welcome to Register Servlet</h1>");
		
		 String username = req.getParameter("User_name");
		 String password = req.getParameter("User_password");


		 String agreement = req.getParameter("agreement");
		 

		 
		 if(agreement.equals("accepted")) {
			 out.println("<h1>Username:  "+ username +"</h1>");
			 out.println("<h1>Password:  "+ password +"</h1>");
			 
			 //out.println("<h1>Password "+ password +"</h1>");
//			 out.println("<h1>Gender "+ gender +"</h1>");
//			 out.println("<h1>City "+ city +"</h1>");
		 }else {
			 out.println("<h1>you have not accepted terms and conditions</h1>");
		 }
	}
}
