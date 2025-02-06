package com.apps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apps.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer>{

}
