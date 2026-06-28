package com.rlctech.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rlctech.course.entities.Category;
import com.rlctech.course.services.CategoryService;

// RECURSOS PARA USER

// anotacao
@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	// criando a dependencia
	@Autowired
	private CategoryService service;

	// endpoint para acessar os usuarios
	// metodo que responde a requisicao do tipo get do htpp
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		// instancia o user
		// User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "12345");

		// busca a lista
		List<Category> list = service.findAll();

		// retorna a resposta
		return ResponseEntity.ok().body(list);
	}
	
	//busca por id
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findiById(@PathVariable Long id){
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
