package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {
	
public static void main(String[] args) {
		
		Rectangle small=new Rectangle();
		Rectangle big=new Rectangle();		
		
		small.setWidth(-25);
		small.setHeight(30);
		int smallArea=small.calculateArea();
		
		System.out.println("Width="+small.getWidth());
		System.out.println("Height="+small.getHeight());
		System.out.println("Area="+smallArea);
		
		System.out.println();
		
		big.setWidth(100);
		big.setHeight(50);
		int bigArea=big.calculateArea();
		
		System.out.println("Width="+big.getWidth());
		System.out.println("Height="+big.getHeight());
		System.out.println("Area="+bigArea);
	}
	
}
