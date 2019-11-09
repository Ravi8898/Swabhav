package com.techlabs.action;


import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;

public class WelcomeAction implements Action{

	HttpSession session=ServletActionContext.getRequest().getSession();
	
	@Override
	public String execute() throws Exception {
		
		System.out.println("Inside welcome Action execute");
		
		if(session==null || session.getAttribute("userName")==null) {
			return "error";
		}
		session.invalidate();
		return "success";
	}
	
	
	
}
