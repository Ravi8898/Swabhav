package com.techlabs.case2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

public class SubscriberOne implements ActionListener {

	private Frame frame;

	public SubscriberOne(Frame frame) {

		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("Publisher1")) {
			System.out.println("This is Publisher 1");
			frame.getContentPane().setBackground(Color.RED);
		}

		if (e.getActionCommand().equals("Publisher2")) {
			System.out.println("This is Publisher 2");
			frame.getContentPane().setBackground(Color.YELLOW);
		}
	}

}
