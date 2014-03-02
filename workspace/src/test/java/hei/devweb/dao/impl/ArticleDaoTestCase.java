package hei.devweb.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hei.devweb.dao.ArticleDao;
import hei.devweb.model.Article;

public class ArticleDaoTestCase {
	
	private ArticleDao articleDao = new ArticleDaoImpl();
	
	@Before
	public void purgeBDD()throws Exception{
		Connection connection = new DataSourceProvider().getDataSource().getConnection();
		Statement stmt = connection.createStatement();
		stmt.executeUpdate("DELETE FROM t_comment");
		stmt.executeUpdate("DELETE FROM t_article");
		stmt.executeUpdate("DELETE FROM t_categorie");
		stmt.executeUpdate("DELETE FROM t_author");
		stmt.executeUpdate("INSERT INTO `t_author`(`AUT_ID`,`AUT_FIRSTNAME`,`AUT_SURNAME`,`AUT_INFOS`)"
				+ "VALUES(1,'fistname','surname','infos')");
		stmt.executeUpdate("INSERT INTO `t_author`(`AUT_ID`,`AUT_FIRSTNAME`,`AUT_SURNAME`,`AUT_INFOS`)"
				+ "VALUES(2,'fistname2','surname2','infos2')");
		stmt.executeUpdate("INSERT INTO `t_categorie`(`CAT_ID`,`CAT_LIBELLE`,`CAT_IMG_CAR`,`CAT_IMG_CAT`,`CAT_IMG_BLOG`,`CAT_DESCRIPTION`) "
				+ "VALUES (1,'libelle','imgCar','imgCat','imgBlog','description')");
		stmt.executeUpdate("INSERT INTO `t_categorie`(`CAT_ID`,`CAT_LIBELLE`,`CAT_IMG_CAR`,`CAT_IMG_CAT`,`CAT_IMG_BLOG`,`CAT_DESCRIPTION`) "
				+ "VALUES (2,'libelle2','imgCar2','imgCat2','imgBlog2','description2')");
		stmt.executeUpdate("INSERT INTO `t_article`(`ART_ID`,`ART_TITLE`,`ART_DESCRIPTION`,`ART_DATE`,`ART_IMG`,`T_CATEGORIE_CAT_ID`,`T_AUTHOR_AUT_ID`) "
				+ "VALUES (1,'titre','description','2014-01-01','image',1,1)");
		stmt.executeUpdate("INSERT INTO `t_article`(`ART_ID`,`ART_TITLE`,`ART_DESCRIPTION`,`ART_DATE`,`ART_IMG`,`T_CATEGORIE_CAT_ID`,`T_AUTHOR_AUT_ID`) "
				+ "VALUES (2,'titre2','description2','2014-01-2','image2',2,2)");
		stmt.close();
		connection.close();
	}


	@Test
	public void testListerArticleCategorie() {
		List<Article> listeArticleCategorie = articleDao.listerArticleCategorie(1);
		Assert.assertEquals(1, listeArticleCategorie.size());
		Assert.assertEquals(1, listeArticleCategorie.get(0).getId().intValue());
		Assert.assertEquals("titre", listeArticleCategorie.get(0).getTitle());
		Assert.assertEquals("description", listeArticleCategorie.get(0).getDescription());
	}
	
	@Test
	public void testListerArticle() {
		List<Article> listeArticle = articleDao.listerArticle();
		Assert.assertEquals(2, listeArticle.size());
		Assert.assertEquals(1, listeArticle.get(1).getId().intValue());
		Assert.assertEquals("titre", listeArticle.get(1).getTitle());
		Assert.assertEquals("description", listeArticle.get(1).getDescription());
	}



	@Test
	public void testAjouterArticle() throws Exception {
		Calendar cal = GregorianCalendar.getInstance();
		cal.set(Calendar.YEAR, 2014);
		cal.set(Calendar.MONTH, Calendar.JANUARY);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		Article	article = new Article(null,"monTitre", "maDescription", "monImage", cal.getTime(), 1, 1, "Ski & Snow","Cedric");
		articleDao.ajouterArticle(article);
	
		Connection connection = DataSourceProvider.getDataSource()
				.getConnection();
		Statement stmt = connection.createStatement();
		ResultSet results = stmt.executeQuery("SELECT * FROM t_article WHERE ART_TITLE='monTitre'");
		Assert.assertTrue(results.next());
		Assert.assertNotNull(results.getInt("ART_ID"));
		Assert.assertEquals("monTitre", results.getString("ART_TITLE"));
		Assert.assertEquals("maDescription", results.getString("ART_DESCRIPTION"));
		Assert.assertEquals("monImage", results.getString("ART_IMG"));
		Assert.assertEquals(cal.getTime(), results.getDate("ART_DATE"));
		Assert.assertEquals(1, results.getInt("T_CATEGORIE_CAT_ID"));
		Assert.assertEquals(1, results.getInt("T_AUTHOR_AUT_ID"));
		Assert.assertFalse(results.next());
	
		stmt.close();
		connection.close();
	}
	
	
}