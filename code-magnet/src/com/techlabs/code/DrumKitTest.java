package com.techlabs.code;

public class DrumKitTest {

	public static void main(String[] args) {
		
		DrumKit d=new DrumKit();
		d.snare=false;
		d.playSnare();
		if(d.snare==true) {
			d.playSnare();
		}
		d.playTopHat();

	}

}
