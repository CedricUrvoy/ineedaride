package hei.devweb.controllers;

import hei.devweb.metier.CategorieManager;
import hei.devweb.model.Categorie;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 800409617440767322L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		List<Categorie> categories = CategorieManager.getInstance().listerCategorie();
		req.setAttribute("categories", categories);	
		
	RequestDispatcher view = req.getRequestDispatcher("WEB-INF/pages/index.jsp");
	view.forward(req, resp);
	}
}
