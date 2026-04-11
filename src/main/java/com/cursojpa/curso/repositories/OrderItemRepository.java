package com.cursojpa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojpa.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
