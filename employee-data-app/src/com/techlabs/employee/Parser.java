package com.techlabs.employee;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Parser {

	String row;
	String data;
	String[] employeeData;
	int idIndex=0;
	int nameIndex=1;
	int designationIndex=2;
	int managerIDIndex=3;
	int DOJIndex=4;
	int salaryIndex=5;
	int comissionIndex=6;
	int departmentNoIndex=7;
	
	Map<Employee, Employee> employees=new TreeMap<Employee, Employee>(); 
	
	public Parser(Loader loader) throws IOException {
		
		while ((row = loader.bufferReader.readLine()) != null) {
			employeeData = row.split(",");
			if (employeeData[managerIDIndex].equals("NULL")) {
				employeeData[managerIDIndex] = "0";

			}
			if (employeeData[comissionIndex].equals("NULL")) {
				employeeData[comissionIndex] = "0";
			}
			employees.put(new Employee(Integer.parseInt(employeeData[idIndex]), employeeData[nameIndex], employeeData[designationIndex],
					Integer.parseInt(employeeData[managerIDIndex]), employeeData[DOJIndex], Double.parseDouble(employeeData[salaryIndex]),
					Integer.parseInt(employeeData[comissionIndex]), Integer.parseInt(employeeData[departmentNoIndex])), null);

//			System.out.println(employees.size());
		}
		
	}
}
