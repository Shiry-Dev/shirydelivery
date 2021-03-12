package com.delivery.shirydelivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delivery.shirydelivery.entities.Product;


//Camada de acesso a dados
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
