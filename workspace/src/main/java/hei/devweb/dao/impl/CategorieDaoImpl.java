package hei.devweb.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hei.devweb.dao.CategorieDao;
import hei.devweb.model.Categorie;


public class CategorieDaoImpl implements CategorieDao {

	public List<Categorie> listerCategorie() {
			
		List<Categorie> listeCategorie = new ArrayList<Categorie>();
			try{
				/**** Creation de la connexion ****/
				Connection connection = DataSourceProvider.getDataSource().getConnection();
				
				/**** Utilisation de la connexion ****/
				
				PreparedStatement stmt = connection.prepareStatement("SELECT * FROM  T_CATEGORIE");
				ResultSet results = stmt.executeQuery();
				while (results.next()){
					Categorie categorie = new Categorie(
							results.getInt("CAT_ID"),  
							results.getString("CAT_LIBELLE"), 
							results.getString("CAT_IMG_CAT"), 
							results.getString("CAT_IMG_BLOG"), 
							results.getString("CAT_IMG_CAR"), 
							results.getString("CAT_DESCRIPTION"));
							listeCategorie.add(categorie);
				}	
				/**** Fermer la connexion ****/
				
				connection.close();
		    
			} catch (SQLException e) {
		        e.printStackTrace();
		    }
			return listeCategorie;
	}


}
