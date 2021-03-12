package com.delivery.shirydelivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delivery.shirydelivery.entities.Order;

//Camada de acesso a dados
public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
