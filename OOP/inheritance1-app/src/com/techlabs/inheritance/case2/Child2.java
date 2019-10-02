package com.techlabs.inheritance.case2;

public class Child2 extends Parent2 {

	public Child2() {
		this(100);
		System.out.println("This is Child");
	}

	public Child2(int foo) {
		super(foo);
		System.out.println("Constructor overloaded");
		
	}

}
