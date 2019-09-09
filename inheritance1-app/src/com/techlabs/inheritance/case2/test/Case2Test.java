package com.techlabs.inheritance.case2.test;

import com.techlabs.inheritance.case2.Child2;

public class Case2Test {

	public static void main(String[] args) {
		Child2 c1 = new Child2();
		System.out.println(c1.getFoo());
		System.out.println();
		Child2 c2 = new Child2();
		System.out.println(c2.getFoo());
		System.out.println();
		Child2 c3 = new Child2(50);
		System.out.println(c3.getFoo());
	}

}
