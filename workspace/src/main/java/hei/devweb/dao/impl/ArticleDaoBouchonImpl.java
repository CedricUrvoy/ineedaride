package hei.devweb.dao.impl;

import java.util.ArrayList;
import java.util.List;

import hei.devweb.dao.ArticleDao;
import hei.devweb.model.Article;

public class ArticleDaoBouchonImpl implements ArticleDao {
	
	List<Article> articles = new ArrayList<Article>();

	public ArticleDaoBouchonImpl() {
		this.ajouterArticle(new Article(null, "Test des Salomon Rockers 122","Lorem Ipsum",null,null));
		this.ajouterArticle(new Article(null, "Test des Apo Hutch", "Lorem Ipsum",null,null));
		this.ajouterArticle(new Article(null, "Test des Line MasterMind", "Lorem Ipsum",null,null));
	}

	public void ajouterArticle(Article article) {
		article.setId(articles.size() + 1);
		articles.add(article);
		
	}

	public List<Article> listerArticle() {
		
		return this.articles;
	}
	
	

}
