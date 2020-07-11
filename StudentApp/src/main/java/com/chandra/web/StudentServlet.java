package com.chandra.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		int sno = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("uname");
		String email = request.getParameter("email");
		long mno = Long.parseLong(request.getParameter("mobile"));
		out.println("Student Number : "+sno);
		out.println("<br/>");
		out.println("Student Name   : "+name);
		out.println("<br/>");
		out.println("Student Email  : "+email);
		out.println("<br/>");
		out.println("Mobile Number  : "+mno);
	}

}
