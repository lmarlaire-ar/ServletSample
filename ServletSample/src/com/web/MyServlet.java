package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
		{  
			res.setContentType("text/html");//setting the content type  
			PrintWriter pw=res.getWriter();//get the stream to write the data  
			  
			//writing html in the stream  
			pw.println("<html><body>");  
			pw.println("<h1>Hola Mundo Servlet!!</h1>");
			pw.println("<h2>Prueba doGet</h2>");
			pw.println("</body></html>");  
			  
			pw.close();//closing the stream  
			}}  

	protected void doPost(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
		{  
			res.setContentType("text/html");//setting the content type  
			PrintWriter pw=res.getWriter();//get the stream to write the data  
			  
			//writing html in the stream  
			pw.println("<html><body>");  
			pw.println("<h1>Hola Mundo Servlet!!</h1>");
			pw.println("<h2>Prueba doPost</h2>");
			pw.println("</body></html>");  
			  
			pw.close();//closing the stream  
			}}

}
