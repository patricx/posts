package com.posts.controllers;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.posts.pojo.Commentaires;
import com.posts.pojo.Utilisateur;
import com.posts.service.CommentairesServices;
import com.posts.service.UtilisateurService;

@Controller
public class Postscontroller {
	
	@Autowired
	CommentairesServices commentairesservices;
	
	@Autowired
	UtilisateurService utilisateurservice;
	
	@RequestMapping(value="inserer-un-post")
	public String insererpost(){
		return("inserer-un-post");
	}
	
	@RequestMapping(value="enregistrer-le-post", method= RequestMethod.POST)
	public String enregistrerpos(@ModelAttribute(value="Utilisateur") Utilisateur utilisateur,@ModelAttribute(value="Commentaires") Commentaires commentaires){
		
		utilisateurservice.addUtilisateurService(utilisateur);
		commentaires.setUtilisateur(utilisateur);
	
		commentairesservices.addCommentairesService(commentaires);
		
		return("liste-des-post");
	}
	
	@RequestMapping(value="liste-des-post")
	public ModelAndView listedespost(){
		List<Utilisateur> utilisateurs = utilisateurservice.listUtilisateursService();
		
		System.out.println("Controller");
		for (Utilisateur user:utilisateurs) {
			   
			   for (Commentaires  commentaire: user.getCommentaires()) {
				   System.out.println(user.getNom()+" "+user.getMail()+" "+commentaire.getCommentaire()+" "+commentaire.getDatecommentaire());
			    }
			}
		return(new ModelAndView("liste-des-post", "userandposts", utilisateurs));
	}
	
}
