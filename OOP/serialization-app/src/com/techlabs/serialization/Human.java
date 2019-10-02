package com.techlabs.serialization;

import java.io.Serializable;

public class Human implements Serializable {
	private String name;
	private int age;
	private double weight;

	public Human(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	@Override
	public String toString() {

		return "Name: " + name + " Age: " + age + " Weight: " + weight;
	}

}
