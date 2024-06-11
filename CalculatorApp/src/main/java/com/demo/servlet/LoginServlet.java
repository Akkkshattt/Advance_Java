package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{

	public LoginServlet() {
		super();
	}
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
    	res.setContentType("text/html");
    	PrintWriter out = res.getWriter();
    	String user = req.getParameter("user");
    	String pass = req.getParameter("pass");
    	String op=req.getParameter("btn");
    	if(op.equals("login")) {
    		if(user.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin")) {
        		out.println("<Html><head></head><body><H1>You are a valid user</h1></body></html>");
        		out.println("<head>\r\n"
        				+ "<meta charset=\"ISO-8859-1\">\r\n"
        				+ "<title>Insert title here</title>\r\n"
        				+ "</head>\r\n"
        				+ "<body>\r\n"
        				+ "<form action=\"calculateData\">\r\n"
        				+ "Number 1: <input type=\"text\" name=\"num1\" id=\"num1\"><br>\r\n"
        				+ "Number 2: <input type=\"text\" name=\"num2\" id=\"num2\"><br>\r\n"
        				+ "<button type=\"submit\" name=\"btn\" id=\"add\" value=\"add\">Addition</button>\r\n"
        				+ "<button type=\"submit\" name=\"btn\" id=\"sub\" value=\"sub\">Subtraction</button>\r\n"
        				+ "</form>\r\n"
        				+ "</body>\r\n"
        				+ "</html>");
        	}else {
        		out.println("<Html><head></head><body><H1 style={'text=center'}>You are not a valid user!!!!!!</h1></body></html>");
        		
        	}
    	}
    
    }
}
