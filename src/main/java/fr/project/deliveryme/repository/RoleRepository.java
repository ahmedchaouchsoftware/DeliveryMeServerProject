package fr.project.deliveryme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.project.deliveryme.entity.Role;



@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
