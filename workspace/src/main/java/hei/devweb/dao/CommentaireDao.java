package hei.devweb.dao;


import hei.devweb.model.Commentaire;

import java.util.List;

public interface CommentaireDao {
	
	public void ajouterCommentaire(Commentaire commentaire);

	public List<Commentaire> listerCommentaire(Integer idArticle);
	
	public int CompterCommentaire(Integer idArticle);
}
