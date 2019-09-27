package com.techlabs.subscriber.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class SubscriberOne implements ActionListener, ItemListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("Registration completed for Subscriber one");
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		
	}

}
