package com.ServletConfig.Practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfigPracticing
 */
//@WebServlet("/ServletConfigPracticing")
public class ServletConfigPracticing extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConfigPracticing() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
*/
	/**
	 * @throws IOException 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		
		PrintWriter pw1 = response.getWriter();
		ServletConfig serconfig = getServletConfig();
		String un = serconfig.getInitParameter("username");
		pw1.println("The user name is ---"+un);
		
	/*	PrintWriter pw = response.getWriter();
		ServletContext servcont = getServletContext();
		String contextname = servcont.getInitParameter("Context_user_name");
		pw.println("The servlet context user nmae ---"+contextname);*/
		
	}
}
