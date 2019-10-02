package com.techlabs.shopping;

public class Product {

	private int id;
	private String name;
	private double price;
	private float discountPercentage;

	public Product(int id, String name, double price, float discountPercentage) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.discountPercentage = discountPercentage;
//		calculateProductCost();
	}

	public double calculateProductCost() {
		double discountAmount = (price * (((double) discountPercentage))) / 100;
		price = price - discountAmount;
		return price;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public float getDiscountPercentage() {
		return discountPercentage;
	}
}
