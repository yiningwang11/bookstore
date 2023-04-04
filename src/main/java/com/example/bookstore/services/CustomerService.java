package com.example.bookstore.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookstore.entities.Customer;
import com.example.bookstore.repositories.CustomerRepository;

@Service
public class CustomerService {
    
    @Autowired
    private CustomerRepository customerRepo;

    public List<Customer> findAll(){
        return customerRepo.findAll();
    }

    public Customer findById(Long id){
        return customerRepo.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public Customer save(Customer book){
        return customerRepo.save(book);
    }

    public void deleteById(Long id){
        customerRepo.deleteById(id);
    }
    
}