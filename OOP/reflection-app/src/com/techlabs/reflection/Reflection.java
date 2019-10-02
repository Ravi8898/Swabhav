package com.techlabs.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.techlabs.reflection.test.ReflectionTest;

public class Reflection {

	
	public static void main(String[] args) {

		int methodCount = 0, constructorCount = 0, setterCount = 0, getterCount = 0;
		ReflectionTest reflect = new ReflectionTest();
		Class<?> classes = reflect.getClass();
		Constructor[] constructors = classes.getDeclaredConstructors();
		Method[] methods = classes.getDeclaredMethods();

		for (Constructor<?> constructor : constructors) {
			constructorCount++;
		}
		for (Method method : methods) {
			methodCount++;
			String methodName = method.getName();
			if (methodName.startsWith("get")) {
				getterCount++;
			}

			if (methodName.startsWith("set")) {
				setterCount++;
			}
		}
		System.out.println("Method Count is " + methodCount);
		System.out.println("Constructor Count is " + constructorCount);
		System.out.println("Getter Count is " + getterCount);
		System.out.println("Setter Count is " + setterCount);
	}
	
}
