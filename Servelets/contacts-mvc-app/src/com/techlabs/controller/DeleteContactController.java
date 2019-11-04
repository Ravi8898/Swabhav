package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.service.ContactService;

/**
 * Servlet implementation class DeleteContactController
 */
@WebServlet("/delete")
public class DeleteContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteContactController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int contactId = Integer.parseInt(request.getParameter("id"));
		System.out.println(request.getParameter("id"));

		ContactService contactService = ContactService.getInstance();
		contactService.remove(contactId);
		response.sendRedirect("/contacts-mvc-app/contacts");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
