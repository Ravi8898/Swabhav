package com.techlabs.case2;

public class FrameTest {

	public static void main(String[] args) {

		SubscriberOne sub1 = new SubscriberOne();
		Frame frame1 = new Frame("Welcome", 1024, 768);
		frame1.registerSubscriber(sub1);
	}

}
