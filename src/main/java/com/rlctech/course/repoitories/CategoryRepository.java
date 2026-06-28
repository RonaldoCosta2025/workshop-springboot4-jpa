package com.rlctech.course.repoitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rlctech.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	/*
	 * AQUI VAI INSTANCIAR VÁRIOS OBJETOS REPOSITORY COM AS OPERAÇÕES DO USUARIO
	 */
}
