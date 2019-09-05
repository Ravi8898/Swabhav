package com.swabhav.circle.enumapp.test;

import com.swabhav.circle.enumapp.BorderCategory;
import com.swabhav.circle.enumapp.Circle;
import com.swabhav.circle.enumapp.ColorCategory;

public class CircleTest {
	
	public static void main(String[] args) {
		
		Circle c1=new Circle();
		Circle c2 = new Circle();
		
		c1.circleSet(5.5f, ColorCategory.BLUE, BorderCategory.DOTTED);
		c2.circleSet(4.5f, ColorCategory.GREEN, BorderCategory.DOUBLE);
		printInfo(c1);
		printInfo(c2);
	}
	
	public static void printInfo(Circle c) {
		
		System.out.println("Radius= " + c.getRadius());
		System.out.println("Area= " + c.calculateArea());
		System.out.println("Perimeter= " + c.calculatePerimeter());
		System.out.println("Color of circle is: "+c.getColor());
		System.out.println("Border styte of Circle is: "+c.getBorder());
		System.out.println();
	}
}