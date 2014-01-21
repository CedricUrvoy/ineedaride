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
		// TODO Auto-generated method stub
		return null;
	}

	public List<Article> listerArticleCategorie(Integer idCategorie) {
			
		List<Article> listeArticleCategorie = new ArrayList<Article>();
			try{
				/**** Creation de la connexion ****/
				Connection connection = DataSourceProvider.getDataSource().getConnection();
				
				/**** Utilisation de la connexion ****/
				
				PreparedStatement stmt = connection.prepareStatement("SELECT * FROM  t_article WHERE T_CATEGORIE_CAT_ID=? ORDER BY ART_DATE");
				stmt.setInt(1, idCategorie);
				ResultSet results = stmt.executeQuery();
				while (results.next()){
					Article article = new Article(
							results.getInt("ART_ID"),  
							results.getString("ART_TITLE"), 
							results.getString("ART_DESCRIPTION"),
							results.getString("ART_IMG"), 
							results.getDate("ART_DATE"),
							results.getInt("T_CATEGORIE_CAT_ID"));
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

}
