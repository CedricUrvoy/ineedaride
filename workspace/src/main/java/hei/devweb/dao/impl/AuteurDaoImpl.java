package hei.devweb.dao.impl;

import hei.devweb.dao.AuteurDao;
import hei.devweb.model.Article;
import hei.devweb.model.Auteur;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuteurDaoImpl implements AuteurDao {

	public List<Auteur> listerAuteur() {
		
		List<Auteur> listeAuteur = new ArrayList<Auteur>();
		try{
			/**** Creation de la connexion ****/
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			
			/**** Utilisation de la connexion ****/
			
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM t_author");
			ResultSet results = stmt.executeQuery();
			while (results.next()){
				Auteur auteur = new Auteur(
						results.getInt("AUT_ID"),  
						results.getString("AUT_FIRSTNAME"), 
						results.getString("AUT_SURNAME"),
						results.getString("AUT_INFOS"));
						listeAuteur.add(auteur);
			}	
			/**** Fermer la connexion ****/
			
			connection.close();
	    
		} catch (SQLException e) {
	        e.printStackTrace();
	    }
		return listeAuteur;

	}
}
