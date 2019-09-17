package com.techlabs.student.test;

import java.util.Map;
import java.util.TreeMap;
import com.techlabs.student.Student;

public class TestTreeMap {

	public static void main(String[] args) {

		TreeMap<Student, Student> studentMap = new TreeMap<Student, Student>();

		Student s1 = new Student(101, 10, "ABC");
		Student s2 = new Student(101, 10, "ABC");
		Student s3 = new Student(102, 10, "ABC");
		Student s4 = new Student(103, 11, "XYZ");

		studentMap.put(s1, s2);

		System.out.println(studentMap);

		for (Map.Entry<Student, Student> entry : studentMap.entrySet()) {
			System.out.println("Key= " + entry.getKey() + " Value= " + entry.getValue());
		}
	}
}
