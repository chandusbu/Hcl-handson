package org.hcl4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Displayservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   public Displayservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

@SuppressWarnings("unused")
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter pw=response.getWriter();
	String name=request.getParameter("userName");
	int Phonenumber=Integer.parseInt(request.getParameter("Phonenumber"));
	String email=request.getParameter("userEmail");
	String City=request.getParameter("City");
	pw.println("<h1>The details are<h1>");
	pw.println("<table>");
	pw.println("<tr>");
	pw.println("<th>Name</th>");
	pw.println("<th>Phonenumber</th>");
	pw.println("<th>email</th>");
	pw.println("<th>city</th>");
	pw.println("</tr>");
	pw.println("<tr>");
	pw.println("<td>+userName</td>");
	pw.println("<td>+Phonenumber</td>");
	pw.println("<td>+userEmail</td>");
	pw.println("<td>+City</td>");
	pw.println("</tr>");
	
	}

	
	}


