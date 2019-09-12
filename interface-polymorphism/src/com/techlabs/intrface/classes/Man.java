package com.techlabs.intrface.classes;

import com.techlabs.intrface.IMannerable;

public class Man implements IMannerable{

	@Override
	public void wish() {
		System.out.println("Hello Man");
		
	}

	@Override
	public void depart() {
		System.out.println("GoodBye Man");
		
	}

}
