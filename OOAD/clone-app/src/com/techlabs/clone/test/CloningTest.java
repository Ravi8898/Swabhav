package com.techlabs.clone.test;

import com.techlabs.clone.CloneExample;

public class CloningTest {
	
	public static void main(String[] args) throws CloneNotSupportedException  {
		CloneExample aurionPro=new CloneExample();
		aurionPro.employeeSalary=100;
		aurionPro.managerSalary=250;
		aurionPro.c.employeeId=5;
		aurionPro.c.managerId=6;
		
		CloneExample swabhavTechlabs=(CloneExample)aurionPro.clone();
		swabhavTechlabs.employeeSalary=150;
		swabhavTechlabs.managerSalary=350;
		swabhavTechlabs.c.employeeId=11;
		swabhavTechlabs.c.managerId=12;
		printInfo(aurionPro);
		printInfo(swabhavTechlabs);
		
	}
	
	public static void printInfo(CloneExample cloneObject) {
		
		System.out.println("Salary of Employee: "+cloneObject.employeeSalary);
		System.out.println("Salary of Manager: "+cloneObject.managerSalary);
		System.out.println("Employee ID of company: "+cloneObject.c.employeeId);
		System.out.println("Manager ID of company: "+cloneObject.c.managerId);
		System.out.println(cloneObject.hashCode());
		System.out.println();
	}
}
