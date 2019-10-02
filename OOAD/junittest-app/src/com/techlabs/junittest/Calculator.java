package com.techlabs.junittest;

public class Calculator {

	public int add(int num1, int num2) throws Exception {
		if (num1 > 0 && num2 > 0)
			return num1 + num2;
		throw new RuntimeException();

	}

	public int cubeEven(int number) throws Exception {
		if (number % 2 == 0)
			return number * number * number;
		throw new RuntimeException();

	}

}
