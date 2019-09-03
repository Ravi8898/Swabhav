package com.swabhav.circle.test;

import com.swabhav.circle.Circle;

public class CircleTest {

	public static void main(String[] args) {
		
		Circle colorCircle=new Circle();

		colorCircle.setRadius(3.5f);
		colorCircle.setColor("GREEn");
		
		float areaOfCircle=colorCircle.calculateArea();
		float perimeterOfCircle=colorCircle.calculatePerimeter();
		
		System.out.println("Radius = "+colorCircle.getRadius());
		System.out.println("color = "+colorCircle.getColor());
		
		System.out.println("Area Of Circle = "+areaOfCircle);
		System.out.println("Perimeter Of Circle = "+perimeterOfCircle);

	}

}
