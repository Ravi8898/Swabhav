package com.techlabs.icrud.dbdriven;

import com.techlabs.icrud.ICrudable;

public class ProductDB implements ICrudable{

	@Override
	public void create() {
		
		System.out.println("productDB created");
	}

	@Override
	public void read() {
		System.out.println("productDB readed");
	}

	@Override
	public void update() {
		System.out.println("productDB updated");
	}

	@Override
	public void delete() {
		System.out.println("productDB deleted");
	}
	
	

}
