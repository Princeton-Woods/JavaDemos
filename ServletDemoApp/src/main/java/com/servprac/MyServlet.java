package com.servprac;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class MyServlet implements Servlet {
	
	ServletConfig config = null;
	
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		this.config = arg0;
		System.out.println("Servlet is inatialized");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
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
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
		System.out.println("Servlet is destroyed");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "Servlet created bt admin";
	}



}
