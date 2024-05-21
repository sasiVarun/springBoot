package com.test.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.test.collection.Book;
import com.test.repo.BookRepository;

@Component
public class TestQueriesRunner implements CommandLineRunner {

	@Autowired
	private BookRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		Optional<Book> opt = repo.getOneBook(103);
		
		if(opt.isEmpty()) {
			System.out.println("No Data Found");
		} else {
			System.out.println(opt.get());
		}
		System.out.println("----------------------------");
		
		repo.getBookByWriterAndCategory("AJAY KUMAR", "Backend").forEach(System.out::println);
		
		System.out.println("----------------------------");
		
		repo.getBookGreaterThanNoOfPages(200).forEach(System.out::println);
		
		System.out.println("----------------------------");
		
		repo.getBookByWriterOrCategory("AJAY KUMAR", "Backend").forEach(System.out::println);
		
		System.out.println("----------------------------");
		
		repo.getBookA(107).forEach(System.out::println);
		
		System.out.println("----------------------------");
		
		System.out.println(repo.countDataB("AJAY KUMAR"));
		
		System.out.println("----------------------------");
		
		System.out.println(repo.isBookExistByWriter("SYED AHMED"));
		
		System.out.println("----------------------------");
		
		repo.getSortedData("AJAY KUMAR").forEach(System.out::println);
		
		System.out.println("----------------------------");
		
		System.out.println(repo.deleteByCategory("Frontend"));
	}

}
