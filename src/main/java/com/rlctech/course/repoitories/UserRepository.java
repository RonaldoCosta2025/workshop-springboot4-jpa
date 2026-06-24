package com.rlctech.course.repoitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rlctech.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	/*
	 * AQUI VAI INSTANCIAR VÁRIOS OBJETOS REPOSITORY COM AS OPERAÇÕES DO USUARIO
	 */
}
