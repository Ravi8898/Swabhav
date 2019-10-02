package com.techlabs.icrud.dbdriven;

import com.techlabs.icrud.ICrudable;

public class CustomerDB implements ICrudable{

	@Override
	public void create() {
		System.out.println("CustomerDB Created");
	}

	@Override
	public void read() {
		System.out.println("CoustomerDB readed");
	}

	@Override
	public void update() {
		System.out.println("CustomerDB updated");
	}

	@Override
	public void delete() {
		System.out.println("CustomerDB deleted");
	}

}
