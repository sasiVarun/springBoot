package com.test.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.test.entity.Product;
import com.test.repo.ProductRepository;

@Component
public class TestRunner implements CommandLineRunner{
	
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(repo.getClass().getName());
		repo.save(new Product(100,"PEN",200.00));
		repo.save(new Product(101,"BOOK",300.00));
		repo.save(new Product(102,"BAG",400.00));
		repo.save(new Product(103,"BOX",500.00));
		repo.save(new Product(103,"BOX",550.00));
		
		repo.saveAll(
				Arrays.asList(
						new Product(104,"AA",650.00),
						new Product(105,"BB",750.00),
						new Product(106,"CC",50.00)
						)
				);
		System.out.println("----------------------");
		List<Product> list = repo.findAll();
		list.forEach(System.out::println);
		
		System.out.println("----------------------");
		Optional<Product> record = repo.findById(105); // Primary Key Input
		
		if(record.isPresent()) {
			Product p = record.get();
			System.out.println(p);
		}else {
			System.out.println("Data not found for given Id");
		}
		System.out.println("----------------------");
		
		boolean exists = repo.existsById(108);
		System.out.println(exists);
		
		long records = repo.count();
		System.out.println("No of records in Database table: " + records);
		
		repo.deleteById(106);
//		repo.deleteAll(); //delete one by one
		repo.deleteAllInBatch(); // delete all at a time
		
	}

}
