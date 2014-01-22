package hei.devweb.metier;

import hei.devweb.dao.AuteurDao;
import hei.devweb.dao.impl.AuteurDaoImpl;
import hei.devweb.model.Auteur;

import java.util.List;

public class AuteurManager {
	
	private static AuteurManager instance;

	private AuteurDao auteurDao = new AuteurDaoImpl();

	private AuteurManager() {
	}

	public static AuteurManager getInstance() {
		if (instance == null) {
			instance = new AuteurManager();
		}
		return instance;
	}

	
	public List<Auteur> listerAuteur() {
		System.out.println("Dans Methode : listerAuteur");
		return auteurDao.listerAuteur();
	}
	
}
