package com.techlabs.facade.strategy;

public class ShopKeeper {

	private IMobileShop iphone;
	private IMobileShop samsung;
	private IMobileShop redmi;
	
	public ShopKeeper() {
		iphone=new Iphone();
		samsung=new Samsung();
		redmi=new Redmi();
		
	}
	
	public void getIphone() {
		iphone.modelNo();
		iphone.price();
	}
	
	public void getSamsung() {
		samsung.modelNo();
		samsung.price();
	}
	
	public void getRedmi() {
		redmi.modelNo();
		redmi.price();
	}
	
}
