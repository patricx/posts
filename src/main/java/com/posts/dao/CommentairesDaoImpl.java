package com.posts.dao;



import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.posts.pojo.Commentaires;

@Repository
public class CommentairesDaoImpl implements CommentairesDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	public CommentairesDaoImpl() {}

	public boolean addCommentairesDao(Commentaires commentaires) {
		Boolean retour = false;
		Session session = sessionFactory.getCurrentSession();

		try {
			session.save(commentaires);
			retour = true;
		} catch (Exception e) {
			System.out.println("Erreur commentaire "+e.getMessage());
			retour = false;
		}
	
		return retour;
	}

	public List<Commentaires> listCommentairesDao() {
		// TODO Auto-generated method stub
		return null;
	}

}
