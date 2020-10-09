package org.chandu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Indexservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Indexservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.setContentType("text/html");
	PrintWriter pw=response.getWriter();
	pw.println("<html><body>");
	pw.println("<form name=\"loginForm\" method=\"post\" action=\"Displayservlet\">");
	pw.println("Name:<input type=\"text\" name=\"userName\"/><br/><br/> ");
	pw.println("Phone number:<input type=\"text\" name=\"Phonenumber\"/><br/><br/>  ");
	pw.println("Email Id:<input type=\"text\" name=\"userEmail\"/><br/><br/> ");
	pw.println("City:<input type=\"text\" name=\"city\"/><br/><br/>");
	pw.println(" <input type=\"submit\" value=\"Submit\" id=\"submit\">");
	pw.println("</form>");
	pw.println("</body></html>");

	}

}
