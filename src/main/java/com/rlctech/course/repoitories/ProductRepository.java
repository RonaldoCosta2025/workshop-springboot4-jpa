package com.rlctech.course.repoitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rlctech.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	/*
	 * AQUI VAI INSTANCIAR VÁRIOS OBJETOS REPOSITORY COM AS OPERAÇÕES DO USUARIO
	 */
}
