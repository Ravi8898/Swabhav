package com.techlabs.case2;

public class FrameTest {

	public static void main(String[] args) {

		Frame frame1 = new Frame("Welcome", 1024, 768);
		SubscriberOne sub1=new SubscriberOne(frame1);
		frame1.registerSubscriber(sub1);
	}

}
