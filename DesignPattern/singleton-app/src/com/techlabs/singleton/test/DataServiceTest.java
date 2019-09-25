package com.techlabs.singleton.test;

import com.techlabs.singleton.DataService;

public class DataServiceTest {

	public static void main(String[] args) {
		
		DataService sv1=DataService.getInstance();
		System.out.println(sv1.hashCode());
		sv1.doSomething();
		
		DataService sv2=DataService.getInstance();
		System.out.println(sv2.hashCode());
		sv2.doSomething();
	}

}
