package com.techlabs.case2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

public class SubscriberOne implements IPublisher {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("This is button1");
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		e.getStateChange();
	}

	@Override
	public Color getStateChange() {
		return Color.BLACK;
	}

}
