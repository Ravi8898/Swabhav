package com.techlabs.controller;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Student;

public class StudentService {
	List<Student> studentList;
	Student student1 = new Student("Ravi", 8.5);
	Student student2 = new Student("Sunny", 7.3);
	Student student3 = new Student("Nilam", 7.6);
	Student student4 = new Student("Floyd", 8.9);
	Student student5 = new Student("Akash", 8.8);

	public StudentService() {
		System.out.println("this is service");
		studentList = new ArrayList<Student>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		
	}

	public List<Student> get() {
		return studentList;
	}
	
	public void add(Student student) {
		studentList.add(student);
		System.out.println(studentList.size());
	}
}
