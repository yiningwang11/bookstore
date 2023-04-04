package com.example.bookstore.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookstore.entities.User;
import com.example.bookstore.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepo;

    public List<User> findAll(){
        return userRepo.findAll();
    }

    public User findById(Long id){
        return userRepo.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public User save(User user){
        return userRepo.save(user);
    }

    public void deleteById(Long id){
        userRepo.deleteById(id);
    }
    
}