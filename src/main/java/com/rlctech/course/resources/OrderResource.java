package com.rlctech.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rlctech.course.entities.User;
import com.rlctech.course.services.UserService;

// RECURSOS PARA USER

// anotacao
@RestController
@RequestMapping(value = "/users")
public class OrderResource {

	// criando a dependencia
	@Autowired
	private UserService service;

	// endpoint para acessar os usuarios
	// metodo que responde a requisicao do tipo get do htpp
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		// instancia o user
		// User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "12345");

		// busca a lista
		List<User> list = service.findAll();

		// retorna a resposta
		return ResponseEntity.ok().body(list);
	}
	
	//busca por id
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findiById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
