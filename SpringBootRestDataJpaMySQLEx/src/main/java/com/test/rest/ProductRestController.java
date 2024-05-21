package com.test.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Product;
import com.test.exception.ProductNotFoundException;
import com.test.service.IProductService;

@RestController
@RequestMapping("/product")
public class ProductRestController {
	
	@Autowired
	private IProductService service;
	
	// 1. SAVE: JSON ---> Object --->Method Param ---> repo.save()
	@PostMapping("/create")
	public ResponseEntity<String> createProduct(
			@RequestBody Product product
			)
	{
		ResponseEntity<String> response = null;
		Integer id = service.saveProduct(product);
		response = new ResponseEntity<String>("Product '"+ id +"' Created..!", HttpStatus.CREATED); //201
		return response;
	}
	
	// 2. To fetch data as List<Product> ---> JSON [{},{},{}]
	@GetMapping("/all")
	public ResponseEntity<List<Product>> getAllProducts(){
		ResponseEntity<List<Product>> response = null;
		List<Product> list = service.getAllProducts();
		response = new ResponseEntity<List<Product>>(list,HttpStatus.OK); //200
		return response;
	}
	
	// 3. Fetch one record by Id (Integer/PathVariable)
	@GetMapping("/find/{pid}")
	public ResponseEntity<Product> getOneProduct(@PathVariable Integer pid)
	{
		ResponseEntity<Product> response = null;
		try {
			Product product = service.getOneProduct(pid);
			response = new ResponseEntity<Product>(product,HttpStatus.OK); //200
		}catch (ProductNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		return response;
	}
	
	@DeleteMapping("/remove/{pid}")
	public ResponseEntity<String> deleteOneProduct(@PathVariable Integer pid){
		ResponseEntity<String> response = null;
		try {
			service.deleteProduct(pid);
			response = new ResponseEntity<String>("Product Deleted..!", HttpStatus.OK); //200
		} catch (ProductNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		return response;
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateProduct(@RequestBody Product product){
		ResponseEntity<String> response = null;
		try {
			service.updateProduct(product);
			response = new ResponseEntity<String>("Product Updated..!", HttpStatus.OK); //200
		} catch (ProductNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		return response;
	}
	
	@PatchMapping("/modify/{id}/{code}")
	public ResponseEntity<String> updateProduct(
			@PathVariable Integer id,
			@PathVariable String code
			)
	{
		
		ResponseEntity<String> response = null;
		try {
			service.updateProductCodeById(code, id);
			response = new ResponseEntity<String>("Code is Updated..!", HttpStatus.OK);
		} catch (ProductNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		return response;
	}
}
