package com.test.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.test.collection.Book;
import com.test.repo.BookRepository;

@Component
public class TestRunner implements CommandLineRunner{

	@Autowired
	private BookRepository repo;
	@Override
	public void run(String... args) throws Exception {
		repo.save(new Book(101, "Core Java", 250, "AJAY KUMAR", "Backend"));
		repo.save(new Book(102, "Advanced Java", 150, "SYED AHMED", "Backend"));
		repo.save(new Book(103, "Spring", 190, "AJAY KUMAR", "Backend"));
		repo.save(new Book(104, "Microservices", 650, "AJAY KUMAR", "Backend"));
		
		repo.save(new Book(105, "HTML", 60, "SAM SUN", "Frontend"));
		repo.save(new Book(106, "Angular", 100, "AJAY KUMAR", "Frontend"));
		repo.save(new Book(107, "CSS", 115, "SAM SUN", "Frontend"));
		repo.save(new Book(108, "JQuery", 100, "SYED AHMED", "Frontend"));
	}
}
