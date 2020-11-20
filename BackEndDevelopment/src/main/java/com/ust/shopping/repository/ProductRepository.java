package com.ust.shopping.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ust.shopping.model.Product;

public interface ProductRepository extends MongoRepository<Product, Integer> {

}
