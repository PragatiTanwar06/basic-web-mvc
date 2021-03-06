package com.springMVC;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Browser sends Http Request to Web Server
 * 
 * Code in Web Server => Input:HttpRequest, Output: HttpResponse
 * JEE with Servlets
 * 
 * Web Server responds with Http Response
 */

//Java Platform, Enterprise Edition (Java EE) JEE6

//Servlet is a Java programming language class 
//used to extend the capabilities of servers 
//that host applications accessed by means of 
//a request-response programming model.

//1. extends javax.servlet.http.HttpServlet
//2. @WebServlet(urlPatterns = "/login.do")
//3. doGet(HttpServletRequest request, HttpServletResponse response)
//4. How is the response created?

@WebServlet(urlPatterns="/spring-mvc/")
public class LoginServlet extends HttpServlet{	
	 protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	 {
		 req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, res);
	 }
	 protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	 {
		 String name = req.getParameter("name");
		 String pass = req.getParameter("pass");
		 
		 if(name.equals("Pragati") && pass.equals("shiv"))
			 req.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(req, res);
		 else
		 {
			 req.setAttribute("errorMessage","Authentication not successful!!" );
			 req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, res);
		 }
			 
	 }
}
