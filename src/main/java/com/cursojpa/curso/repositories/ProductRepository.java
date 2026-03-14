package com.cursojpa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojpa.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
	
}
