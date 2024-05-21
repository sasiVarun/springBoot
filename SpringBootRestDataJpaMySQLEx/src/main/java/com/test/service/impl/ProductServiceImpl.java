package com.test.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.entity.Product;
import com.test.exception.ProductNotFoundException;
import com.test.repo.ProductRepository;
import com.test.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private ProductRepository repo;

	public Integer saveProduct(Product product) {
		return repo.save(product).getProdId();
	}

	public void updateProduct(Product product) {
		if(product.getProdId()!=null && repo.existsById(product.getProdId()))
			repo.save(product);
		else
			throw new ProductNotFoundException("Product Not Exist");
	}

	public void deleteProduct(Integer id) {
//		repo.deleteById(id);
		repo.delete(getOneProduct(id));
	}

	public Product getOneProduct(Integer id) {
//		return repo.findById(id).get();
		Optional<Product> product = repo.findById(id);
		if(product.isEmpty()) {
			throw new ProductNotFoundException("Product Not Exist");
		}else {
			return product.get();
		}
	}

	public List<Product> getAllProducts() {
		return repo.findAll();
	}
	
	@Transactional
	public Integer updateProductCodeById(String code, Integer id) {
		// return repo.updateProductCodeById(code, id);
		if(repo.existsById(id))
			return repo.updateProductCodeById(code, id);
		else
			throw new ProductNotFoundException("Product Not Exist");
	}
}
