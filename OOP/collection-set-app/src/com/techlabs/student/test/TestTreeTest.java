package com.techlabs.student.test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.techlabs.student.NameComparator;
import com.techlabs.student.Student;

public class TestTreeTest {

	public static void main(String[] args) {

		Student s1 = new Student(101, 10, "ABC", 7.5f);
		Student s2 = new Student(101, 10, "bac", 7.5f);
		Student s3 = new Student(102, 5, "XYZ", 8.2f);

		Set<Student> students;
		Set<Student> students1;
		students = new TreeSet<Student>();
		students1 = new TreeSet<Student>(new NameComparator());
		students.add(s3);
		students.add(s1);
		students.add(s2);
		
		students1.add(s3);
		students1.add(s1);
		students1.add(s2);

		System.out.println("Treeset size is: " + students.size());
	
		for (Student student : students) {
			System.out.print("Student name: " + student.getName() + " RollNo. are:" + student.getRollNo()
					+ " Standard is: " + student.getStandard());
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Treeset size is: " + students1.size());
		for (Student student : students1) {
			System.out.println("Student name: " + student.getName() + " RollNo. are:" + student.getRollNo()
					+ " Standard is: " + student.getStandard());
		}

	}

}
