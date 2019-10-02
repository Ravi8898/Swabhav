package com.techlabs.singleton.test;

import com.techlabs.singleton.SingletonClass;

public class SingletonClassTest {

	public static void main(String[] args) {
		
		SingletonClass singleton=SingletonClass.getInstance();
		singleton.printMessege();
		System.out.println(singleton.hashCode());
		
		SingletonClass singleton1=SingletonClass.getInstance();
		singleton1.printMessege();
		System.out.println(singleton1.hashCode());
	}

}
