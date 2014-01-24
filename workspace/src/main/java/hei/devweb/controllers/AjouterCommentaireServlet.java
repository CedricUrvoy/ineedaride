package hei.devweb.controllers;

import hei.devweb.metier.CommentaireManager;
import hei.devweb.model.Commentaire;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

public class AjouterCommentaireServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8303989037305489209L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Integer idArticle = Integer.parseInt(req.getParameter("idArticle"));
		String email = req.getParameter("email");
		String name = req.getParameter("name");
		String text = req.getParameter("text");
	
		Commentaire commentaire = new Commentaire(null, text, name, email,idArticle);
		
	
	CommentaireManager.getInstance().ajouterCommentaire(commentaire);
	
		Gson gson = new Gson();
		String commentaireJson = gson.toJson(commentaire);
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		PrintWriter out = resp.getWriter();
		out.append(commentaireJson);
		

}
}
