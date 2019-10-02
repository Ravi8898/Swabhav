package com.techlabs.college.test;

import com.techlabs.college.BranchCategory;
import com.techlabs.college.College;
import com.techlabs.college.Professor;
import com.techlabs.college.Student;

public class CollegeTest {

	public static void main(String[] args) {

		College vivaCollege = new College("VIVA", "0523", "VIRAR");
					
		collegeInfo(vivaCollege);
	}

	public static void collegeInfo(College clg) {

		System.out.println(
				"ClgName:" + clg.getClgName() + " ClgID: " + clg.getClgId() + " ClgAddress:" + clg.getClgAddress());
		for (Professor professor : clg.getProfessorsList()) {
			System.out.println("Professor ID: " + professor.getId() + " Professor Address: " + professor.getAddress()
					+ " Professor DOB: " + professor.getDob() + "Professor Salary: " + professor.getSalary());
		}
		for (Student student : clg.getStudentsList()) {
			System.out.println("Student ID: " + student.getId() + " Student Address: " + student.getAddress()
					+ " Student Branch: " + student.getBranch() + " Student DOB: " + student.getDob());
		}
		System.out.println();
	}

}
