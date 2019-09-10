package com.techlabs.unittest.test;

import java.lang.reflect.Method;

import com.techlabs.unittest.Foo;
import com.techlabs.unittest.UnitTest;

public class FooTest {

	public static void main(String[] args) {

		int UnitTestFound = 0;

		Class<?> classes = Foo.class;
		
		for (Method method : classes.getDeclaredMethods()) {
			if (method.isAnnotationPresent(UnitTest.class)) {
				UnitTestFound++;
				
			}
		}
		System.out.println(UnitTestFound);

	}
}
