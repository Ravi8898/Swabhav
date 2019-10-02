package com.techlabs.facade.strategy;

public class Samsung implements IMobileShop{

	@Override
	public void modelNo() {
		System.out.println("SamsungGalaxyM30");
	}

	@Override
	public void price() {
		System.out.println("Rs. 14000");
	}

}
