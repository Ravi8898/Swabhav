package com.techlabs.student;

public class Student implements Comparable{

	private String name;
	private int rollNo;
	private int standard;

	public Student(int rollNo, int standard, String name) {

		this.rollNo = rollNo;
		this.standard = standard;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public int getStandard() {
		return standard;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Student student=(Student) obj;
		return (student.getRollNo()==(this.getRollNo()) && student.getStandard()==(this.getStandard()));
	}
	
	@Override
	
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

