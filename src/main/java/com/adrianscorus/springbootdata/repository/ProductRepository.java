package com.adrianscorus.springbootdata.repository;

import com.adrianscorus.springbootdata.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {


    public Product findProductByName(String name);
    public Product findFirstByName(String name);

}
