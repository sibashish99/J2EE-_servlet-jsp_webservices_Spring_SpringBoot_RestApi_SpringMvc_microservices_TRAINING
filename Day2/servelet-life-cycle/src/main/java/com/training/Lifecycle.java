package com.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myLife")
public class Lifecycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Lifecycle() {
        super();
       System.out.println("Life cycle is called..");
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Life cycle init() is called..");
	}

	
	public void destroy() {
		System.out.println("Life cycle destroy() is called..");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Life cycle doGet() is called..");
		
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		out.println("<h2>Hello</h2>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
