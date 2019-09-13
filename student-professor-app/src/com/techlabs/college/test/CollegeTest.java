package com.techlabs.college.test;

import java.util.ArrayList;

import com.techlabs.college.BranchCategory;
import com.techlabs.college.College;
import com.techlabs.college.Person;
import com.techlabs.college.Professor;
import com.techlabs.college.Student;

public class CollegeTest {
	
	
	public static void main(String[] args) {
		
		list.add(new Professor("VIRAR_EAST", "10/02/1996", 8, 30));
		list.add(new Student("Bhayander", "30/02/1995", BranchCategory.EXTC));
		list.add(new Student("Dahisar", "01/01/1998", BranchCategory.COMPS));
		College vivaCollege = new College();
		collegeInfo(vivaCollege);
	}

	public static void collegeInfo(College clg) {

		System.out.println("College Name: " + College.getClgName() + " College ID: " + College.getClgId()
				+ " College Address: " + College.getClgAddress());
		
		System.out.println("Student id: "+clg.);
	}

}
