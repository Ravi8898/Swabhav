package com.techlabs.rectangle.constructor;

public class Rectangle {

	private int width;
	private int height;
	private ColorCategory color;

	public Rectangle(int width, int height) {

		this(width, height, ColorCategory.RED);
	}

	public Rectangle(int width, int height, ColorCategory color) {

		
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public ColorCategory getColor() {
		return color;
	}

	public int calculateArea() {
		int area = width * height;
		return area;
	}
}