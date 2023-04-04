package com.example.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookstore.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
