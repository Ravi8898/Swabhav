package com.techlabs.employee.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.TreeSet;

import com.techlabs.employee.DataAnalyzer;
import com.techlabs.employee.Employee;

public class EmployeeTest {

	public static void main(String[] args) throws IOException {

		String[] employeeData;

		int idIndex=0;
		int nameIndex=1;
		int designationIndex=2;
		int managerIDIndex=3;
		int DOJIndex=4;
		int salaryIndex=5;
		int comissionIndex=6;
		int departmentNoIndex=7;
		
		URL url = new URL("https://swabhav-tech.firebaseapp.com/emp.txt");
		URLConnection connection = url.openConnection();

		InputStreamReader input = new InputStreamReader(connection.getInputStream());
		BufferedReader bufferReader = new BufferedReader(input);
		TreeSet<Employee> employees = new TreeSet<Employee>();

		DataAnalyzer dataAnalyzer;
		String line = "";
		while ((line = bufferReader.readLine()) != null) {
			employeeData = line.split(",");
			if (employeeData[managerIDIndex].equals("NULL")) {
				employeeData[managerIDIndex] = "0";

			}
			if (employeeData[comissionIndex].equals("NULL")) {
				employeeData[comissionIndex] = "0";
			}
			employees.add(new Employee(Integer.parseInt(employeeData[idIndex]), employeeData[nameIndex], employeeData[designationIndex],
					Integer.parseInt(employeeData[managerIDIndex]), employeeData[DOJIndex], Double.parseDouble(employeeData[salaryIndex]),
					Integer.parseInt(employeeData[comissionIndex]), Integer.parseInt(employeeData[departmentNoIndex])));

		}
		System.out.println("Total number of Employees are: " + employees.size());
		dataAnalyzer = new DataAnalyzer();

		Employee maxSalEmp = dataAnalyzer.getMaxSalariedEmployee(employees);
		dataAnalyzer.getTotalEmployeeBasedOnDesignation(employees);
		dataAnalyzer.getEmployeeBasedOnDepartment(employees);
		
		printData(maxSalEmp);
		printEmployeeCount(dataAnalyzer);

	}

	public static void printData(Employee employee) {

		System.out.println("\nDetails of Maximum salaried employee is: \n" + employee.getId() + ", " + employee.getName()
				+ ", " + employee.getDesignation() + ", " + employee.getManagerID() + ", " + employee.getDateOfJoining()
				+ ", " + employee.getSalary() + ", " + employee.getCommission() + ", "
				+ employee.getDepartmentNumber());
	}

	public static void printEmployeeCount(DataAnalyzer dataAnalyzer) {

		System.out.print("\nTotal number of employees based on designation:");
		System.out.println("\nTotal Manager: " + dataAnalyzer.getManagerCount() + "\nTotal Clerk: "
				+ dataAnalyzer.getClerkCount() + "\nTotal Analyst: " + dataAnalyzer.getAnalystCount() + "\nTotal Salesman: "
				+ dataAnalyzer.getSalesmanCount() + "\nTotal President: " + dataAnalyzer.getPresidentCount());
		
		System.out.print("\nTotal number of employees based on department number:");
		System.out.println("\nCount of department number 10: " + dataAnalyzer.getTenCount() + "\nCount of department number 20: "
				+ dataAnalyzer.getTwentyCount() + "\nCount of department number 30: " + dataAnalyzer.getThirtyCount());
	}
}
