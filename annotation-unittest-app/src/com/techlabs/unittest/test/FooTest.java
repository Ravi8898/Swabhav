package com.techlabs.unittest.test;

import java.lang.reflect.Method;
import com.techlabs.unittest.Foo;
import com.techlabs.unittest.UnitTest;

public class FooTest {
	private static int testPass = 0;
	private static int testFail = 0;

	public static void main(String[] args) throws IllegalAccessException, RuntimeException, Throwable {

		int UnitTestFound = 0;

		Class<?> classes = Foo.class;
		Foo fooObject = new Foo();
		for (Method method : classes.getDeclaredMethods()) {
			if (method.isAnnotationPresent(UnitTest.class)) {

				checkTest(method, fooObject);
				UnitTestFound++;
			}

		}

		System.out.println("No. of Unit test: " + UnitTestFound);
		System.out.println("No. of test passed: " + testPass);
		System.out.println("No. of test failed: " + testFail);
	}

	public static void checkTest(Method method, Foo obj) throws IllegalAccessException, RuntimeException, Exception {
		if ((boolean) method.invoke(obj)) {
			testPass++;
		} else
			testFail++;

	}

}