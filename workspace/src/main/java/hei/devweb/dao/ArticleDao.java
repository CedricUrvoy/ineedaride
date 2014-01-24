package hei.devweb.dao;

import hei.devweb.model.Article;

import java.util.List;

public interface ArticleDao {
	
	public List<Article> listerArticle();	
	
	public List<Article> listerDernierArticle();
	
	public List<Article> listerArticleCategorie(Integer idCategorie);
	
	public Article getArticle(Integer idArticle);
	
	public void ajouterArticle(Article article);
	
	public void supprimerArticle(Integer idArticle);
}
