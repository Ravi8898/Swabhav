package com.techlabs.interfaces.test;

import com.techlabs.interfaces.Information;

public class InterfaceTest {

	public static void main(String[] args) {
		Information info = new Information("Ravi", "St. Mary", 30);		
		printInfo(info);
	}

	public static void printInfo(Information info) {
		System.out.println("Name: "+info.getName());
		System.out.println("School Name: "+info.getSchool());
		System.out.println("Age: "+info.getAge());
		info.subject();
		info.salary();
	}

}