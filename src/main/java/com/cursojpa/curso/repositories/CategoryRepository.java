package com.cursojpa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojpa.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
	
}
