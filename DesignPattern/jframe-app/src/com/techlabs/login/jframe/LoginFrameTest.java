package com.techlabs.login.jframe;

import javax.swing.JFrame;

public class LoginFrameTest {

	public static void main(String[] args) {
		
		LoginFrame frame1=new LoginFrame();
		LoginButtonHandler buttonhandler=new LoginButtonHandler(frame1);
		frame1.loginPage(buttonhandler);
	}

}
