package com.example.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookstore.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
    
}
