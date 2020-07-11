package com.chandra.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    String dname = null;
    ServletContext context = null;
    @Override
    public void init(ServletConfig config) throws ServletException {
    	dname = config.getInitParameter("driver");
    	context = config.getServletContext();
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String name = request.getParameter("uname");
		String trainer = context.getInitParameter("tname");
		out.println("Welcome to Mr. "+name);
		out.println("<br/>");
		out.println("Database Driver Name : "+dname);
		out.println("<br/>");
		out.println("Developed Byt  : "+trainer);
		
	}

}
