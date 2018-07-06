package fr.project.deliveryme.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.project.deliveryme.entity.Livraison;

@Service
public class LivraisonMockServiceImpl implements ILivraisonService{

	private List<Livraison> livraisons;
	
	public LivraisonMockServiceImpl() {
		livraisons = new ArrayList<Livraison>();
		livraisons.add(new Livraison("L100","Nouira","Sarah","Courbevoie","LIDL","","Clichy"));
		livraisons.add(new Livraison("L101'","Abbes","Hamza","Asnieres","Carrefour","","La Defense"));
		livraisons.add(new Livraison("L100","Kandara","Marouene","Courbevoie","Intermarche","","Paris"));
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
	public void deleteLivraison(String refLivraison) {
		Livraison livraison = new Livraison();
		livraison.setRef(refLivraison);
		livraisons.remove(livraison);
		
	}

}