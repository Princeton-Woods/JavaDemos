package com.princeton;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/addUser")
public class Servlet6 extends HttpServlet{
	

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		UserDAO dao = UserDAOFactory.getUserDao();

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name =  request.getParameter("uname");
		String email =  request.getParameter("email");
		String country =  request.getParameter("country");
		String gender =  request.getParameter("gender");
		String show =  request.getParameter("show");
		int type =Integer.parseInt( request.getParameter("type"));

		// getting the value from query string
		
		if(type == 1) {
			out.println("User has been added! ");
			out.println("<div> Welcome to your profile " + name + " </div>");
			out.println("<div> Your email is: " + name + " </div>");
			out.println("<div> Your country of residence is: " + name + " </div>");
			out.println("<div> Your gender is: " + name + " </div>");
			try {
				dao.addUser(new User(name,email,country,gender));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(type == 2) {
			out.println("Updates have been saved! ");
			try {
				dao.addUser(new User(name,email,country,gender));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(type == 3) {
			out.println("User has been deleted! ");
			try {
				dao.deleteUser(email);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(show != null) {
			try {
				dao.getUsers(out);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//RequestDispatcher rd = request.getRequestDispatcher("/index.html");
		//((HttpServletResponse) rd).sendRedirect("localhost:8080/Assignment/index.html");	//http://localhost:8080/Assignment/index.html

		out.close();
	}
}
