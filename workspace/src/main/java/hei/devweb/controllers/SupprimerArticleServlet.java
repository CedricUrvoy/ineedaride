package hei.devweb.controllers;

import hei.devweb.metier.ArticleManager;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SupprimerArticleServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 857241270489543614L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Integer idArticle = Integer.parseInt(req.getParameter("id"));
		ArticleManager.getInstance().supprimerArticle(idArticle);
		
		resp.sendRedirect("admin");
	}
}
