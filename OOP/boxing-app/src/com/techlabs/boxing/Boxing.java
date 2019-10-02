package com.techlabs.boxing;

public class Boxing {

	public static void main(String[] args) {
		
		int amount=500;
		Integer prevAmount=new Integer(amount);
		Integer debitAmount=50;
		int newAmount=prevAmount-debitAmount;
		System.out.println(amount+" "+debitAmount+" "+newAmount);
	
	}
}
