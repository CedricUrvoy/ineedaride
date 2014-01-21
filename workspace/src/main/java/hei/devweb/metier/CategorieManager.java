package hei.devweb.metier;

import hei.devweb.dao.CategorieDao;
import hei.devweb.dao.impl.CategorieDaoImpl;
import hei.devweb.model.Categorie;
import java.util.List;

public class CategorieManager {

	private static CategorieManager instance;

	private CategorieDao categorieDao = new CategorieDaoImpl();

	private CategorieManager() {
	}

	public static CategorieManager getInstance() {
		if (instance == null) {
			instance = new CategorieManager();
		}
		return instance;
	}

	public List<Categorie> listerCategorie() {
		System.out.println("Dans Methode : listerCategorie");
		return categorieDao.listerCategorie();
	}

}
