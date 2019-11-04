package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.model.Contact;
import com.techlabs.service.ContactService;


@WebServlet("/edit")
public class EditContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public EditContactController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Inside Edit Controller\n ");
		int contactId = Integer.parseInt(request.getParameter("id"));
		System.out.println(request.getParameter("id"));

		ContactService contactService = ContactService.getInstance();
		Contact contact = contactService.get(contactId);

		request.setAttribute("setFName", contact.getFirstName());
		request.setAttribute("setLName", contact.getLastName());
		request.setAttribute("setContactNo", contact.getContactNo());		
		request.setAttribute("setEmail", contact.getEmailId());
		request.setAttribute("contactID", contactId);
		
		RequestDispatcher view = request.getRequestDispatcher("editContact.jsp");
		view.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int contactId = Integer.parseInt(request.getParameter("id"));
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		String emailId = request.getParameter("emailId");
		String contactNo = request.getParameter("contactNo");
		
		if ((!firstName.equals(null) && !firstName.equals("")) && (!lastName.equals(null) && !lastName.equals(""))
				&& (!emailId.equals(null) && !emailId.equals(""))
				&& (!contactNo.equals(null) && !contactNo.equals(""))) {
			
			System.out.println(firstName + "," + lastName);
//			int contactNumber = Integer.parseInt(request.getParameter("contactNo"));
			
			Contact contact = new Contact(firstName, lastName, contactNo, emailId);
			ContactService contactService = ContactService.getInstance();
			
			contactService.edit(contactId, contact);
			response.sendRedirect("/contacts-mvc-app/contacts");
			
		}

		else {
			
			System.out.println("this is Else");
			String errMsg = "* All Fields are Mandatory...!!!";
			request.setAttribute("errorLabel", errMsg);
			request.setAttribute("setFName", firstName);
			
			request.setAttribute("setLName", lastName);
			request.setAttribute("setContactNo", contactNo);
			request.setAttribute("contactID", contactId);
			
			request.setAttribute("setEmail", emailId);
			RequestDispatcher view = request.getRequestDispatcher("editContact.jsp");
			view.forward(request, response);

		}

	}

}
