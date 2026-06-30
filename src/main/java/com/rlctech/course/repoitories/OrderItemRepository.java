package com.rlctech.course.repoitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rlctech.course.entities.OrderItem;
import com.rlctech.course.entities.PK.OrdemItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrdemItemPK>{

	/*
	 * AQUI VAI INSTANCIAR VÁRIOS OBJETOS REPOSITORY COM AS OPERAÇÕES DO USUARIO
	 */
}
