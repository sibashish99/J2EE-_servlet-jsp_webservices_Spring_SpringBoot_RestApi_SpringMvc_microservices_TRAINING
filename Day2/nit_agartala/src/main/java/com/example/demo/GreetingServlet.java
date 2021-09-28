package com.example.demo;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/greet")
public class GreetingServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

    public GreetingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        //System.out.println(request.getClass().getName());
        //System.out.println(response.getClass().getName());
		
		String branchName = request.getParameter("branch");
		//System.out.println(branchName);
		StudentService service = new StudentService();
		List<Student> found= service.findByBranch(branchName);
		
		request.setAttribute("foundStudent", found);
		
		RequestDispatcher dispatcher= request.getRequestDispatcher("student_details.jsp");
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
