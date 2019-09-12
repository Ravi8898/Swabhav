package com.techlabs.intrface.classes;

import com.techlabs.intrface.IEmotionable;
import com.techlabs.intrface.IMannerable;

public class Boy implements IMannerable, IEmotionable{

	@Override
	public void cry() {
		System.out.println("Boy Cries");
		
	}

	@Override
	public void laugh() {
		System.out.println("Boy Laughing");
		
	}

	@Override
	public void wish() {
		System.out.println("Hello Boy");
		
	}

	@Override
	public void depart() {
		System.out.println("GoodBye Boy");
		
	}

}
