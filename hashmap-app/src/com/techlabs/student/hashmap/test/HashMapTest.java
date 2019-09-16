package com.techlabs.student.hashmap.test;

import java.util.HashMap;
import java.util.Map;

import com.techlabs.student.Student;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<Student, Student> studentMap = new HashMap<Student, Student>();
		Student s1=new Student(101, 10, "ABC");
		Student s2=new Student(101, 10, "ABC");
		Student s3=new Student(102, 10, "ABC");
		Student s4=new Student(103, 11, "XYZ");
		
		
		studentMap.put(s1, s2);
		
		System.out.println(studentMap);
		
		for (Map.Entry<Student, Student> entry : studentMap.entrySet()) {
			System.out.println("Key= " + entry.getKey() + " Value= " + entry.getValue());
		}
	}

}
