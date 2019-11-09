package com.techlabs.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RegisterAction extends ActionSupport implements ModelDriven<RegisterViewModel>{
	
	RegisterViewModel model;
	
	public RegisterAction() {
		model=new RegisterViewModel();
	}
	
	@Override
	public String execute() throws Exception {
		
		return SUCCESS;
	}
	
	@Override
	public void validate() {
		System.out.println("Inside validate");
		if (model.getUserName().trim().equals("") || model.getUserName() == null) {
			addFieldError("userName", "UserName required");
		}

		if (model.getEmail().trim().equals("") || model.getEmail() == null) {
			addFieldError("email", "email required");
		}
		
		if (model.getContactNo().trim().equals("") || model.getContactNo() == null) {
			addFieldError("contactNo", "contactNo required");
		}

	}


	@Override
	public RegisterViewModel getModel() {
		
		return model;
	}
	

}
