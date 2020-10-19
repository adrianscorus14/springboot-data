package com.adrianscorus.springbootdata.controller;


import com.adrianscorus.springbootdata.entities.Product;
import com.adrianscorus.springbootdata.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping(path = "/add")
    public void addProduct(@RequestBody Product p){
        productRepository.save(p);
    }

    @GetMapping(path = "/get/{name}")
    public Product getProduct(@PathVariable  String name){
        return productRepository.findProductByName(name);
    }
}
