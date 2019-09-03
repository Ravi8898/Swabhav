package com.swabhav.circle.test;

import com.swabhav.circle.Circle;

public class TestReference {

	public static void main(String[] args) {
		
		Circle c1=new Circle();
		c1.setRadius(5.5f);
		System.out.println(c1.getRadius());
		
		Circle c2=c1;
		System.out.println(c2.getRadius());
		c2.setRadius(4.5f);
		System.out.println(c1.getRadius());
		System.out.println(c2.getRadius());
		c2=null;
		System.out.println(c1.getRadius());
	}

}
