package hei.devweb.dao.impl;

import java.sql.Connection;
import java.sql.Date;
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
					+ "INNER JOIN t_author  ON T_AUTHOR_AUT_ID = AUT_ID "
					+ "ORDER BY ART_DATE DESC");
			ResultSet results = stmt.executeQuery();
			while (results.next()){
				Article article = new Article(
						results.getInt("ART_ID"),  
						results.getString("ART_TITLE"), 
						results.getString("ART_DESCRIPTION"),
						results.getString("ART_IMG"), 
						results.getDate("ART_DATE"),
						results.getInt("T_CATEGORIE_CAT_ID"),
						results.getInt("T_AUTHOR_AUT_ID"),
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
						+ "ORDER BY ART_DATE DESC");
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
							results.getInt("T_AUTHOR_AUT_ID"),
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
		
		/**** Creation de la connexion ****/
		
		try
		{
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			
			/**** Utilisation de la connexion ****/
			
			PreparedStatement stmt = connection.prepareStatement(""
					+ "INSERT INTO t_article(ART_TITLE,ART_DESCRIPTION,ART_IMG,ART_DATE,T_CATEGORIE_CAT_ID,T_AUTHOR_AUT_ID) VALUES (?,?,?,?,?,?)");
			stmt.setString(1, article.getTitle());
			stmt.setString(2, article.getDescription());
			stmt.setString(3, article.getImage());
			stmt.setDate(4, new Date(article.getDate().getTime()));
			stmt.setInt(5, article.getIdCategorie());
			stmt.setInt(6, article.getIdAuthor());
			stmt.executeUpdate();
		
			/**** Fermer la connexion ****/
			connection.close();
		} catch (SQLException e){
			e.printStackTrace();
		}
		
	}

	public Article getArticle(Integer idArticle) {
		
		Article article = null;
		try{
			/**** Creation de la connexion ****/
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			
			/**** Utilisation de la connexion ****/
			
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM  t_article "
					+ "INNER JOIN t_categorie ON CAT_ID = T_CATEGORIE_CAT_ID "
					+ "INNER JOIN t_author ON T_AUTHOR_AUT_ID = AUT_ID  "
					+ "WHERE ART_ID= ?");
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
						results.getInt("T_AUTHOR_AUT_ID"),
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

	public void supprimerArticle(Integer idArticle) {
		
		/**** Creation de la connexion ****/
		
		try
		{
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			
			/**** Utilisation de la connexion ****/
			
			PreparedStatement stmt = connection.prepareStatement(""
					+ "DELETE FROM t_article WHERE ART_ID=? ");
			stmt.setInt(1,idArticle);
			stmt.executeUpdate();
		
			/**** Fermer la connexion ****/
			connection.close();
		} catch (SQLException e){
			e.printStackTrace();
		}
		
	}

	public List<Article> listerDernierArticle() {
		
		List<Article> listeDernierArticle = new ArrayList<Article>();
		try{
			/**** Creation de la connexion ****/
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			
			/**** Utilisation de la connexion ****/
			
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM  t_article "
					+ "INNER JOIN t_categorie ON CAT_ID = T_CATEGORIE_CAT_ID "
					+ "INNER JOIN t_author ON T_AUTHOR_AUT_ID = AUT_ID "
					+ "ORDER BY ART_DATE DESC"
					+ "LIMIT 3");
			ResultSet results = stmt.executeQuery();
			while (results.next()){
				Article article = new Article(
						results.getInt("ART_ID"),  
						results.getString("ART_TITLE"), 
						results.getString("ART_DESCRIPTION"),
						results.getString("ART_IMG"), 
						results.getDate("ART_DATE"),
						results.getInt("T_CATEGORIE_CAT_ID"),
						results.getInt("T_AUTHOR_AUT_ID"),
						results.getString("CAT_LIBELLE"),
						results.getString("AUT_FIRSTNAME"));
						listeDernierArticle.add(article);
			}	
			/**** Fermer la connexion ****/
			
			connection.close();
	    
		} catch (SQLException e) {
	        e.printStackTrace();
	    }
		return listeDernierArticle;
	}

}
