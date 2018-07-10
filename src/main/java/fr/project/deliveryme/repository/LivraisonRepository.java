package fr.project.deliveryme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.project.deliveryme.entity.Livraison;

@Repository
public interface LivraisonRepository extends JpaRepository<Livraison, Long>{

	
}
