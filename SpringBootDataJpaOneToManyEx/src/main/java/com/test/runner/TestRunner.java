package com.test.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.test.entity.Model;
import com.test.entity.Product;
import com.test.repo.ModelRepository;
import com.test.repo.ProductRepository;

@Component
public class TestRunner implements CommandLineRunner{
	@Autowired
	ModelRepository mrepo;
	@Autowired
	ProductRepository prepo;
	
	public void run(String ...args) throws Exception{
		Model m1 = new Model(501,"MINI");
		Model m2 = new Model(502,"MICRO");
		
		mrepo.save(m1);
		mrepo.save(m2);
		
		Set<Model> set = Set.of(m1,m2);
		
		Product p1 = new Product(10, "Laptop", set);
		prepo.save(p1);
	}
}
