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
import javax.servlet.http.HttpSession;

import com.techlabs.model.BankTxn;
import com.techlabs.service.BankService;

/**
 * Servlet implementation class TransactionController
 */
@WebServlet("/transaction")
public class TransactionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TransactionController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher view = request.getRequestDispatcher("view/transaction.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Inside transaction POST");
		HttpSession session=request.getSession();
		String name = (String) session.getAttribute("UserName");
		String txnAmount = request.getParameter("txnAmount");
		String txnType = request.getParameter("txnType");

		boolean checkNumber = txnAmount.matches("\\d+(\\.\\d+)?");
		System.out.println("CHeck number: "+checkNumber);
		
		if (checkNumber) {
			
			System.out.println("CHeck number: "+checkNumber);
			double txnAmnt = Double.parseDouble(txnAmount);

			BankTxn bankTxn = new BankTxn(name, txnAmnt, txnType, new Date(Calendar.getInstance().getTime().getTime()));
			BankService bankService = BankService.getInstance();
			bankService.updateAccount(bankTxn);

			response.sendRedirect("/banking-app/welcome");

		}

	}

}
