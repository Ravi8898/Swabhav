package com.techlabs.listener;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class SessionCounter
 *
 */
@WebListener
public class SessionCounter implements HttpSessionListener {

	private int totalSessionCount = 0;
	private int currentSessionCount = 0;
	private ServletContext context = null;

	public SessionCounter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
	 */
	public void sessionCreated(HttpSessionEvent event) {
		System.out.println("Session Created");
		totalSessionCount++;
		currentSessionCount++;

		if (context == null) {
			storeInServletContext(event);
		}

	}

	/**
	 * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
	 */
	public void sessionDestroyed(HttpSessionEvent event) {
		System.out.println("Session Destroyed");
		currentSessionCount--;
	}

	public int getTotalSessionCount() {
		return (totalSessionCount);
	}

	public int getCurrentSessionCount() {
		return (currentSessionCount);
	}

	private void storeInServletContext(HttpSessionEvent event) {
		HttpSession session = event.getSession();
		context = session.getServletContext();
		context.setAttribute("sessionCounter", this);
	}

}
