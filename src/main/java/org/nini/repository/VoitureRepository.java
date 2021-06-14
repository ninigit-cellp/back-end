package org.nini.repository;

import java.util.List;

import org.nini.bean.Commentaire;
import org.nini.bean.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VoitureRepository extends JpaRepository<Voiture, Long>{

	 
}
