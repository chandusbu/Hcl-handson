package org.hcl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class StageEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public StageEventServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<html><body>");
		pw.println("<h1>New Year Eve</h1>");
		pw.println("<table id=stageshow>");
		pw.println("<tr>");
		pw.println("<th>Name</th>");
		pw.println("<th>New Year Eve</th>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<td>PVR lulu Mall</td>");
		pw.println("<td>Hall Name</td>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<td>Date</td>");
		pw.println("<td>10-10-2020</td>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<td>StartDate</td>");
		pw.println("<td>10:00:00</td>");
		pw.println("</tr>");
		pw.println("<td>EndDate</td>");
		pw.println("<td>12:00:00</td>");
		pw.println("</tr>");
		pw.close();
		
		
	}

	
	

}
