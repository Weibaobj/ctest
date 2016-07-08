package com.peoplesoft.testmaven;

import java.io.*;

import javax.servlet.http.*;
import javax.servlet.*;

public class HelloServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException{
				PrintWriter out = response.getWriter();
				out.println("<html>");
				out.println("<body>");
				out.println("<h1>Hello World</h1>");
				out.println("</body>");
				out.println("</html>");	
			}
}