package com.posts.pojo;

import javax.persistence.UniqueConstraint;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="utilisateur",uniqueConstraints=@UniqueConstraint(columnNames = {"id", "nom","mail"}))
public class Utilisateur implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String nom;
	String mail;
	
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="utilisateur")
	Set<Commentaires> commentaires;

	public Utilisateur() {}
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Set<Commentaires> getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(Set<Commentaires> commentaires) {
		this.commentaires = commentaires;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

}
