package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.Contact;
import com.techlabs.service.ContactService;

/**
 * Servlet implementation class AddContactController
 */
@WebServlet("/add")
public class AddContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddContactController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Inside Add Contact Controller doGet");

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String emailId = request.getParameter("emailId");
		String contactNo = request.getParameter("contactNo");

		if ((!firstName.equals(null) && !firstName.equals("")) && (!lastName.equals(null) && !lastName.equals(""))
				&& (!emailId.equals(null) && !emailId.equals(""))
				&& (!contactNo.equals(null) && !contactNo.equals(""))) {
			
			System.out.println(firstName + "," + lastName);
			int contactNumber = Integer.parseInt(request.getParameter("contactNo"));

			Contact contact = new Contact(firstName, lastName, contactNumber, emailId);
			ContactService contactService = ContactService.getInstance();
			contactService.add(contact);
			response.sendRedirect("/contacts-mvc-app/contacts");
		}

		else {
			System.out.println("this is Else");
			String errMsg = "* All Fields are Mandatory...!!!";
			request.setAttribute("errorLabel", errMsg);
			
			request.setAttribute("setFName", firstName);
			request.setAttribute("setLName", lastName);
			request.setAttribute("setContactNo", contactNo);
			
			request.setAttribute("setEmail", emailId);
			RequestDispatcher view = request.getRequestDispatcher("addContact.jsp");
			view.forward(request, response);

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
