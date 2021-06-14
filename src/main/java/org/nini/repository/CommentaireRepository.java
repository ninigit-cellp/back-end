package org.nini.repository;


import java.util.List;

import org.nini.bean.Commentaire;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CommentaireRepository extends JpaRepository<Commentaire, Long>{
	@Query("select c from Commentaire c where c.voiture.idVoiture= :x")
	public List<Commentaire> getCommentaireByVoiture(@Param("x") Long idVoiture);
}
