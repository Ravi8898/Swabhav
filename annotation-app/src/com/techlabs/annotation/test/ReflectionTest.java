package com.techlabs.annotation.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.techlabs.annotation.Foo;
import com.techlabs.annotation.NeedChangeLater;

public class ReflectionTest {
	public static void main(String[] args) throws Exception, IllegalArgumentException, InvocationTargetException {
		int annotationCount = 0;

		Class<?> classes = Foo.class;

		for (Method method : classes.getDeclaredMethods()) {
			if (method.isAnnotationPresent(NeedChangeLater.class)) {
				method.invoke(classes);
				annotationCount++;
			}
		}
		System.out.println("NeedChangeLater Annotation used " + annotationCount + " times");
	}

}
