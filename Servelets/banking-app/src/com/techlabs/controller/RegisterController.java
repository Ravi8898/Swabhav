package com.techlabs.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.BankMaster;
import com.techlabs.model.BankTxn;
import com.techlabs.service.BankService;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/register")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher view = request.getRequestDispatcher("view/register.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("inside register post");

		String name = request.getParameter("Username");
		String password = request.getParameter("Password");
		String reTypePassword = request.getParameter("ReTypePassword");
		
		String openbalance = request.getParameter("Openbalance");
		boolean checkNumber=openbalance.matches("\\d+(\\.\\d+)?");
		

		if ((name != null && !name.equals("")) && (password != null && !password.equals(""))
				&& (reTypePassword != null && !reTypePassword.equals("")) 
				&& (name != null && !name.equals("")) && (openbalance != null && !openbalance.equals("") 
				&& checkNumber && password.equals(reTypePassword))) {

			System.out.println(name + "," + password);
			double openBal=Double.parseDouble(request.getParameter("Openbalance")); 
//			int contactNumber = Integer.parseInt(request.getParameter("contactNo"));

			BankMaster bankMaster = new BankMaster(name, password, openBal);
			BankTxn bankTxn = new BankTxn(name, openBal, "D", new Date(Calendar.getInstance().getTime().getTime()));
			
			BankService bankService = BankService.getInstance();
			bankService.addAccount(bankMaster, bankTxn);

			response.sendRedirect("/banking-app/login");

		} else {
			System.out.println("this is Else");
			String errMsg = "* All Fields are Mandatory...!!! or you entered something in wrong format";
			request.setAttribute("errorMsg", errMsg);
			
			request.setAttribute("Username", name);
			RequestDispatcher view = request.getRequestDispatcher("view/register.jsp");
			view.forward(request, response);

		}

	}
}
