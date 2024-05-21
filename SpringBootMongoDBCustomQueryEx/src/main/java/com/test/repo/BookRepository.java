package com.test.repo;

import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import com.test.collection.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{
	
	@Query("{ id : ?0 }") // equal to
	public Optional<Book> getOneBook(Integer id);
	
	@Query(" { writer : ?0 , category : ?1 } ") // AND Condition
	List<Book> getBookByWriterAndCategory(String writer, String category);
	
	@Query(" { noOfPages : { $gt : ?0 } } ") // Using greater than
	List<Book> getBookGreaterThanNoOfPages(Integer pages);
	
	@Query(" { $or : [ { writer: ?0 }, { category : ?1 } ] } ") // OR Condition
	List<Book> getBookByWriterOrCategory(String writer, String category);
	
	//-----------------------------------------------------------------
	
	// select title, noOfPages, writer from book where id = ?
	@Query(value = " { id : ?0 } ", fields = "{ title: 1, noOfPages: 1, writer: 1}") // Using Projection
	List<Book> getBookA(Integer id);
	
	@Query(value = "{writer : ?0}", count = true) // Count
	Integer countDataB(String writer);
	
	@Query(value = "{writer : ?0}", exists = true)
	Boolean isBookExistByWriter(String writer);
	
	@Query(value = "{writer : ?0}", sort = "{title : -1}") // 1: Ascending, -1: Descending
	List<Book> getSortedData(String writer);
	
	@Query(value = "{category : ?0}", delete = true) //delete
	Long deleteByCategory(String category);
}
