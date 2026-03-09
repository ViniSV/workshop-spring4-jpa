package com.cursojpa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojpa.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
