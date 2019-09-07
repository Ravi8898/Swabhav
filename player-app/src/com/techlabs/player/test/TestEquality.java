package com.techlabs.player.test;

import com.techlabs.player.Player;

public class TestEquality {

	public static void main(String[] args) {
		
		Player p1=new Player(101, "sachin", 50);
		Player p2=new Player(101, "sachin", 50);
		
		System.out.println(p1==p1);
		System.out.println(p1==p2);
		System.out.println(p1.equals(p1));
		System.out.println(p1.equals(p2));

	}
}
