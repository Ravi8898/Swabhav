package com.techlabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.model.Student;
import com.techlabs.repository.StudentRepository;

@Service
public class StudentService {

	public StudentService() {
		System.out.println("service created...");
	}
	@Autowired
	StudentRepository repo;

	public List<Student> getStudents() {
		return repo.getStudents();

	}

}
