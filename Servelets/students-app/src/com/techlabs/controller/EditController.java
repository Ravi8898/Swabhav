package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.Student;

@WebServlet("/edit")
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public EditController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Inside Edit Controller\n ");
		int studentId = Integer.parseInt(request.getParameter("id"));
		System.out.println(request.getParameter("id"));

		StudentService studentService = StudentService.getInstance();
		Student student = studentService.get(studentId);

		request.setAttribute("setName", student.getName());
		request.setAttribute("setCgpi", "" + student.getCgpi());
		request.setAttribute("studentID", studentId);

		RequestDispatcher view = request.getRequestDispatcher("editContact.jsp");
		view.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int studentId = Integer.parseInt(request.getParameter("id"));
		String studentName = request.getParameter("Name");
		String studentCgpi = request.getParameter("Cgpi");
		System.out.println(!studentName.equals(null) && !studentName.equals(""));

		if ((!studentName.equals(null) && !studentName.equals(""))
				&& (!studentCgpi.equals(null) && !studentCgpi.equals(""))) {
			
			System.out.println(studentName + "," + studentCgpi);
			String name = request.getParameter("Name");
			double cgpi = Double.parseDouble(request.getParameter("Cgpi"));

			Student student = new Student(name, cgpi);
			StudentService studentService = StudentService.getInstance();

			studentService.edit(studentId, student);
			response.sendRedirect("/students-app/students");
		}

		else {
			System.out.println("this is Else");

			String errMsg = "* All Fields are Mandatory...!!!";
			request.setAttribute("errorLabel", errMsg);
			request.setAttribute("studentID", studentId);
			request.setAttribute("setName", studentName);
			
			request.setAttribute("setCgpi", studentCgpi);
			RequestDispatcher view = request.getRequestDispatcher("edit.jsp");
			view.forward(request, response);

		}
	}

}
