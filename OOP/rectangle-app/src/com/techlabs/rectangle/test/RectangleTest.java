package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {
	
public static void main(String[] args) {
		
		Rectangle small=new Rectangle();
		Rectangle big=new Rectangle();
		
		small.width=10;
		small.height=30;
		
		int smallArea=small.calculateArea();
		
		System.out.println("Width="+small.width);
		System.out.println("Height="+small.height);
		System.out.println("Area="+smallArea);
		
		System.out.println();
		
		big.width=100;
		big.height=50;
		int bigArea=big.calculateArea();
		
		System.out.println("Width="+big.width);
		System.out.println("Height="+big.height);
		System.out.println("Area="+bigArea);
	}
	
}
