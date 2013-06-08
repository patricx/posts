package com.posts.dao;

import java.util.List;

import com.posts.pojo.Commentaires;
import com.posts.pojo.Utilisateur;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UtilisateurDaoImpl implements UtilisateurDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public UtilisateurDaoImpl() {}

	public boolean addUtilisateurDao(Utilisateur utilisateur) {
		Boolean retour = false;
		Session session = sessionFactory.getCurrentSession();
		session.clear();
		try {
			session.save(utilisateur);
			
			retour = true;
		} catch (Exception e) {
			retour = false;
			System.out.println("Erreur user"+e.getMessage());
		}
		
		return retour;
	}

	public List<Utilisateur> listUtilisateursDao() {
		List<Utilisateur> utilisateurs = null;
		Session session = sessionFactory.getCurrentSession();
		String querystring ="from Utilisateur as u RIGHT JOIN FETCH u.commentaires";
		try{
			Query query = session.createQuery(querystring);
			utilisateurs = query.list(); 
			
			
			
		}catch (Exception e) {
			System.out.println("Erreur  "+e.getMessage());
		}
		
		return utilisateurs;
	}

}
