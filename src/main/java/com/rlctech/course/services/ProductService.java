package com.rlctech.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rlctech.course.entities.Product;
import com.rlctech.course.repoitories.ProductRepository;

@Service
public class ProductService {

	// injeção de dependencia
	@Autowired
	private ProductRepository repository;

	// busca todos os dados
	public List<Product> findAll() {
		// repassa a chamada para o repository.findAll()
		return repository.findAll();
	}

	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

}
