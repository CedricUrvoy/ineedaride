package hei.devweb.controllers;

import hei.devweb.metier.ArticleManager;
import hei.devweb.metier.AuteurManager;
import hei.devweb.metier.CategorieManager;
import hei.devweb.model.Article;
import hei.devweb.model.Auteur;
import hei.devweb.model.Categorie;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjouterArticleServlet extends HttpServlet{


	/**
	 * 
	 */
	private static final long serialVersionUID = -7852624526904148106L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
	
		String titre = req.getParameter("titreArticle");
		String description = req.getParameter("descriptionArticle");
		String image = req.getParameter("imageArticle");
		String categorie = req.getParameter("idCategorie");
		String auteur = req.getParameter("champAuteur");
		Date date = new Date();
		
		int idCategorie = 0;
		int idAuteur = 0;
		
		List<Categorie> categories = CategorieManager.getInstance().listerCategorie();
		req.setAttribute("categories", categories);	
		List<Auteur> auteurs = AuteurManager.getInstance().listerAuteur();
		req.setAttribute("auteurs", auteurs);
		
		for (int i = 0; i < categories.size(); i++) {
			if(categorie.equals(categories.get(i).getLibelle())){
				idCategorie = categories.get(i).getId();
			}
		}
		for (int i = 0; i < auteurs.size(); i++) {
			if(auteur.equals(auteurs.get(i).getFirstname())){
				idAuteur = auteurs.get(i).getId();
			}
		}
	
		System.out.println(titre+ " " + description + " "+ image + " " + idCategorie +" "+idAuteur);
		Article article = new Article(null, titre, description, image, date, idCategorie,idAuteur, categorie, auteur);
		ArticleManager.getInstance().ajouterArticle(article);
		
		resp.sendRedirect("admin");
}
}