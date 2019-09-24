package com.techlabs.facade.strategy;

public class Iphone implements IMobileShop{

	@Override
	public void modelNo() {
		
		System.out.println("Iphone-XI");
	}

	@Override
	public void price() {
		System.out.println("Rs. 50000");
	}

}
