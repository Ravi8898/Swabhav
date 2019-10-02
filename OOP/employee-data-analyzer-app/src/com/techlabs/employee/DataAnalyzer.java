package com.techlabs.employee;

import java.util.TreeSet;

public class DataAnalyzer {

	final String MANAGER = "'MANAGER'";
	final String CLERK = "'CLERK'";
	final String ANALYST = "'ANALYST'";
	final String SALESMAN = "'SALESMAN'";
	final String PRESIDENT = "'PRESIDENT'";

	final int departmentNumber10 = 10;
	final int departmentNumber20 = 20;
	final int departmentNumber30 = 30;

	int managerCount, clerkCount, analystCount, salesmanCount, presidentCount, departmentNumberTenCount,
			departmentNumberTwentyCount, departmentNumberThirtyCount;

	public Employee getMaxSalariedEmployee(TreeSet<Employee> employees) {
		double maxSalary = 0;

		for (Employee employee : employees) {
			if (maxSalary < employee.getSalary()) {
				maxSalary = employee.getSalary();
			}
		}

		for (Employee employee : employees) {
			if (employee.getSalary() == maxSalary)
				return employee;
		}
		return null;
	}

	public void getTotalEmployeeBasedOnDesignation(TreeSet<Employee> employees) {
		for (Employee employee : employees) {
			switch (employee.getDesignation()) {
			case MANAGER:
				managerCount++;
				break;

			case CLERK:
				clerkCount++;
				break;

			case ANALYST:
				analystCount++;
				break;

			case SALESMAN:
				salesmanCount++;
				break;

			case PRESIDENT:
				presidentCount++;
				break;

			default:
				break;
			}

		}

	}

	public void getEmployeeBasedOnDepartment(TreeSet<Employee> employees) {
		for (Employee employee : employees) {
			switch (employee.getDepartmentNumber()) {
			case departmentNumber10:
				departmentNumberTenCount++;
				break;

			case departmentNumber20:
				departmentNumberTwentyCount++;
				break;

			case departmentNumber30:
				departmentNumberThirtyCount++;
				break;

			default:
				break;
			}

		}
	}

	public int getManagerCount() {
		return managerCount;
	}

	public int getClerkCount() {
		return clerkCount;
	}

	public int getAnalystCount() {
		return analystCount;
	}

	public int getSalesmanCount() {
		return salesmanCount;
	}

	public int getPresidentCount() {
		return presidentCount;
	}

	public int getTenCount() {
		return departmentNumberTenCount;
	}

	public int getTwentyCount() {
		return departmentNumberTwentyCount;
	}

	public int getThirtyCount() {
		return departmentNumberThirtyCount;
	}
}