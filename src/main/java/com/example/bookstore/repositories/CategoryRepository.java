package com.example.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookstore.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
