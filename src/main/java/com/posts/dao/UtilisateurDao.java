package com.posts.dao;

import java.util.List;

import com.posts.pojo.Utilisateur;

public interface UtilisateurDao {
	boolean addUtilisateurDao(Utilisateur utilisateur);
	List<Utilisateur> listUtilisateursDao();
}