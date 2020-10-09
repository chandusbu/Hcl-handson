package org.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ExhibitionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 public ExhibitionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<html><body>");
		pw.println("<h1>Text fair 2018 expo</h1>");
		pw.println("<table id=exhibition>");
		pw.println("<tr>");
		pw.println("<th>Name</th>");
		pw.println("<th>TextFair expo</th>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<td>HallName</td>");
		pw.println("<td>Pvr Superplex</td>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<td>StartDate</td>");
		pw.println("<td>10-10-2020</td>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<td>EndDate</td>");
		pw.println("<td>10-10-2030</td>");
		pw.println("</tr>");
		pw.close();
		
		
		
		
		
		
		
	}

	
	

}
