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
		button2=new JButton("Publisher2");
		setButton();
		getContentPane().setBackground(Color.blue);
		add(button1);
		add(button2);
		setSize(width, height);
		setLayout(null);
		setVisible(true);
	}

	public void registerSubscriber(IPublisher publisher) {

		button1.addActionListener(publisher);
		button1.addItemListener(publisher);
		
		button2.addActionListener(publisher);
		button2.addItemListener(publisher);
		
	}

	public void setButton() {
		button1.setBounds(50, 50, 80, 80);
		button1.setBackground(Color.YELLOW);
		button2.setBounds(50, 130, 80, 80);
		button2.setBackground(Color.YELLOW);
	}

}
