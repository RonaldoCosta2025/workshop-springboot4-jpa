package com.rlctech.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rlctech.course.entities.Order;
import com.rlctech.course.repoitories.OrderRepository;

@Service
public class OrderService {

	// injeção de dependencia
	@Autowired
	private OrderRepository repository;

	// busca todos os dados
	public List<Order> findAll() {
		// repassa a chamada para o repository.findAll()
		return repository.findAll();
	}

	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

}
