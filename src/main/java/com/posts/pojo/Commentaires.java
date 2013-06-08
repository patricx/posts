package com.posts.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="commentaires",uniqueConstraints = @UniqueConstraint(columnNames = { "id","datecommentaire"}))
public class Commentaires implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String commentaire;
	String datecommentaire;
	String titre;
	
	@ManyToOne
	@JoinColumn(name="auteur")
	Utilisateur utilisateur;
	
	public Commentaires() {}
	
	
	
	public String getDatecommentaire() {
		return datecommentaire;
	}



	public void setDatecommentaire(String datecommentaire) {
		this.datecommentaire = datecommentaire;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	

}
