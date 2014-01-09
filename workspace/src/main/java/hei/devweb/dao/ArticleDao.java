package hei.devweb.dao;

import hei.devweb.model.Article;

import java.util.List;

public interface ArticleDao {
	
	public List<Article> listerArticle();	
	
	public void ajouterArticle(Article article);
}
