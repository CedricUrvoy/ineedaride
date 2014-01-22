package hei.devweb.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hei.devweb.dao.CommentaireDao;
import hei.devweb.model.Commentaire;

public class CommentaireDaoImpl implements CommentaireDao{

	public void ajouterCommentaire(Commentaire commentaire) {

		/**** Creation de la connexion ****/
		
		try
		{
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			
			/**** Utilisation de la connexion ****/
			
			PreparedStatement stmt = connection.prepareStatement(""
					+ "INSERT INTO t_comment(COM_TEXT,COM_NAME,COM_EMAIL,T_ARTICLE_ART_ID) VALUES (?,?,?,?)");
			stmt.setString(1, commentaire.getText());
			stmt.setString(2, commentaire.getName());
			stmt.setString(3, commentaire.getEmail());
			stmt.setInt(4,commentaire.getIdArticle());
			stmt.executeUpdate();
		
			/**** Fermer la connexion ****/
			connection.close();
		} catch (SQLException e){
			e.printStackTrace();
		}
		
	}

	public List<Commentaire> listerCommentaire(Integer idArticle) {
		
		List<Commentaire> listeCommentaires = new ArrayList<Commentaire>();
		try{
			/**** Creation de la connexion ****/
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			
			/**** Utilisation de la connexion ****/
			
			PreparedStatement stmt = connection.prepareStatement(""
					+"SELECT * FROM  t_comment WHERE T_ARTICLE_ART_ID=?");
			stmt.setInt(1, idArticle);
			ResultSet results = stmt.executeQuery();
			while (results.next()){
				Commentaire commentaire = new Commentaire(
						results.getInt("COM_ID"),  
						results.getString("COM_TEXT"), 
						results.getString("COM_NAME"), 
						results.getString("COM_EMAIL"), 
						results.getInt("T_ARTICLE_ART_ID"));
						listeCommentaires.add(commentaire);
			}	
			/**** Fermer la connexion ****/
			
			connection.close();
	    
		} catch (SQLException e) {
	        e.printStackTrace();
	    }
		return listeCommentaires;
	}

	public int CompterCommentaire(Integer idArticle) {
		
		int compt = 0;
		
		try{
			/**** Creation de la connexion ****/
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			
			/**** Utilisation de la connexion ****/
			
			PreparedStatement stmt = connection.prepareStatement(""
					+"SELECT COUNT(*) FROM  t_comment WHERE T_ARTICLE_ART_ID=?");
			stmt.setInt(1, idArticle);
			ResultSet results = stmt.executeQuery();
			while (results.next()){
				compt = results.getInt("COUNT(COM_ID)");
			}	
			/**** Fermer la connexion ****/
			
			connection.close();
	    
		} catch (SQLException e) {
	        e.printStackTrace();
	    }
		return compt;
	}


}
