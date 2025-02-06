package com.apps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apps.entities.Author;
import com.apps.entities.Book;
import com.apps.services.BookService;
import com.apps.utils.RecordAlreadyExistsException;

@RestController
@RequestMapping("/api")
public class BookAPI {
  @Autowired
  private BookService bservice;
	
	@GetMapping("/books")
	public List<Book> getBooks(){
		 return bservice.getBooks();
	}
	
	@GetMapping("/authors")
	public List<Author> getAuthors(){
		 return bservice.getAuthors();
	}
	
	@PostMapping("/authors")
	public ResponseEntity<Object> addAuthors(@RequestBody Author author) throws RecordAlreadyExistsException{
		bservice.addAuthor(author);
		return new ResponseEntity<>(author,HttpStatus.CREATED);
	}
}
