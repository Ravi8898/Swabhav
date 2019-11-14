package com.techlabs.actions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.entity.Student;
import com.techlabs.service.StudentService;

public class StudentAction implements Action {

	@Autowired
	StudentService service;
	@Override
	public String execute() throws Exception {
		System.out.println("Inside Action execute...");
		System.out.println(service.getStudents().size());
		
		List allStudents=service.getStudents();
		for (int i = 0; i < allStudents.size(); i++) {
			Student student = (Student) allStudents.get(i);
			System.out.println("Id: " + student.getId() + " Name: " + student.getName() + " CGPI:" + student.getCgpi());
		}
		return SUCCESS;
	}
	

}
