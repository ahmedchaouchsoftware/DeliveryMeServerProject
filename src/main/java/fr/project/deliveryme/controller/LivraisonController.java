package fr.project.deliveryme.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.project.deliveryme.entity.Livraison;
import fr.project.deliveryme.service.ILivraisonService;

@RestController
@RequestMapping("/api/livraison")
public class LivraisonController {

	@Autowired
	private ILivraisonService livraisonService;
	
	@GetMapping
	public List<Livraison> getLivraisons(){
		return livraisonService.getLivraisons();
	}
	
	@PostMapping
	public void addLivraison(@RequestBody Livraison livraison){
		livraisonService.addLivraison(livraison);
	}
	
	@PutMapping
	public void updateLivraison(@RequestBody Livraison livraison){
		livraisonService.updateLivraison(livraison);
	}
	
	@DeleteMapping("/{ref}")
	public void deleteLivraison(@PathVariable String refLivraison){
		livraisonService.deleteLivraison(refLivraison);
	}
	

}
