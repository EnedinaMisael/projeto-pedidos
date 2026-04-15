package com.storeProject.demo.services;

import com.storeProject.demo.entities.Product;
import com.storeProject.demo.entities.User;
import com.storeProject.demo.repositories.ProductRepository;
import com.storeProject.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> fildAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }

}
