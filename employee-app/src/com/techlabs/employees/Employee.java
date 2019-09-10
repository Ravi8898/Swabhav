package com.techlabs.employees;

public abstract class Employee {

	private String employeeName;
	protected double basicSalary;
	protected double totalSalary;
	private int employeeID;
	private static int nextID;

	static {
		nextID = 1000;

	}

	public abstract void totalSalary();

	public Employee(String employeeName, double basicSalary) {

		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.employeeID = ++nextID;

	}

	public String getEmployeeName() {
		return employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public static int getNextID() {
		return nextID;
	}

	public double getTotalSalary() {
		return totalSalary;
	}

}
