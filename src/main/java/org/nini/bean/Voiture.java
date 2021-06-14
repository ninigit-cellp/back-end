package org.nini.bean;


import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author PC
 *
 */
@Entity
@Table(name = "voiture")
public class Voiture {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long idVoiture;
	private String marque;
	private String modele;
	@OneToMany(mappedBy = "voiture", fetch = FetchType.LAZY)
	private Collection<Commentaire> commentaire;
	
	public Long getIdVoiture() {
		return idVoiture;
	}

	public void setIdVoiture(Long idVoiture) {
		this.idVoiture = idVoiture;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}


	public String getModele() {
		return modele;
	}


	public void setModele(String modele) {
		this.modele = modele;
	}
	
	@JsonIgnore
	public Collection<Commentaire> getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(Collection<Commentaire> commentaire) {
		this.commentaire = commentaire;
	}

	public Voiture(Long idVoiture, String marque, String modele) {
		super();
		this.idVoiture = idVoiture;
		this.marque = marque;
		this.modele = modele;
	}

	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public String toString() {
        return "Voiture [id=" + idVoiture + ", marque=" + marque + ", modele=" + modele + "]";
    }
	
}
