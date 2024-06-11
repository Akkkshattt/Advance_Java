package com.demo.servlet;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculateServelet extends HttpServlet{

	public CalculateServelet() {
		super();
	}
   
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		String op = req.getParameter("btn");
		int ans = 0;
		if(op.equalsIgnoreCase("add")) {
			ans = num1+num2;
		}else {
			ans = num1-num2;
		}
		out.println("<Html><head></head><body>");
		out.println("<h3>Hello from my first Servlet</h3>");
		out.println("Ans :-" + ans);
		out.println("</body></html>");
	}
}
