package com.techlabs.action;

import com.opensymphony.xwork2.Action;

public class HomeAction implements Action {
	
	public HomeAction() {
		System.out.println("Home constructor");
	}
	
	private String developer;
	@Override
	public String execute() throws Exception {
		System.out.println("inside execute");
		
		return this.SUCCESS;
	}
	public void setDeveloper(String developer) {
		System.out.println("setting developer");
		this.developer = developer;
	}
	public String getDeveloper() {
		System.out.println("getting developer");
		return developer;
	}
	

}
