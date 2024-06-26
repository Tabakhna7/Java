package com.codingdojo.allbooks_1.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.allbooks_1.models.Book;
@Repository
public interface BookRepo extends CrudRepository<Book, Long> {
	 List<Book> findAll();
	    // this method finds books with descriptions containing the search string
	    List<Book> findByDescriptionContaining(String search);
	    // this method counts how many titles contain a certain string
	    Long countByTitleContaining(String search);
	    // this method deletes a book that starts with a specific title
	    Long deleteByTitleStartingWith(String search);
	}



