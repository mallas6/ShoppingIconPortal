package com.ust.shopping.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ust.shopping.model.Details;

public interface ProductDetailsRepository extends MongoRepository<Details, Integer> {

}
