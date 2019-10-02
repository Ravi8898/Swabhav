package com.techlabs.man;

public class Boy extends Man {
	public void walk() {
		System.out.println("Boy is Walking");
	}

	@Override
	public void play() {
		System.out.println("Boy is Playing");
	}
}
