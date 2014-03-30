package hei.devweb.controllers;

import hei.devweb.metier.ArticleManager;
import hei.devweb.metier.AuteurManager;
import hei.devweb.metier.CategorieManager;
import hei.devweb.metier.CommentaireManager;
import hei.devweb.model.Article;
import hei.devweb.model.Auteur;
import hei.devweb.model.Categorie;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 800409617440767322L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		List<Categorie> categories = CategorieManager.getInstance().listerCategorie();
		req.setAttribute("categories", categories);	
		List<Article> articles = ArticleManager.getInstance().listerArticle();
		req.setAttribute("articles", articles);
		for (int i = 0; i < articles.size(); i++) {
			articles.get(i).setNbrCommentaire(CommentaireManager.getInstance().compterCommentaire(articles.get(i).getId()));
			System.out.println(CommentaireManager.getInstance().compterCommentaire(articles.get(i).getId()));
		}
		List<Auteur> auteurs = AuteurManager.getInstance().listerAuteur();
		req.setAttribute("auteurs", auteurs);
		
	RequestDispatcher view = req.getRequestDispatcher("WEB-INF/pages/admin.jsp");
	view.forward(req, resp);
	}
}

