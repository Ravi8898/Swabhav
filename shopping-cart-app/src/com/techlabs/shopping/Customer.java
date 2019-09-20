package com.techlabs.shopping;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private int id;
	private String name;
	List<Order> orders = new ArrayList<Order>();

	public Customer(int id, String name) {

		this.id = id;
		this.name = name;

	}

	public void addOrder(Order order) {
		orders.add(order);

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Iterable<Order> getOrders() {
		return orders;
	}

	public int getOrderCount() {
		return orders.size();

	}

}
