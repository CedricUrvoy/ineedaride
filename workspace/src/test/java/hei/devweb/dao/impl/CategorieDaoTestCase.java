package hei.devweb.dao.impl;

import hei.devweb.dao.CategorieDao;
import hei.devweb.model.Categorie;
import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CategorieDaoTestCase {
	
private CategorieDao categorieDao = new CategorieDaoImpl();
	
	@Before
	public void purgeBDD()throws Exception{
		new DataSourceProvider();
		Connection connection = DataSourceProvider.getDataSource().getConnection();
		Statement stmt = connection.createStatement();
		stmt.executeUpdate("DELETE FROM t_article");
		stmt.executeUpdate("DELETE FROM t_categorie");
		stmt.executeUpdate("INSERT INTO `t_categorie`(`CAT_ID`,`CAT_LIBELLE`,`CAT_IMG_CAR`,`CAT_IMG_CAT`,`CAT_IMG_BLOG`,`CAT_DESCRIPTION`) "
				+ "VALUES (1,'libelle','imgCar','imgCat','imgBlog','description')");
		stmt.executeUpdate("INSERT INTO `t_categorie`(`CAT_ID`,`CAT_LIBELLE`,`CAT_IMG_CAR`,`CAT_IMG_CAT`,`CAT_IMG_BLOG`,`CAT_DESCRIPTION`) "
				+ "VALUES (2,'libelle2','imgCar2','imgCat2','imgBlog2','description2')");
		stmt.close();
		connection.close();
	}
	
	@Test
	public void testListerCategorie() {
		List<Categorie> listeCategorie = categorieDao.listerCategorie();
		Assert.assertEquals(2, listeCategorie.size());
		Assert.assertEquals(1, listeCategorie.get(0).getId().intValue());
		Assert.assertEquals("libelle", listeCategorie.get(0).getLibelle());
		Assert.assertEquals("description2", listeCategorie.get(1).getText());
	}
	
	@Test
	public void testgetCategorie() {
		Categorie categorie = categorieDao.getCategorie(1);
		Assert.assertEquals(1,categorie.getId().intValue());
		Assert.assertEquals("libelle", categorie.getLibelle());
		Assert.assertEquals("imgCar", categorie.getSrcImgCar());
		Assert.assertEquals("imgCat",categorie.getSrcImgCat() );
		Assert.assertEquals("imgBlog", categorie.getSrcImgBlog());
		Assert.assertEquals("description", categorie.getText());
	}
}
