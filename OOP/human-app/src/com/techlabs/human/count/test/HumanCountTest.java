package com.techlabs.human.count.test;

import com.techlabs.human.Human;

public class HumanCountTest {

	public static void main(String[] args) {
		
		Human h1=new Human("Ravi", 23);
		System.out.println(h1.getCount());
		Human h2=new Human("Swabhav", 15);
		System.out.println(h2.getCount());
		Human h3=new Human("Akshay", 30);
		System.out.println(h3.getCount());
		System.out.println(Human.headCount());

	}

}
