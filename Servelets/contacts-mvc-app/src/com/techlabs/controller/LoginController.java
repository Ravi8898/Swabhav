package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher view = request.getRequestDispatcher("login.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String UserName=request.getParameter("Username");
		String password=request.getParameter("Password");
		
		if(validate(UserName,password)) {
			HttpSession session = request.getSession();
			session.setAttribute("UserName", UserName);
			response.sendRedirect("/contacts-mvc-app/contacts");
			
		}
		else {
			request.setAttribute("errorMsg", "Invalid UserId and Password");
			RequestDispatcher view = request.getRequestDispatcher("login.jsp");
			view.forward(request, response);
		}
		

	}

	private boolean validate(String userName, String password) {
		
		String dummyName="Admin";
		String dummyPassword="Admin";
		
		if(userName.equals(dummyName) && password.equals(dummyPassword)) {
			return true;
		}
		return false;
//		select * from user where userName="" and password="";
 		
	}

}
