package org.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MyServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		pw.println("<html> <body>");
		pw.println("<h1>Welcome to popular paradise<h1>");
		pw.println("<a href='./Exhibition'>Exhibition</a><br>");
		pw.println("<a href='./StageEvent'>StageEvent</a><br>");
		
		
		
		

	

}
}