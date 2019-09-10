package com.techlabs.clone;

import com.techlabs.clone.test.CloneTest;

public class CloneExample implements Cloneable {

	public int employeeSalary;

	public int managerSalary;
	
	public CloneTest c = new CloneTest();

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
