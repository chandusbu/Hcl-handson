package org.cs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Validate() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String eventname=request.getParameter("eventname");
		String hallname=request.getParameter("hallname");
		String type=request.getParameter("type1");
		String details=request.getParameter("details");
		String ownername=request.getParameter("ownername");
		String startdate=request.getParameter("startdate");
		String enddate=request.getParameter("enddate");
pw.println("<h1>Event added successfully</h1>");
pw.println("<h3>Eventdetails</h3>");
pw.println("<table border=1 id='exhibition'");
pw.println("<tr><td>Event name</td><td>"+eventname+"</td></tr>");
pw.println("<tr><td>Hall name</td><td>"+hallname+"</td></tr>");
pw.println("<tr><td>type</td><td>"+type+"</td></tr>");
pw.println("<tr><td>details</td><td>"+details+"</td></tr>");
pw.println("<tr><td>ownername</td><td>"+ownername+"</td></tr>");
pw.println("<tr><td>Start date</td><td>"+startdate+"</td></tr>");
pw.println("<tr><td>End date</td><td>"+enddate+"</td></tr>");
pw.close();


	}

}
