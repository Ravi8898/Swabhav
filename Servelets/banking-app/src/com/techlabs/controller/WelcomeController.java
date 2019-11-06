package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.listener.SessionCounter;
import com.techlabs.service.BankService;


@WebServlet("/welcome")
public class WelcomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public WelcomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BankService bankService = BankService.getInstance();
		
		HttpSession session = request.getSession();
		String name= (String)session.getAttribute("UserName");
		System.out.println(name);
		
		double userBal= bankService.getBalance(name);
		session.setAttribute("userBal", userBal);
		System.out.println("Balance is:"+userBal);
		
		SessionCounter sessionCounter=new SessionCounter();
		int sessionCount=sessionCounter.getTotalSessionCount();
		session.setAttribute("totalVisitor", sessionCount);
		
		RequestDispatcher view = request.getRequestDispatcher("view/welcome.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
