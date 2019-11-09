package com.techlabs.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ContactDisplayAction extends ActionSupport implements SessionAware{

	private Map<String, Object> contactSession;

	@Override
	public void setSession(Map<String, Object> session) {
		contactSession=session;
		
	}
	
	

}
