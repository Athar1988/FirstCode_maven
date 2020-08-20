package org.projet.FirstCode;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet( name="cs", urlPatterns = {"/fs", "*.php"} )

public class firstServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nom=req.getParameter("nom");
		PrintWriter out=resp.getWriter();
		out.println("<html><body>");
		out.println("<li> Le nommmm: "+nom+"</li>");
		out.println("<li> Le protocole: "+req.getProtocol()+"</li>");
		out.println("<li> IP Client: "+req.getRemoteAddr()+"</li>");
		out.println("</body></html>");
		
	}
}
