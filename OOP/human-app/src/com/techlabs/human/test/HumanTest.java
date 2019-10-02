package com.techlabs.human.test;

import com.techlabs.human.GenderCategory;
import com.techlabs.human.Human;

public class HumanTest {

	public static void main(String[] args) {

		Human human1 = new Human("Ravi", 23);
		Human human2 = new Human("Durga", 40, GenderCategory.Female, 6, 100);
		human1.eat();
		human2.workOut();
		printInfo(human1);
		printInfo(human2);
	}

	public static void printInfo(Human h) {
		
		System.out.println("Name of the human is: " + h.getName());
		System.out.println("Age of the human is: " + h.getAge());
		System.out.println("Gender of the human is: " + h.getGender());
		System.out.println("Height of the human is: " + h.getHeight());
		System.out.println("Weight of the human is: " + h.getWeight());
		System.out.println("BMI of the human is: " + h.getBodyMassIndex());
		System.out.println("Body Type of human is:" + h.getBodyType());
		System.out.println();
	}
}