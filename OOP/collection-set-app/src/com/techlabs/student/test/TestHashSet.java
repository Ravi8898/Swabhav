package com.techlabs.student.test;

import java.util.HashSet;
import java.util.Set;

import com.techlabs.student.Student;

public class TestHashSet {
	
	public static void main(String[] args) {
		
		Student s1=new Student(101, 10, "ABC", 7.5f);
		Student s2=new Student(101, 10, "ABC", 7.5f);
		Student s3=new Student(102, 5, "XYZ", 8.2f);
		
		Set<Student> students;
		students=new HashSet<Student>();
		students.add(s1);
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		System.out.println("Size of the set is: "+students.size());
	}
	
	
}
