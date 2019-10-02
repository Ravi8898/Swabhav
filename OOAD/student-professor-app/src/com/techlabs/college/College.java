package com.techlabs.college;

import java.util.ArrayList;

public class College {

	private String clgName;
	private String clgID;
	private String clgAddress;
	private ArrayList<Student> studentsList;
	private ArrayList<Professor> professorsList;

	Professor professor1 = new Professor("VIRAR_EAST", "10/02/1996", 8, 30);
	Professor professor2 = new Professor("Dahisar", "15/02/1998", 7, 25);
	Student student1 = new Student("Bhayander", "30/02/1995", BranchCategory.EXTC);
	Student student2 = new Student("Dahisar", "01/01/1998", BranchCategory.COMPS);

	public College(String clgName, String clgID, String clgAddress) {

		this.clgID = clgID;
		this.clgName = clgName;
		this.clgAddress = clgAddress;
		professorsList=new ArrayList<Professor>();
		studentsList=new ArrayList<Student>();
		addProfessor(professorsList);
		addStudent(studentsList);
	}

	public void addProfessor(ArrayList<Professor> professorList) {
		professorList.add(professor1);
		professorList.add(professor2);
	}

	public void addStudent(ArrayList<Student> studentList) {
		studentList.add(student1);
		studentList.add(student2);

	}

	public Iterable<Student> getStudentsList() {
		return studentsList;
	}

	public Iterable<Professor> getProfessorsList() {
		return professorsList;
	}

	public String getClgName() {
		return clgName;
	}

	public String getClgId() {
		return clgID;
	}

	public String getClgAddress() {
		return clgAddress;
	}

}
