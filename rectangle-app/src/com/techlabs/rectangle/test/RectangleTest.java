package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {
	
public static void main(String[] args) {
		
		Rectangle small=new Rectangle();
		Rectangle big=new Rectangle();
		
		small.width=10;
		small.height=30;
		int smallArea=small.calculateArea(small.width,small.height);
		System.out.println(smallArea);

		big.width=100;
		big.height=50;
		int bigArea=big.calculateArea(big.width,big.height);
		System.out.println(bigArea);
	}
	
}
