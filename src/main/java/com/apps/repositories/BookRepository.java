package com.apps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apps.entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
