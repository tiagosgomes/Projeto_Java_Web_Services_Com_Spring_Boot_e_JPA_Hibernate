package com.tiagosilvagomes.Projeto_Web_Services_Com_Spring_Boot_e_JPA_Hibernate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiagosilvagomes.Projeto_Web_Services_Com_Spring_Boot_e_JPA_Hibernate.entities.Product;
import com.tiagosilvagomes.Projeto_Web_Services_Com_Spring_Boot_e_JPA_Hibernate.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository userRepository;
	
	public List<Product> findAll(){
		return userRepository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = userRepository.findById(id);
		return obj.get();
	}

}
