package com.techlabs.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.Student;

/**
 * Servlet implementation class AddController
 */
@WebServlet("/add")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside AddController doGet");
		String name=request.getParameter("Name");
		double cgpi=Double.parseDouble(request.getParameter("Cgpi"));
		Student student=new Student(name, cgpi);
		StudentService studentService=new StudentService();
		studentService.add(student);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside AddController doPost");
		doGet(request, response);
		response.sendRedirect("/students-app/students");
//		redi
	}

}
