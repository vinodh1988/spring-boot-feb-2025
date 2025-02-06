package com.apps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apps.entities.Author;
import com.apps.entities.Book;
import com.apps.services.BookService;

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
}
