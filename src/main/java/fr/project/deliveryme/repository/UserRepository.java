package fr.project.deliveryme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.project.deliveryme.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByUsername(String str);

}
