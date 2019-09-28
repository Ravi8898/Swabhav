package com.techlabs.login.jframe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LoginButtonHandler implements ActionListener{

	private LoginFrame frame;
	public LoginButtonHandler(LoginFrame frame) {
		this.frame=frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JDialog dialogBox = new JDialog(frame, "Logged in");
		dialogBox.setSize(512, 384);
//		JLabel label=new JLabel("Welcome"+frame.);
//		dialogBox.add(label);
		dialogBox.getContentPane().setBackground(Color.YELLOW);
		dialogBox.setVisible(true);
		
		
	}

}
