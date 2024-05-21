package com.test.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.test.collection.Product;

public interface ProductRepository extends MongoRepository<Product, Integer>{

}
