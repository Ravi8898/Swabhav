package com.techlabs.jframe;

import java.awt.Color;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WelcomeFrame {

	public WelcomeFrame() {
		JFrame frame = new JFrame();
		frame.setTitle("Welcome Frame");
		
		frame.getContentPane().setBackground(Color.BLUE);
		JButton button=new JButton("Hello");
		button.setBounds(50, 50, 80, 80); 
		
		JButton button1=new JButton("Button");
		button.setBackground(Color.orange);
		button1.setBounds(50, 160, 80, 80); 
		button1.setBackground(Color.GREEN);
		frame.add(button);
		frame.add(button1);
		frame.setSize(1024, 768);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
