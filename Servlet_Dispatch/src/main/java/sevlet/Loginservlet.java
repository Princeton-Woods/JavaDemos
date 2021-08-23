package sevlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Loginservlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		//If user enters t he correct info
		if(username.equals("admin") && password.equals("123")) {
			RequestDispatcher rd = req.getRequestDispatcher("welcomeervlet");
			rd.forward(req, res);
			
			
		} else {
			out.println("Sorry invalid username and password");
			RequestDispatcher rd = req.getRequestDispatcher("/Login.html");
			rd.include(req, res);
		}
		//out.close();
	}
}
