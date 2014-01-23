package hei.devweb.metier;

import hei.devweb.dao.ArticleDao;
import hei.devweb.dao.impl.ArticleDaoImpl;
import hei.devweb.model.Article;
import java.util.List;

public class ArticleManager {
	
	private static ArticleManager instance;

	private ArticleDao articleDao = new ArticleDaoImpl();

	private ArticleManager() {
	}

	public static ArticleManager getInstance() {
		if (instance == null) {
			instance = new ArticleManager();
		}
		return instance;
	}

	public List<Article> listerArticleCategorie(Integer idCategorie) {
		System.out.println("Dans Methode : listerArticleParCategorie");
		return articleDao.listerArticleCategorie(idCategorie);
	}
	
	public List<Article> listerArticle() {
		System.out.println("Dans Methode : listerArticle");
		return articleDao.listerArticle();
	}
	
	public Article getArticle(Integer idArticle) {
		
		Article article = articleDao.getArticle(idArticle);

		return article;
	}
	
	public void ajouterArticle (Article article){
		articleDao.ajouterArticle(article);
	}
	
	public void supprimerArticle (Integer idArticle){
		articleDao.supprimerArticle(idArticle);
	}
}

