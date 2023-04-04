package com.example.bookstore.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookstore.entities.Order;
import com.example.bookstore.repositories.OrderRepository;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository orderRepo;

    public List<Order> findAll(){
        return orderRepo.findAll();
    }

    public Order findById(Long id){
        return orderRepo.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public Order save(Order order){
        return orderRepo.save(order);
    }

    public void deleteById(Long id){
        orderRepo.deleteById(id);
    }
    
}