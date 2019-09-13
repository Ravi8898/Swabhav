package com.techlabs.college;

import java.util.ArrayList;

public class College {
	
	
	private final String CLG_NAME="VIVA";
	private final String CLG_ID="0523";
	private final String CLG_ADDRESS="VIRAR";
	
	Professor professor1;
	Student student1;
	Student student2;
	ArrayList<Student> studentList=new ArrayList<Student>();
	
	
	public String getClgName() {
		return CLG_NAME;
	}
	public String getClgId() {
		return CLG_ID;
	}
	public String getClgAddress() {
		return CLG_ADDRESS;
	}
	public Professor getProfessor1() {
		return professor1;
	}
	public Student getStudent1() {
		return student1;
	}
	public Student getStudent2() {
		return student2;
	}
}
