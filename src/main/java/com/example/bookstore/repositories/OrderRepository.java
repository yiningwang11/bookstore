package com.example.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookstore.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
