package com.techlabs.model;

public class Student {

	private String name;
	private int age;
	private double cgpi;

	public Student(String name, int age, double cgpi) {

		this.name = name;
		this.age = age;
		this.cgpi = cgpi;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getCgpi() {
		return cgpi;
	}

}
