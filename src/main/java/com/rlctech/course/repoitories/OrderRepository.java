package com.rlctech.course.repoitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rlctech.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	/*
	 * AQUI VAI INSTANCIAR VÁRIOS OBJETOS REPOSITORY COM AS OPERAÇÕES DO USUARIO
	 */
}
