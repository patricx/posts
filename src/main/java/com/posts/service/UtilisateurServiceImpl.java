package com.posts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.posts.dao.UtilisateurDao;
import com.posts.pojo.Utilisateur;

@Service
@Transactional
public class UtilisateurServiceImpl implements UtilisateurService {
	
	@Autowired
	UtilisateurDao utilisateurdao;
	public UtilisateurServiceImpl() {}
	
	public boolean addUtilisateurService(Utilisateur utilisateur){
		
		return utilisateurdao.addUtilisateurDao(utilisateur);
	}

	public List<Utilisateur> listUtilisateursService() {
		return utilisateurdao.listUtilisateursDao();
	}

}
