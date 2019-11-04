package com.techlabs.filters;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class ApplicationFilter
 */
@WebFilter(value= {"/application","/session","/getCookie"})
public class ApplicationFilter implements Filter {
	
//	protected FilterConfig config;

	public ApplicationFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		System.out.println(req.getRequestURL());
//		System.out.println(req.getContextPath());
		System.out.println("for: "+req.getRequestURL());
		
		
		long startTime = System.currentTimeMillis();
		String startTime1 = new Date().toString();
		System.out.println("Start Time: "+startTime1);
//		System.out.println("Start Time: "+startTime);
		
	    chain.doFilter(request, response);
	    long elapsed = System.currentTimeMillis() - startTime;
	    System.out.println("End Time: "+new Date().toString());
	    System.out.println("Time Taken: "+elapsed+" ms");
//	    String name = "servlet";
//	    if (request instanceof HttpServletRequest) {
//	      name = ((HttpServletRequest) request).getRequestURI();
//	    }
//
//	    config.getServletContext().log(name + " took " + elapsed + " ms");
	  }
	

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig config) throws ServletException {
		 
//		this.config = config;
	}

}
