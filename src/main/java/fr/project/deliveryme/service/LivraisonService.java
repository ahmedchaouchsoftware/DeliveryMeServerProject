package fr.project.deliveryme.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import fr.project.deliveryme.entity.Livraison;
import fr.project.deliveryme.repository.LivraisonRepository;

@Service
@Primary
public class LivraisonService implements ILivraisonService{

	@Autowired
	private LivraisonRepository livraisonRepository;
	
	@Override
	public List<Livraison> getLivraisons() {
		return livraisonRepository.findAll();
	}

	@Override
	public void addLivraison(Livraison livraison) {
		livraisonRepository.save(livraison);
	}

	@Override
	public void updateLivraison(Livraison livraison) {
		livraisonRepository.save(livraison);
	}

	@Override
	public void deleteLivraison(Long idLivraiosn) {
		Livraison livraison = new Livraison();
		livraison.setIdLivraison(idLivraiosn);
		livraisonRepository.delete(livraison);
	}

}
