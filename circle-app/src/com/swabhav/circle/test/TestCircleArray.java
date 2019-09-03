package com.swabhav.circle.test;

import com.swabhav.circle.Circle;

public class TestCircleArray {

	public static void main(String[] args) {

		TestPrintInfo printInfor = new TestPrintInfo();
		Circle circles[] = new Circle[5];
		circles[0] = new Circle();
		circles[1] = new Circle();
		circles[2] = new Circle();
		circles[3] = new Circle();
		circles[4] = new Circle();
		circles[0].setRadius(1.5f);
		circles[1].setRadius(2.5f);
		circles[2].setRadius(3.5f);
		circles[3].setRadius(0.5f);
		circles[4].setRadius(4.5f);

		float sumOfArea = 0, biggerArea = 0;
		for (Circle i:circles) {
			printInfor.printInfo(i);
			sumOfArea = i.calculateArea() + sumOfArea;
			if (i.calculateArea() > biggerArea) {

				biggerArea = i.calculateArea();
			}

		}
		
		System.out.println("Largest area is: " + biggerArea);
		System.out.println("Sum of Area of all circle: " + sumOfArea);

	}
}
