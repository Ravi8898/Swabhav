package com.techlabs.employee.test;

import java.io.IOException;
import java.util.Map;

import com.techlabs.employee.DataAnalyzer;
import com.techlabs.employee.Employee;
import com.techlabs.employee.Loader;
import com.techlabs.employee.Parser;

public class EmployeeTest {

	public static void main(String[] args) throws IOException {

		DataAnalyzer dataAnalyzer = new DataAnalyzer(
				new Parser(new Loader("https://swabhav-tech.firebaseapp.com/emp.txt")));
		
		Employee maxSalEmployee = dataAnalyzer.getMaxSalariedEmployee();
		Map<Integer,Integer> employees=dataAnalyzer.getEmployeeBasedOnDepartmentNo();
		Map<String,Integer> emp=dataAnalyzer.getEmployeeBasedOnDesignation();
		
//		printInfo()
		System.out.println(maxSalEmployee.getSalary());
		System.out.println(employees);
		System.out.println(emp);
	}
	
	public static void printInfo(Employee employee){
		
	}

}
