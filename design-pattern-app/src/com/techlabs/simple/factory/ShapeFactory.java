package com.techlabs.simple.factory;

public class ShapeFactory {

	public IShape getShape(String shape) {
		
		if(shape.equals("circle")) {
			return new Circle();
		}
		if(shape.equals("rectangle")) {
			return new Rectangle();
		}
		if(shape.equals("square")) {
			return new Square();
		}
		return null;
	}
}
