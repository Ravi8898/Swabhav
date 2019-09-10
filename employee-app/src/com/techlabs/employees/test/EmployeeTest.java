package com.techlabs.employees.test;

import com.techlabs.employees.Analyst;
import com.techlabs.employees.Developer;
import com.techlabs.employees.Employee;
import com.techlabs.employees.Manager;

public class EmployeeTest {

	public static void main(String[] args) {

		Manager manager1 = new Manager("Ravi", 450);
		Developer developer1 = new Developer("Durga");
		Analyst analyst1 = new Analyst("Sunny", 150);

		printInfo(manager1);
		printInfo(developer1);
		printInfo(analyst1);

	}

	public static void printInfo(Employee employee) {

		System.out.println("Name of the employee: " + employee.getEmployeeName());
		System.out.println("Employee ID: " + employee.getEmployeeID());
		System.out.println("Basic Salary: " + employee.getBasicSalary());
		System.out.println("Total salary: " + employee.getTotalSalary());
		System.out.println();

	}

}
