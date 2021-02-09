package com.tiagosilvagomes.Projeto_Web_Services_Com_Spring_Boot_e_JPA_Hibernate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiagosilvagomes.Projeto_Web_Services_Com_Spring_Boot_e_JPA_Hibernate.entities.Order;
import com.tiagosilvagomes.Projeto_Web_Services_Com_Spring_Boot_e_JPA_Hibernate.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository userRepository;
	
	public List<Order> findAll(){
		return userRepository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = userRepository.findById(id);
		return obj.get();
	}

}
