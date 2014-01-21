package hei.devweb.controllers;

import hei.devweb.metier.ArticleManager;
import hei.devweb.model.Article;
import java.io.IOException;
import java.util.List;

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
		
		List<Article> articles = ArticleManager.getInstance().listerArticleCategorie(1);
		req.setAttribute("articles", articles);	
	
		RequestDispatcher view = req.getRequestDispatcher("WEB-INF/pages/blog.jsp");
		view.forward(req, resp);
	}
}
