package com.rlctech.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rlctech.course.entities.User;
import com.rlctech.course.repoitories.UserRepository;

@Service
public class UserService {

	// injeção de dependencia
	@Autowired
	private UserRepository repository;

	// busca todos os dados
	public List<User> findAll() {
		// repassa a chamada para o repository.findAll()
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}

}
