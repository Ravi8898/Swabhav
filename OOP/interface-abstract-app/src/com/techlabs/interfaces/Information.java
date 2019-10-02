package com.techlabs.interfaces;

public class Information implements Teacher {
	private String school;
	private String name;
	private int age;

	public Information(String name, String school, int age) {
		this.name = name;
		this.age = age;
		this.school = school;
	}

	public String getSchool() {
		return school;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void subject() {

		System.out.println("Please select your subject");
		System.out.println("1. Maths");
		System.out.println("2. Science");
		System.out.println("3. History");
		System.out.println("Selected subject is: "+SelectSubjectCategory.SCIENCE);

	}
	public void salary() {
		System.out.println("If you are Principal then salary: 50k");
		System.out.println("If you are Teacher then salary: 30k");

	}
}