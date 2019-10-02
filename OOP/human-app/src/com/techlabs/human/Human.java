package com.techlabs.human;

import java.io.Serializable;

public class Human implements Serializable{

	private String name;
	private int age;
	private GenderCategory gender;
	private float height;
	private float weight;
	private float bodyMassIndex;
	private String bodyType;
	private static int count;
	
	static {
		count=100;
//		System.out.println("hello");
	}

	public Human(String name, int age) {

		this(name, age, GenderCategory.Male, 5, 50);
	}

	public Human(String name, int age, GenderCategory gender, float height, float weight) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		calculateBMI(height, weight);
		findBodyType(bodyMassIndex);
		count++;
		
	}

	public void eat() {

		this.weight = (weight + (weight * 0.005f));
	}

	public void workOut() {

		this.weight = (weight - (weight * 0.002f));
//		this.height = (height + (height * 0.005f));

	}

	public void calculateBMI(float height, float weight) {

		height = height * 0.3048f;
		this.bodyMassIndex = (weight / (height * height));

	}

	public void findBodyType(float bodyMassIndex) {

		if (bodyMassIndex >= 18.5 && bodyMassIndex <= 24.9)
			this.bodyType = "Normal";

		else if (bodyMassIndex > 25)
			this.bodyType = "Over_weighted";

		else
			this.bodyType = "Under_Weighted";
	}
	
	public static int headCount() {
			
		return count;
	}
	

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public GenderCategory getGender() {
		return gender;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public float getBodyMassIndex() {
		return bodyMassIndex;
	}

	public String getBodyType() {
		return bodyType;
	}
	public int getCount() {
		return count;
	}
}