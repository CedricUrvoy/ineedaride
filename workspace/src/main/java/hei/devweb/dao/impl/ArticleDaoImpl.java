package hei.devweb.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hei.devweb.dao.ArticleDao;
import hei.devweb.model.Article;

public class ArticleDaoImpl implements ArticleDao{

	public List<Article> listerArticle() {
		
		List<Article> listeArticle = new ArrayList<Article>();
		try{
			/**** Creation de la connexion ****/
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			
			/**** Utilisation de la connexion ****/
			
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM  t_article "
					+ "INNER JOIN t_categorie ON CAT_ID = T_CATEGORIE_CAT_ID "
					+ "INNER JOIN t_author ON T_AUTHOR_AUT_ID = AUT_ID "
					+ "ORDER BY ART_DATE");
			ResultSet results = stmt.executeQuery();
			while (results.next()){
				Article article = new Article(
						results.getInt("ART_ID"),  
						results.getString("ART_TITLE"), 
						results.getString("ART_DESCRIPTION"),
						results.getString("ART_IMG"), 
						results.getDate("ART_DATE"),
						results.getInt("T_CATEGORIE_CAT_ID"),
						results.getString("CAT_LIBELLE"),
						results.getString("AUT_FIRSTNAME"));
						listeArticle.add(article);
			}	
			/**** Fermer la connexion ****/
			
			connection.close();
	    
		} catch (SQLException e) {
	        e.printStackTrace();
	    }
		return listeArticle;

	}

	public List<Article> listerArticleCategorie(Integer idCategorie) {
			
		List<Article> listeArticleCategorie = new ArrayList<Article>();
			try{
				/**** Creation de la connexion ****/
				Connection connection = DataSourceProvider.getDataSource().getConnection();
				
				/**** Utilisation de la connexion ****/
				
				PreparedStatement stmt = connection.prepareStatement("SELECT * FROM  t_article "
						+ "INNER JOIN t_categorie ON CAT_ID = T_CATEGORIE_CAT_ID "
						+ "INNER JOIN t_author ON T_AUTHOR_AUT_ID = AUT_ID "
						+ "WHERE T_CATEGORIE_CAT_ID=? "
						+ "ORDER BY ART_DATE");
				stmt.setInt(1, idCategorie);
				ResultSet results = stmt.executeQuery();
				while (results.next()){
					Article article = new Article(
							results.getInt("ART_ID"),  
							results.getString("ART_TITLE"), 
							results.getString("ART_DESCRIPTION"),
							results.getString("ART_IMG"), 
							results.getDate("ART_DATE"),
							results.getInt("T_CATEGORIE_CAT_ID"),
							results.getString("CAT_LIBELLE"),
							results.getString("AUT_FIRSTNAME"));
							listeArticleCategorie.add(article);
				}	
				/**** Fermer la connexion ****/
				
				connection.close();
		    
			} catch (SQLException e) {
		        e.printStackTrace();
		    }
			return listeArticleCategorie;

		}

	public void ajouterArticle(Article article) {
		// TODO Auto-generated method stub
		
	}

	public Article getArticle(Integer idArticle) {
		
		Article article = null;
		try{
			/**** Creation de la connexion ****/
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			
			/**** Utilisation de la connexion ****/
			
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM  t_article INNER JOIN t_categorie ON CAT_ID = T_CATEGORIE_CAT_ID INNER JOIN t_author ON T_AUTHOR_AUT_ID = AUT_ID  WHERE ART_ID= ?");
			stmt.setInt(1, idArticle);
			ResultSet results = stmt.executeQuery();
			if(results.next()){
				article = new Article(
						results.getInt("ART_ID"),  
						results.getString("ART_TITLE"), 
						results.getString("ART_DESCRIPTION"),
						results.getString("ART_IMG"), 
						results.getDate("ART_DATE"),
						results.getInt("T_CATEGORIE_CAT_ID"),
						results.getString("CAT_LIBELLE"),
						results.getString("AUT_FIRSTNAME"));
			}
			
			/**** Fermer la connexion ****/
			
			connection.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
		
		return article;
	}

}
