package com.techlabs.student;

public class Student implements Comparable<Student>{

	private int rollNo;
	private int standard;
	private String name;
	private float cgpi;

	public Student(int rollNo, int standard, String name, float cgpi) {
		
		this.rollNo=rollNo;
		this.standard=standard;
		this.name=name;
		this.cgpi=cgpi;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		Student student=(Student) obj;
//		return (student.getRollNo()==(this.getRollNo()) && student.getStandard()==(this.getStandard()));
//	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}

	public int getRollNo() {
		return rollNo;
	}

	public int getStandard() {
		return standard;
	}

	public String getName() {
		return name;
	}

	
	@Override
	public int compareTo(Student student) {
		
		if(this.getStandard()==student.getStandard() && this.getRollNo()!=student.getRollNo()) {
			return this.getRollNo()-student.getRollNo();
			}
			else if(this.getStandard()!=student.getStandard() ) {
				return this.getStandard()-student.getStandard();
			}
			return 0;
	}

}
