package com.techlabs.annotation;

public class Foo {
	
	public static void m1() {
		System.out.println("This is method1");
	}
	@NeedChangeLater
	public static void m2() {
		System.out.println("This is method2");
	}
	
	public static void m3() {
		System.out.println("This is method3");
	}
	@NeedChangeLater
	public static void m4() {
		System.out.println("This is method4");
	}
}
