package org.hcl.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<html><body >");
		pw.println("<h1>Welcome to Hall Paradise</h1>");
		pw.println("<p>The type of events are</p>");
		pw.println("<ul >");
		pw.println("<li>Exhibition</li>");
		pw.println("<li>Stageshow</li>");
		pw.println("</ul>");
		pw.println("</body></html>");
	}

	

}
