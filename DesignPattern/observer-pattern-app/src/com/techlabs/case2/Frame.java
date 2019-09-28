package com.techlabs.case2;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame extends JFrame {

	private JButton button1;
	private JButton button2;

	public Frame(String title, int width, int height) {

		setTitle(title);
		button1 = new JButton("Publisher1");
		button2 = new JButton("Publisher2");
		setButton();
		setSize(width, height);
		getContentPane().setBackground(Color.blue);
		add(button1);
		add(button2);

		setLayout(null);
		setVisible(true);
	}

	public void registerSubscriber(SubscriberOne subscriber) {

		button1.addActionListener(subscriber);
		button2.addActionListener(subscriber);
	}

	public void setButton() {
		button1.setBounds(50, 50, 120, 80);
		button1.setBackground(Color.LIGHT_GRAY);
		button2.setBounds(50, 130, 120, 80);
		button2.setBackground(Color.WHITE);
	}

}
