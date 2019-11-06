package com.techlabs.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

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
 * Servlet implementation class PassbookController
 */
@WebServlet("/passbook")
public class PassbookController extends HttpServlet {
	
	List<BankTxn> passbookList;
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PassbookController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Inside Passbook GET");
		HttpSession session = request.getSession();

		String userName = (String) session.getAttribute("UserName");
		BankService bankService = BankService.getInstance();
		passbookList = bankService.get(userName);

		request.setAttribute("passbooklist", passbookList);
		RequestDispatcher view = request.getRequestDispatcher("view/passbook.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/csv");
		response.setHeader("Content-Disposition", "attachment; filename=\"userPassbook.csv\"");
		
		try {
			OutputStream outputStream= response.getOutputStream();
			String outputResult="";
			for(BankTxn bankTxn:passbookList) {
				outputResult=outputResult+bankTxn.getName()+", "+bankTxn.getAmount()+", "+bankTxn.getTxnType()+", "+bankTxn.getTxnDate()+"\n";
			}
			outputStream.write(outputResult.getBytes());
			outputStream.flush();
			outputStream.close();
		}
		
		catch(Exception e){
			e.printStackTrace();
			
		}
	}

}
