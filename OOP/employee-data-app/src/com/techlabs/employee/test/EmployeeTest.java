package com.techlabs.employee.test;

import java.io.IOException;
import java.util.Map;

import com.techlabs.employee.DataAnalyzer;
import com.techlabs.employee.Employee;
import com.techlabs.employee.FileLoader;
import com.techlabs.employee.LinkLoader;
import com.techlabs.employee.Parser;

public class EmployeeTest {

	public static void main(String[] args) throws IOException {

		DataAnalyzer dataAnalyzer = new DataAnalyzer(
				new Parser(new LinkLoader("https://swabhav-tech.firebaseapp.com/emp.txt")));

		Employee maxSalEmployee = dataAnalyzer.getMaxSalariedEmployee();
		Map<Integer, Integer> employees = dataAnalyzer.getEmployeeBasedOnDepartmentNo();
		Map<String, Integer> emp = dataAnalyzer.getEmployeeBasedOnDesignation();

		DataAnalyzer dataAnalyzer1 = new DataAnalyzer(
				new Parser(new FileLoader("C:\\Users\\ATUL\\Downloads\\dataFile.txt")));

		Employee maxSalEmployee1 = dataAnalyzer1.getMaxSalariedEmployee();
		Map<Integer, Integer> employees1 = dataAnalyzer1.getEmployeeBasedOnDepartmentNo();
		Map<String, Integer> emp1 = dataAnalyzer1.getEmployeeBasedOnDesignation();

		printInfo(maxSalEmployee, employees, emp);
		printInfo(maxSalEmployee1, employees1, emp1);

	}

	public static void printInfo(Employee maxSalEmployee, Map<Integer, Integer> employees, Map<String, Integer> emp) {
		System.out.println(maxSalEmployee.getSalary());
		System.out.println(employees);
		System.out.println(emp);
		System.out.println();
	}

}
