package com.techlabs.icrud.test;

import com.techlabs.icrud.ICrudable;
import com.techlabs.icrud.dbdriven.CustomerDB;
import com.techlabs.icrud.dbdriven.OrderDB;
import com.techlabs.icrud.dbdriven.ProductDB;

public class ICrudTest {
	public static void main(String[] args) {
		ICrudable x;
		x=new CustomerDB();
		x.create();
		x=new ProductDB();
		x.create();
		x=new OrderDB();
		x.create();
	}

}
