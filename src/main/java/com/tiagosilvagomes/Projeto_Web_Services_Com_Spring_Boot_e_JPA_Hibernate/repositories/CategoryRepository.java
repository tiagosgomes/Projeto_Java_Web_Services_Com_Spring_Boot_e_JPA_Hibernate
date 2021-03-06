package com.tiagosilvagomes.Projeto_Web_Services_Com_Spring_Boot_e_JPA_Hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tiagosilvagomes.Projeto_Web_Services_Com_Spring_Boot_e_JPA_Hibernate.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}