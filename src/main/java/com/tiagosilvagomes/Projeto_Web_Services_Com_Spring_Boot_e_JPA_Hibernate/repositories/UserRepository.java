package com.tiagosilvagomes.Projeto_Web_Services_Com_Spring_Boot_e_JPA_Hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiagosilvagomes.Projeto_Web_Services_Com_Spring_Boot_e_JPA_Hibernate.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}