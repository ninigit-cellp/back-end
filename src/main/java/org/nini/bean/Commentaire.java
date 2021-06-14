package org.nini.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "commentaire")
public class Commentaire {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idComment;
	private String contenu;
	private String proprietaire;
	@ManyToOne
	@JoinColumn(name = "idVoiture")
	private Voiture voiture;
	public Long getIdComment() {
		return idComment;
	}
	public void setIdComment(Long idComment) {
		this.idComment = idComment;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public Voiture getVoiture() {
		return voiture;
	}
	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}
	public String getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}
	public Commentaire(Long idComment, String contenu, String proprietaire) {
		super();
		this.idComment = idComment;
		this.contenu = contenu;
		this.proprietaire = proprietaire;
	}
	public Commentaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
