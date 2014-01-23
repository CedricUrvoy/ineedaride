package hei.devweb.controllers;

import hei.devweb.metier.ArticleManager;
import hei.devweb.metier.CategorieManager;
import hei.devweb.metier.CommentaireManager;
import hei.devweb.model.Article;
import hei.devweb.model.Categorie;

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
		
		Integer idCategorie = Integer.parseInt(req.getParameter("idCategorie"));
		Categorie categorie = CategorieManager.getInstance().getCategorie(idCategorie);
		req.setAttribute("categorie", categorie);
		
		List<Article> articles = ArticleManager.getInstance().listerArticleCategorie(idCategorie);
		req.setAttribute("articles", articles);	
		for (int i = 0; i < articles.size(); i++) {
			articles.get(i).setNbrCommentaire(CommentaireManager.getInstance().compterCommentaire(articles.get(i).getId()));
		}
	
		RequestDispatcher view = req.getRequestDispatcher("WEB-INF/pages/blog.jsp");
		view.forward(req, resp);
	}
}
