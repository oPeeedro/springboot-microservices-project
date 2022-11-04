package com.microservices.productservice.repository;

import com.microservices.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
