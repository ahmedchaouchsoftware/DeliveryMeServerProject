package fr.project.deliveryme;


import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import fr.project.deliveryme.entity.Livraison;
import fr.project.deliveryme.entity.Role;
import fr.project.deliveryme.entity.User;
import fr.project.deliveryme.repository.LivraisonRepository;
import fr.project.deliveryme.repository.RoleRepository;
import fr.project.deliveryme.repository.UserRepository;
import fr.project.deliveryme.util.RoleEnum;

@SpringBootApplication
public class DeliveryMeServerProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DeliveryMeServerProjectApplication.class, args);
//		RoleRepository roleRepository = context.getBean(RoleRepository.class);
//		
//		Role roleUser = new Role(RoleEnum.ROLE_USER);
//		Role roleAdmin = new Role(RoleEnum.ROLE_ADMIN);
//		
//		roleRepository.save(roleUser);
//		roleRepository.save(roleAdmin);
//		
//		UserRepository userRepository = context.getBean(UserRepository.class);
//		
//		User user = new User("user", "password1", true);
//		user.setRoles(Arrays.asList(roleUser));
//		
//		userRepository.save(user);
//		
//		User admin = new User("admin", "password2", true);
//		admin.setRoles(Arrays.asList(roleUser, roleAdmin));
//		
//		userRepository.save(admin);
	}
}
