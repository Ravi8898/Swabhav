package com.techlabs.action;

import java.text.SimpleDateFormat;

import java.util.Date;

import com.opensymphony.xwork2.Action;

public class GreetAction implements Action {

	private String message;

	@Override
	public String execute() throws Exception {

		System.out.println("inside execute");
		message = getGreetTime();
		message = message + " from Execute";
		return SUCCESS;
	}

	public String doExecute() {
		System.out.println("inside doExecute");
		message = getGreetTime();
		message = message + " from doExecute";
		return SUCCESS;
	}

	public String getMessage() {
		return message;
	}

	public String getGreetTime() {
		Date date = new Date();
		SimpleDateFormat dateformat = new SimpleDateFormat("HH");

		String formattedDate = dateformat.format(date);
		int currentHour = Integer.parseInt(formattedDate);
		System.out.println(currentHour);

		if (currentHour < 12 && currentHour >= 4) {
			message = "Good morning";
		}
		if (currentHour >= 12 && currentHour < 17) {
			message = "Good afternoon";
		}
		if (currentHour >= 17 && currentHour < 4) {
			message = "Good afternoon";
		}
		return message;
	}

}
