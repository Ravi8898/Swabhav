package com.techlabs.college;

public class Student extends Person {
	private BranchCategory branch;
	
	public Student(String address, String dob, BranchCategory branch) {
		super(address, dob);
		this.branch = branch;

	}

	public BranchCategory getBranch() {
		return branch;
	}

}
