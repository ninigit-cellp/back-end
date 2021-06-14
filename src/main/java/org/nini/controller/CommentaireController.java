package org.nini.controller;

import java.util.List;
import java.util.Optional;

import org.nini.bean.Commentaire;
import org.nini.bean.Voiture;
import org.nini.repository.CommentaireRepository;
import org.nini.repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/n2")
public class CommentaireController {
	
		@Autowired
	    private CommentaireRepository commentaireRepository;
		@Autowired
		private VoitureRepository voitureRepository;

	    @GetMapping("/commentaire/{id}")
	    public List<Commentaire> getAllCommentairesByVoiture(@PathVariable(value = "id") Long idVoiture) {
	        return commentaireRepository.getCommentaireByVoiture(idVoiture);
	    }
	    
	    @PostMapping("/commentaire/{id}")
	    public Commentaire createCommentaire(@RequestBody Commentaire commentaire,@PathVariable(value = "id") Long idVoiture)throws Exception{
	    	
	    	Optional<Voiture> voiture = voitureRepository.findById(idVoiture);
	    	if(voiture.isPresent()) {
	    		commentaire.setVoiture(voiture.get());
	    		
			}
			else {
				new Exception("Voiture introuvable");
				}
	    	
	        return commentaireRepository.save(commentaire);
	    }


}
