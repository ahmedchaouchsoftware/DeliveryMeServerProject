package fr.project.deliveryme;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import fr.project.deliveryme.entity.Livraison;
import fr.project.deliveryme.repository.LivraisonRepository;

@SpringBootApplication
public class DeliveryMeServerProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DeliveryMeServerProjectApplication.class, args);
//		LivraisonRepository livraisonRepository = context.getBean(LivraisonRepository.class);
//		livraisonRepository.save(new Livraison("L100","Nouira","Sarah","Courbevoie","LIDL","","Clichy"));
//		livraisonRepository.save(new Livraison("L101","Abbes","Hamza","Asnieres","Carrefour","","La Defense"));
//		livraisonRepository.save(new Livraison("L100","Kandara","Marouene","Courbevoie","Intermarche","","Paris"));
//		livraisonRepository.save(new Livraison("L200","Miledi","Mariem","Paris","Monoprix","","Paris"));
	}
}
