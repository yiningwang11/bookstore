package com.example.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookstore.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
    
}
