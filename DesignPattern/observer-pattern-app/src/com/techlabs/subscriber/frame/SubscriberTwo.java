package com.techlabs.subscriber.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubscriberTwo implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Registration completed for Subscriber two");
	}
}
