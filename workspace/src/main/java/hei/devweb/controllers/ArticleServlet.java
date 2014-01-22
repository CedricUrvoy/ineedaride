package hei.devweb.controllers;

import hei.devweb.metier.ArticleManager;
import hei.devweb.metier.CommentaireManager;
import hei.devweb.model.Article;
import hei.devweb.model.Commentaire;

import java.io.IOException;
import java.util.List;

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
		
		List<Commentaire> commentaires = CommentaireManager.getInstance().listerCommentaire(idArticle);
		req.setAttribute("commentaires", commentaires);
		
		RequestDispatcher view = req.getRequestDispatcher("WEB-INF/pages/article.jsp");
		view.forward(req, resp);
	}
}