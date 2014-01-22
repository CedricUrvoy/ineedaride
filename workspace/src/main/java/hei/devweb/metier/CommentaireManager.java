package hei.devweb.metier;

import hei.devweb.dao.CommentaireDao;
import hei.devweb.dao.impl.CommentaireDaoImpl;
import hei.devweb.model.Commentaire;
import java.util.List;

public class CommentaireManager {

	private static CommentaireManager instance;

	private CommentaireDao commentaireDao = new CommentaireDaoImpl();

	private CommentaireManager() {
	}

	public static CommentaireManager getInstance() {
		if (instance == null) {
			instance = new CommentaireManager();
		}
		return instance;
	}

	public List<Commentaire> listerCommentaire(Integer idArticle) {
		System.out.println("Dans Methode : listerCommentaire");
		return commentaireDao.listerCommentaire(idArticle);
	}
	
	public void ajouterCommentaire(Commentaire commentaire) {
		commentaireDao.ajouterCommentaire(commentaire);
	}
}
