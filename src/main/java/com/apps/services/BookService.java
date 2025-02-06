package com.apps.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apps.entities.Author;
import com.apps.entities.Book;
import com.apps.repositories.AuthorRepository;
import com.apps.repositories.BookRepository;

@Service
public class BookService {
  
	@Autowired
	private BookRepository brepo;
	
	@Autowired
	private AuthorRepository arepo;
	
	public List<Book> getBooks() {
		return brepo.findAll();
	}
	
	public List<Author> getAuthors() {
		return arepo.findAll();
	}
}
