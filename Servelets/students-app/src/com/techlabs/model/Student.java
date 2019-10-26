package com.techlabs.model;

public class Student {

	private static int id = 100;
	private String name;
	private double cgpi;
	private int studentID;

	public Student(String name, double cgpi) {
		this.studentID = ++id;
		this.name = name;
		this.cgpi = cgpi;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCgpi(double cgpi) {
		this.cgpi = cgpi;
	}

	public String getName() {
		return name;
	}

	public double getCgpi() {
		return cgpi;
	}

}
