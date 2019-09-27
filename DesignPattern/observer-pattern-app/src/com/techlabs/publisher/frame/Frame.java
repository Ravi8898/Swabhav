package com.techlabs.publisher.frame;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame extends JFrame {

	private JButton button;

	Frame(String title, String buttonName, int width, int height) {

		setTitle(title);
		button = new JButton(buttonName);
		setButton();
		getContentPane().setBackground(Color.blue);
		add(button);
		setSize(width, height);
		setLayout(null);
		setVisible(true);
	}

	public void registerSubscriber(ActionListener event) {

		button.addActionListener(event);

	}

	public void setButton() {
		button.setBounds(50, 50, 80, 80);
		button.setBackground(Color.YELLOW);
	}

}
