package com.rlctech.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rlctech.course.entities.User;

// RECURSOS PARA USER

// anotacao
@RestController
@RequestMapping(value = "/users")
public class UserResource {

	// endpoint para acessar os usuarios
	// metodo que responde a requisicao do tipo get do htpp
	@GetMapping
	public ResponseEntity<User> findAll() {
		// instancia o user
		User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "12345");
		// retorna a resposta
		return ResponseEntity.ok().body(u);
	}
}
