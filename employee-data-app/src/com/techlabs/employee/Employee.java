package com.techlabs.employee;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private String designation;
	private int managerID;
	private String dateOfJoining;
	private double salary;
	private int commission;
	private int departmentNumber;

	public Employee(int id, String name, String designation, int managerID, String dateOfJoining, double salary,
			int comission, int departmentNumber) {

		this.id = id;
		this.name = name;
		this.designation = designation;
		this.managerID = managerID;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
		this.commission = comission;
		this.departmentNumber = departmentNumber;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	public int getManagerID() {
		return managerID;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public int getCommission() {
		return commission;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}
	
	@Override
	public int compareTo(Employee employee) {
		return this.name.compareTo(employee.getName());
	}
}
