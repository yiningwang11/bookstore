package com.example.bookstore.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookstore.entities.Sale;
import com.example.bookstore.repositories.SaleRepository;

@Service
public class SaleService {
    
    @Autowired
    private SaleRepository saleRepo;

    public List<Sale> findAll(){
        return saleRepo.findAll();
    }

    public Sale findById(Long id){
        return saleRepo.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public Sale save(Sale sale){
        return saleRepo.save(sale);
    }

    public void deleteById(Long id){
        saleRepo.deleteById(id);
    }
    
}