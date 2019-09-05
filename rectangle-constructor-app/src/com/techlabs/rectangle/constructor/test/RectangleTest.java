package com.techlabs.rectangle.constructor.test;

import com.techlabs.rectangle.constructor.ColorCategory;
import com.techlabs.rectangle.constructor.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle rect1=new Rectangle(30, 50);
		Rectangle rect2=new Rectangle(10, 40, ColorCategory.BLUE);
		printInfo(rect1);
		printInfo(rect2);	
	}
	
	public static void printInfo(Rectangle r) {
		
		System.out.println("Width of Rectangle is: "+r.getWidth());
		System.out.println("Height of Rectangle is: "+r.getHeight());
		System.out.println("Area of Rectangle is: "+r.calculateArea());
		System.out.println("Color of Rectangle is: "+r.getColor());
		System.out.println();
	}
}