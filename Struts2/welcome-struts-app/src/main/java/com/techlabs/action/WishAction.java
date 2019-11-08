package com.techlabs.action;

import com.opensymphony.xwork2.Action;

public class WishAction implements Action {

	private String userName;
	private String message;

	@Override
	public String execute() throws Exception {
		System.out.println("inside execute");

		return SUCCESS;
	}

	public String doExecute() throws Exception {
		
		System.out.println("inside doExecute");
		System.out.println(userName);
		
		if (userName!="") {
			message = "Struts wishes Hello to " + userName;
			return SUCCESS;
		}
		return ERROR;
	}

	public String getMessage() {
		return message;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
