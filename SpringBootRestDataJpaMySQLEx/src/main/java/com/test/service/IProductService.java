package com.test.service;

import java.util.List;

import com.test.entity.Product;

public interface IProductService {
	
	Integer saveProduct(Product product);
	
	void updateProduct(Product product);
	
	void deleteProduct(Integer id);
	
	Product getOneProduct(Integer id);
	
	List<Product> getAllProducts();
	
	Integer updateProductCodeById(String code, Integer id);
}
