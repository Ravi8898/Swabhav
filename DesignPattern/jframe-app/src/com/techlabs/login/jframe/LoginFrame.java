package com.techlabs.login.jframe;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class LoginFrame extends JFrame {

	private JTextArea nameArea;
	private JTextArea passArea;
	private JButton loginButton;
	private JPanel newPanel;
	private JLabel nameLabel;
	private JLabel passLabel;
	
	public LoginFrame() {
		nameArea=new JTextArea();
		passArea=new JTextArea();
		newPanel=new JPanel();
		nameLabel=new JLabel("Name:");
		passLabel=new JLabel("Password:");
		loginButton=new JButton("Login");
		loginButton.setBounds(90, 180, 65, 20);
		nameArea.setBounds(80, 80, 100, 20);
		passArea.setBounds(80, 130, 100, 20);
		nameLabel.setBounds(5, 75, 80, 30);
		passLabel.setBounds(5, 125, 80, 30);

		
		loginButton.setBackground(Color.GREEN);
		setTitle("Log in");
		getContentPane().setBackground(Color.YELLOW);
		add(loginButton);
		add(nameArea);
		add(passArea);
		add(nameLabel);
		add(passLabel);
		add(newPanel);
		setSize(1024, 768);
		
		setLayout(null);
		setVisible(true);
		
	}
	
	public void loginPage(LoginButtonHandler buttonHandler) {
		loginButton.addActionListener(buttonHandler);
	}

	public JTextArea getNameArea() {
		return nameArea;
	}

	public JTextArea getPassArea() {
		return passArea;
	}

	public JButton getLoginButton() {
		return loginButton;
	}

	public JPanel getNewPanel() {
		return newPanel;
	}

	public JLabel getNameLabel() {
		return nameLabel;
	}

	public JLabel getPassLabel() {
		return passLabel;
	}
	
	
	
}
