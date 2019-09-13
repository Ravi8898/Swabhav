package com.techlabs.bug;

public class RumtimeExceptionPropagation {

	public static void main(String[] args) {

		try {
			m1();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		System.out.println("End Of Main");
	}

	private static void m1() {
		System.out.println("Inside m1");
		m2();
	}

	private static void m2() {
		System.out.println("Inside m2");
		m3();
	}

	private static void m3() {
		System.out.println("Inside m3");
		throw new RuntimeException("Something wrong in m3");

	}
}