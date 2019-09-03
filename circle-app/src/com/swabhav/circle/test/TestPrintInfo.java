package com.swabhav.circle.test;

import com.swabhav.circle.Circle;

public class TestPrintInfo {

	public static void main(String[] args) {
		
		Circle c1=new Circle();
		Circle c2=c1;
		c2.setRadius(4.5f);

		printInfo(c1);
		printInfo(c2);
		
//		Anonymous Object
		
		System.out.println(new Circle().calculateArea());
		printInfo(new Circle());
	}
	
	public static void printInfo(Circle c) {
		
		System.out.println("Radius= "+c.getRadius());
		System.out.println("Area= "+c.calculateArea());
		System.out.println("Color="+c.getColor());
		System.out.println("Perimeter= "+c.calculatePerimeter());
//		System.out.println(c.hashCode());
		System.out.println();
	}

}
