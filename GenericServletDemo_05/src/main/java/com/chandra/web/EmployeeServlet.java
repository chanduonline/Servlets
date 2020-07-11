package com.chandra.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class EmployeeServlet
 */
public class EmployeeServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		int id = Integer.parseInt(request.getParameter("eid"));
		String name = request.getParameter("ename");
		double salary = Double.parseDouble(request.getParameter("salary"));
		out.println("Employee Id   : "+id);
		out.println("<br/>");
		out.println("Employee Name : "+name);
		out.println("<br/>");
		out.println("Employee Salary: "+salary);
	}

}
