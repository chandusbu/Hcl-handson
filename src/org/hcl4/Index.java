package org.hcl4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int count;
       
    public Index() {
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
	String msg=" ";
	int count=0;
	if(eventname=="")
	{
	msg=msg+"EventName should be filled<br>";
	count++;
	}
	if(hallname=="") {
	msg=msg+"hallname should be filled";
	count=count+1;
	}
if(type==" ") {
msg=msg+"Event type should be filled";
count=count+1;
}
if(details=="") {
	msg=msg+"EventDetails should be filled";
	count=count+1;
	
}
if(ownername=="")
{
	msg=msg+"ownername should be filled";
	count=count+1;
}
if(startdate=="") {
	msg=msg+"Stratdate should be filled";
	count=count+1;
}
if(enddate=="") {
	msg=msg+"Enddate should be filled";
	count=count+1;
}
if(count>1)
{
	pw.println("<div style=\" color:red;\">"+msg+"</div>");
	RequestDispatcher rd=request.getRequestDispatcher("/index.html");
	rd.include(request, response);
}
else
{
	RequestDispatcher rd=request.getRequestDispatcher("/validate");
	rd.forward(request, response);
}
}
}