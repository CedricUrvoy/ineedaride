package hei.devweb.controllers;

import hei.devweb.metier.ArticleManager;
import hei.devweb.model.Article;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ArticleServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2823527442436776528L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Integer idArticle = Integer.parseInt(req.getParameter("id"));
		Article article = ArticleManager.getInstance().getArticle(idArticle);
		req.setAttribute("article", article);
		
		RequestDispatcher view = req.getRequestDispatcher("WEB-INF/pages/article.jsp");
		view.forward(req, resp);
	}
}