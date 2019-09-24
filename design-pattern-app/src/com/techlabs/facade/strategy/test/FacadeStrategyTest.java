package com.techlabs.facade.strategy.test;

import com.techlabs.facade.strategy.ShopKeeper;

public class FacadeStrategyTest {

	public static void main(String[] args) {
		
		ShopKeeper shopKeeper=new ShopKeeper();
		shopKeeper.getIphone();
		System.out.println();
		shopKeeper.getRedmi();
		System.out.println();
		shopKeeper.getSamsung();
	}
	
}
