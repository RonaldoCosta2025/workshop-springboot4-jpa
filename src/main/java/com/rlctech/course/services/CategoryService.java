package com.rlctech.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rlctech.course.entities.Category;
import com.rlctech.course.repoitories.CategoryRepository;

@Service
public class CategoryService {

	// injeção de dependencia
	@Autowired
	private CategoryRepository repository;

	// busca todos os dados
	public List<Category> findAll() {
		// repassa a chamada para o repository.findAll()
		return repository.findAll();
	}

	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}

}
