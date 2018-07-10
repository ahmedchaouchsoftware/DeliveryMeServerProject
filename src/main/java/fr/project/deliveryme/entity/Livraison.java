package fr.project.deliveryme.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livraison {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLivraison;
	
	private String ref;
	
	private String expediteur_nom;
	
	private String expediteur_prenom;
	
	private String expediteur_adresse;
	
	private String destinataire_nom;
	
	private String destinataire_prenom;
	
	private String destinataire_adresse;

	public Livraison() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Livraison(String ref, String expediteur_nom, String expediteur_prenom, String expediteur_adresse,
			String destinataire_nom, String destinataire_prenom, String destinataire_adresse) {
		super();
		this.ref = ref;
		this.expediteur_nom = expediteur_nom;
		this.expediteur_prenom = expediteur_prenom;
		this.expediteur_adresse = expediteur_adresse;
		this.destinataire_nom = destinataire_nom;
		this.destinataire_prenom = destinataire_prenom;
		this.destinataire_adresse = destinataire_adresse;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getExpediteur_nom() {
		return expediteur_nom;
	}

	public void setExpediteur_nom(String expediteur_nom) {
		this.expediteur_nom = expediteur_nom;
	}

	public String getExpediteur_prenom() {
		return expediteur_prenom;
	}

	public void setExpediteur_prenom(String expediteur_prenom) {
		this.expediteur_prenom = expediteur_prenom;
	}

	public String getExpediteur_adresse() {
		return expediteur_adresse;
	}

	public void setExpediteur_adresse(String expediteur_adresse) {
		this.expediteur_adresse = expediteur_adresse;
	}

	public String getDestinataire_nom() {
		return destinataire_nom;
	}

	public void setDestinataire_nom(String destinataire_nom) {
		this.destinataire_nom = destinataire_nom;
	}

	public String getDestinataire_prenom() {
		return destinataire_prenom;
	}

	public void setDestinataire_prenom(String destinataire_prenom) {
		this.destinataire_prenom = destinataire_prenom;
	}

	public String getDestinataire_adresse() {
		return destinataire_adresse;
	}

	public void setDestinataire_adresse(String destinataire_adresse) {
		this.destinataire_adresse = destinataire_adresse;
	}
	
	public Long getIdLivraison() {
		return idLivraison;
	}

	public void setIdLivraison(Long idLivraison) {
		this.idLivraison = idLivraison;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idLivraison == null) ? 0 : idLivraison.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livraison other = (Livraison) obj;
		if (idLivraison == null) {
			if (other.idLivraison != null)
				return false;
		} else if (!idLivraison.equals(other.idLivraison))
			return false;
		return true;
	}

}
