package com.test.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.test.entity.Product;
import com.test.repo.ProductRepository;

@Component
public class TestRunner implements CommandLineRunner{
	
	@Autowired
	ProductRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.save(new Product(101,"AA",100.00));
		repo.save(new Product(102,"BB",200.00));
		repo.save(new Product(103,"CC",300.00));
		repo.save(new Product(104,"DD",400.00));
		repo.save(new Product(105,"EE",500.00));
		
		repo.saveAll(
				Arrays.asList(
						new Product(106,"FF",600.00),
						new Product(107,"GG",700.00),
						new Product(108,"HH",800.00)
						)
				);
		List<Product> list = repo.findAll();
		list.forEach(System.out::println);
		
		System.out.println("----------------------------------");
		
		// Input (page number, size)
		Pageable pageable = PageRequest.of(0, 3);
		Page<Product> page = repo.findAll(pageable);
		
		// Read Page data
		List<Product> pageList = page.getContent();
		pageList.forEach(System.out::println);
		
		// meta data
		System.out.println("First Page?: " + page.isFirst());
		System.out.println("Last Page?: " + page.isLast());
		System.out.println("next Page?: " + page.hasNext());
		System.out.println("previous Page?: " + page.hasPrevious());
		System.out.println("Empty?: " + page.isEmpty());
		System.out.println("Total Pages Size?: " + page.getSize());
		System.out.println("Total Pages?: " + page.getTotalPages());
		System.out.println("Total Rows?: " + page.getTotalElements());
	}

}
