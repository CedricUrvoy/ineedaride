package hei.devweb.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BlogServlet extends HttpServlet{

	private static final long serialVersionUID = -6601439810866984722L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		RequestDispatcher view = req.getRequestDispatcher("WEB-INF/pages/blog.jsp");
		view.forward(req, resp);
	}
}
