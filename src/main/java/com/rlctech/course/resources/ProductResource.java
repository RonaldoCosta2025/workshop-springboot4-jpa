package com.rlctech.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rlctech.course.entities.Product;
import com.rlctech.course.services.ProductService;

// RECURSOS PARA USER

// anotacao
@RestController
@RequestMapping(value = "/product")
public class ProductResource {

	// criando a dependencia
	@Autowired
	private ProductService service;

	// endpoint para acessar os usuarios
	// metodo que responde a requisicao do tipo get do htpp
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		// instancia o user
		// User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "12345");

		// busca a lista
		List<Product> list = service.findAll();

		// retorna a resposta
		return ResponseEntity.ok().body(list);
	}
	
	//busca por id
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findiById(@PathVariable Long id){
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
