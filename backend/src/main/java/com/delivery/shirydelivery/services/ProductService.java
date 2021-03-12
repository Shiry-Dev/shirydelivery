package com.delivery.shirydelivery.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.delivery.shirydelivery.dto.ProductDTO;
import com.delivery.shirydelivery.entities.Product;
import com.delivery.shirydelivery.repositories.ProductRepository;

@Service
//Camada de Serviço
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	@Transactional(readOnly = true)
	public List<ProductDTO> findAll(){
		List<Product> list = repository.findAll();
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}	
	 
}
