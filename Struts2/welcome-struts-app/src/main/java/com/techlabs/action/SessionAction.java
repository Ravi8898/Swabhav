package com.techlabs.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;

public class SessionAction implements Action,SessionAware {

	private int newCount;
	private int oldCount;
	private int count;
	private Map<String, Object> userSession ;
	
	@Override
	public void setSession(Map<String, Object> session) {
		System.out.println("Inside setSession");
		userSession = session ;
		
		
	}

	@Override
	public String execute() throws Exception {
		System.out.println("Inside Execute");
		
		if (userSession.get("counter") == null)
			count = 0;
		else
			count = (int) userSession.get("counter");
		
		oldCount = count;
		count++;
		newCount=count;
		userSession.put("counter", count);
		System.out.println(count);
		  
		return SUCCESS;
	}

	public int getNewCount() {
		return newCount;
	}

	public int getOldCount() {
		return oldCount;
	}

	public Map<String, Object> getUserSession() {
		return userSession;
	}

	

}
