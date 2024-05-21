package com.test.runner;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.test.collection.Product;
import com.test.repo.ProductRepository;

@Component
public class TestRunner implements CommandLineRunner{

	@Autowired
	private ProductRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		repo.save(new Product(101, "PEN", 290.00));
		repo.save(new Product(102, "PENCIL", 120.00));
		repo.save(new Product(103, "BOOK", 570.00));
		
		repo.saveAll(Arrays.asList(
				new Product(104, "SCALE", 460.00),
				new Product(105, "ERASER", 366.00),
				new Product(106, "SHARPNER", 510.00)
				)
			);
		repo.findAll().forEach(System.out::println);
		
		Optional<Product> opt = repo.findById(103);
		
		if(opt.isEmpty()) {
			System.out.println("No Data available");
		} else {
			System.out.println(opt.get());
		}
	}
}
