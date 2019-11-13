package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.techlabs.model.Student;

@Repository
public class StudentRepository {

	List<Student> students = new ArrayList<Student>();

	Student s1 = new Student("Ravi", 23, 8.2);
	Student s2 = new Student("Sunny", 21, 7.2);
	Student s3 = new Student("Nilam", 21, 7.7);

	public StudentRepository() {
		
		System.out.println("repo created...");
		students.add(s1);
		students.add(s2);
		students.add(s3);
	}

	public List<Student> getStudents() {
		return students;

	}

}
