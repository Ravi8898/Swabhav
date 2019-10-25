package com.techlabs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetCookieServlet
 */
@WebServlet("/getCookie")
public class GetCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String docType = "<!doctype html\">\n";
		PrintWriter out = response.getWriter();
		Cookie cookie=null;
        Cookie[] cookies=null;
        String colorName;
        cookies=request.getCookies();
        if( cookies!=null ) {
            
            for (int i=0; i<cookies.length; i++) {
               cookie=cookies[i];
               if(cookie.getName().equals("color")){
                    colorName=cookie.getValue();
                    out.print(docType + "<html>\n <body bgcolor="+colorName+">\n <h1>Cookie Found: </h1><br>Value: "+ colorName+"<br>Name:" + cookie.getName()+"</body></html>");
                    break;
               }else {
                   out.println(docType + "<html>\n <body bgcolor=\"#f0f0f0\">\n <h2>No cookies founds</h2></body></html>");
               }
            }
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
