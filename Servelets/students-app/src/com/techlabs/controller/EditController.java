package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.Student;

/**
 * Servlet implementation class EditController
 */
@WebServlet("/edit")
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditController() {
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
		System.out.println("Inside Edit Controller\n ");
		int studentId = Integer.parseInt(request.getParameter("id"));
		System.out.println(request.getParameter("id"));

		StudentService studentService = StudentService.getInstance();
		Student student = studentService.get(studentId);
		String studentName = student.getName();
		double studentCgpi = student.getCgpi();
		
		request.setAttribute("setName", studentName);
		request.setAttribute("setCgpi", studentCgpi);
		request.setAttribute("studentID", studentId);
		
		RequestDispatcher view1 = request.getRequestDispatcher("edit.jsp");
		view1.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int studentId = Integer.parseInt(request.getParameter("id"));
		String studentName = request.getParameter("Name");
		String studentCgpi = request.getParameter("Cgpi");
		System.out.println(!studentName.equals(null) && !studentName.equals(""));
		
		if((!studentName.equals(null) && !studentName.equals("")) && (!studentCgpi.equals(null) && !studentCgpi.equals(""))) {
			System.out.println(studentName+","+studentCgpi);
			String name = request.getParameter("Name");
			double cgpi = Double.parseDouble(request.getParameter("Cgpi"));
			
			Student student = new Student(name, cgpi);
			StudentService studentService = StudentService.getInstance();
			
			studentService.edit(studentId, student);
			response.sendRedirect("/students-app/students");
		}
		
		else {
			System.out.println("this is Else");
//			response.sendRedirect("/students-app/add.jsp");
			String errMsg="* All Fields are Mandatory...!!!";
			request.setAttribute("errorLabel", errMsg);
			request.setAttribute("setName", studentName);
			request.setAttribute("setCgpi", studentCgpi);
			RequestDispatcher view=request.getRequestDispatcher("edit.jsp");
			view.forward(request, response);
			
			
		}
//		doGet(request, response);
	}

}
