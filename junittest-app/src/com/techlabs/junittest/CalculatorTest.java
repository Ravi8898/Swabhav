package com.techlabs.junittest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	int num = 2;
	int num1 = 4;
	int num2 = 5;
	private Calculator checker = new Calculator();

	@Test
	public void testAdd_bad() throws Exception {
		try{
			int result = checker.add(-2, -4);
		}
		catch(RuntimeException e){
			System.out.println("Please enter positive no.");
		}
		

	}

	@Test
	public void testAdd_good() throws Exception {
		int result = checker.add(num1, num2);
		Assert.assertEquals(9, result);

	}

	@Test
	public void testCubeEven() throws Exception {

		try{
			int result = checker.cubeEven(5);
		}
		catch(RuntimeException e){
			System.out.println("Enter even no");
		}

	}

	@Test
	public void testCubeEven_good() throws Exception {

		int result = checker.cubeEven(num);
		Assert.assertEquals(8, result);
	}

}
