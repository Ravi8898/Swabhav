package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.service.BankService;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public LoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("inside login get");
		RequestDispatcher view = request.getRequestDispatcher("view/login.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		BankService bankService = BankService.getInstance();
		String UserName = request.getParameter("Username");
		String password = request.getParameter("Password");
		
		
		if (bankService.validate(UserName, password)) {
			System.out.println("This is login validation");
			HttpSession session = request.getSession();
			
			session.setAttribute("UserName", UserName);
			response.sendRedirect("/banking-app/welcome");

		} else {
			request.setAttribute("errorMsg", "Invalid UserId and Password");
			request.setAttribute("registerNow", "Register Now");
			RequestDispatcher view = request.getRequestDispatcher("view/login.jsp");
			view.forward(request, response);
		}

	}

}
