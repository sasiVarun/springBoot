package com.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
