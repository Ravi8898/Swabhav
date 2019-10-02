package com.techlabs.simple.factory.test;

import com.techlabs.simple.factory.IShape;
import com.techlabs.simple.factory.ShapeFactory;

public class SimpleFactoryTest {

	public static void main(String[] args) {

		ShapeFactory shapeFactory = new ShapeFactory();
		IShape shape1 = shapeFactory.getShape("circle");
		shape1.draw();
		
		IShape shape2 = shapeFactory.getShape("rectangle");
		shape2.draw();
		
		IShape shape3 = shapeFactory.getShape("square");
		shape3.draw();
	}
}