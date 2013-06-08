package com.posts.service;

import java.util.List;

import com.posts.pojo.Utilisateur;

public interface UtilisateurService {
	public boolean addUtilisateurService(Utilisateur utilisateur);
	public  List<Utilisateur> listUtilisateursService();
}
