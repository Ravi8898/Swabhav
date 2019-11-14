package com.techlabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.entity.Student;
import com.techlabs.repository.StudentRepository;

@Service("studentSvc")
public class StudentService {

	@Autowired
	StudentRepository repo;
	
	public StudentService() {

	System.out.println("Service Created...");
	}
	
	public List<Student> getStudents() {
		return repo.getStudents();
		
	}
}
