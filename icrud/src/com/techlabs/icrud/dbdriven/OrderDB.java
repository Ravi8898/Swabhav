package com.techlabs.icrud.dbdriven;

import com.techlabs.icrud.ICrudable;

public class OrderDB implements ICrudable {

	@Override
	public void create() {
		System.out.println("Order Created");
	}

	@Override
	public void read() {
		System.out.println("order readed");
	}

	@Override
	public void update() {
		System.out.println("order updated");
	}

	@Override
	public void delete() {
		System.out.println("order daleted");
	}
}