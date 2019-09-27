package com.techlabs.publisher.frame;

import com.techlabs.subscriber.frame.SubscriberOne;
import com.techlabs.subscriber.frame.SubscriberTwo;

public class FrameTest {

	public static void main(String[] args) {

		SubscriberOne sub1 = new SubscriberOne();
		SubscriberTwo sub2 = new SubscriberTwo();		
		Frame frame1 = new Frame("Welcome", "Hello", 1024, 768);
		frame1.registerSubscriber(sub1);
		frame1.registerSubscriber(sub2);
	}

}
