package com.techlabs.employee;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class DataAnalyzer {

	double maxSalary = 0;
	private Map<Employee, Employee> employeeList;

	public DataAnalyzer(Parser parser) {
		employeeList = parser.parse();
	}

	public Employee getMaxSalariedEmployee() {
		for (Entry<Employee, Employee> employee : employeeList.entrySet()) {
			if (maxSalary < employee.getKey().getSalary()) {
				maxSalary = employee.getKey().getSalary();
			}
		}

		for (Entry<Employee, Employee> employee : employeeList.entrySet()) {
			if (employee.getKey().getSalary() == maxSalary)
				return employee.getKey();
		}
		return null;
	}

	public Map<Integer, Integer> getEmployeeBasedOnDepartmentNo() {
		Map<Integer, Integer> depMap = new TreeMap<Integer, Integer>();

		for (Entry<Employee, Employee> employee : employeeList.entrySet()) {
			Integer employeeCount = depMap.get(employee.getKey().getDepartmentNumber());
			if (depMap.containsKey(employee.getKey().getDepartmentNumber())) {
				depMap.put(employee.getKey().getDepartmentNumber(), ++employeeCount);
			} else {
				depMap.put(employee.getKey().getDepartmentNumber(), 1);
			}
		}
		return depMap;
	}

	public Map<String, Integer> getEmployeeBasedOnDesignation() {
		Map<String, Integer> designationMap = new TreeMap<String, Integer>();

		for (Entry<Employee, Employee> employee : employeeList.entrySet()) {
			Integer employeeCount = designationMap.get(employee.getKey().getDesignation());
			if (designationMap.containsKey(employee.getKey().getDesignation())) {
				designationMap.put(employee.getKey().getDesignation(), ++employeeCount);
			} else {
				designationMap.put(employee.getKey().getDesignation(), 1);
			}
		}
		return designationMap;
	}
}
