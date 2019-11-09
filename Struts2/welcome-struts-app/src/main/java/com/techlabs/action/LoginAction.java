package com.techlabs.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {

	private String userName;
	private String password;

	private Map<String, Object> userSession;

	@Override
	public void setSession(Map<String, Object> session) {

		System.out.println("Inside setSession");
		userSession = session;

	}

	@Override
	public String execute() {
		System.out.println("Inside execute");

		if (userName.equals("swabhav") && password.equals("1234")) {
			userSession.put("login", true);
			userSession.put("userName", userName);
			return SUCCESS;
		}
		return ERROR;
	}
	
	@Override
	public void validate() {
		System.out.println("Inside validate");
		if (userName.trim().equals("") || userName == null) {
			addFieldError("userName", "UserName required");
		}

		if (password.trim().equals("") || password == null) {
			addFieldError("password", "password required");
		}
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUserSession(Map<String, Object> userSession) {
		this.userSession = userSession;
	}

	public Map<String, Object> getUserSession() {
		return userSession;
	}

}
