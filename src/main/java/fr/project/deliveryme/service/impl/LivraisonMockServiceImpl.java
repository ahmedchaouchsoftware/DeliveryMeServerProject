package fr.project.deliveryme.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.project.deliveryme.entity.Livraison;
import fr.project.deliveryme.service.ILivraisonService;

@Service
public class LivraisonMockServiceImpl implements ILivraisonService{

	private List<Livraison> livraisons;
	
	public LivraisonMockServiceImpl() {
		livraisons = new ArrayList<Livraison>();
		livraisons.add(new Livraison("L100","Nouira","Sarah","Courbevoie","LIDL","","Clichy"));
		livraisons.add(new Livraison("L101","Abbes","Hamza","Asnieres","Carrefour","","La Defense"));
		livraisons.add(new Livraison("L100","Kandara","Marouene","Courbevoie","Intermarche","","Paris"));
		livraisons.add(new Livraison("L200","Miledi","Mariem","Paris","Monoprix","","Paris"));
	}

	@Override
	public List<Livraison> getLivraisons() {
		return livraisons;
	}

	@Override
	public void addLivraison(Livraison livraison) {
		livraisons.add(livraison);
		
	}

	@Override
	public void updateLivraison(Livraison livraison) {
		livraisons.remove(livraison);
		livraisons.add(livraison);
		
	}

	@Override
	public void deleteLivraison(Long refLivraison) {
		Livraison livraison = new Livraison();
		livraison.setIdLivraison(refLivraison);
		livraisons.remove(livraison);
		
	}

}
