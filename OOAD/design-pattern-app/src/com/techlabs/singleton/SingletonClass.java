package com.techlabs.singleton;

public class SingletonClass {

	private static SingletonClass instance;

	private SingletonClass() {

	}

	public static SingletonClass getInstance() {
		if (instance == null)
			instance = new SingletonClass();

		return instance;
	}
	
	public void printMessege() {
		System.out.println("Hello...You created singleton object");
	}
}
