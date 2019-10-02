package com.techlabs.man.test;

import com.techlabs.man.Boy;
import com.techlabs.man.Infant;
import com.techlabs.man.Kid;
import com.techlabs.man.Man;

public class ManTest {

	public static void main(String[] args) {
//		caseStudy1();
//		caseStudy2();
		caseStudy3();
//		caseStudy4();
		caseStudy5();
	}

	public static void caseStudy1() {

		Man x;
		x = new Man();
		x.read();
		x.play();
	}

	public static void caseStudy2() {

		Boy y;
		y = new Boy();
		y.read();
		y.walk();
		y.play();
	}

	public static void caseStudy3() {

		Man x;
		x = new Boy();
		x.read();
		x.play();
	}

	public static void caseStudy4() {

		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());
		atThePark(new Infant());
	}

	public static void atThePark(Man x) {

		System.out.println("At The Park");
		x.play();

	}

	public static void caseStudy5() {

		Object x;
		x = 10;
		System.out.println(x.getClass());
		x = "Hello";
		System.out.println(x.getClass());
		x = new Man();
		System.out.println(x.getClass());
	}
}
