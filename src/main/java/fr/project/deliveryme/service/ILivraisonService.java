package fr.project.deliveryme.service;

import java.util.List;

import fr.project.deliveryme.entity.Livraison;

public interface ILivraisonService {

	List<Livraison> getLivraisons();
	
	void addLivraison(Livraison livraison);
	
	void updateLivraison(Livraison livraison);
	
	void deleteLivraison(Long idLivraison);
}
