package com.apps.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="books")
public class Book {

	 @Id
	 private Integer bookno;
	 @Column
	 private String name;
	 @Column
	 private String category;
	 @Column
	 private Integer price;
	 @ManyToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "authorno")
	 @JsonIgnore
	 private Author author;
	 
	 public Book() {}
	 
	 
	public Book(Integer bookno, String name, String category, Integer price) {
		super();
		this.bookno = bookno;
		this.name = name;
		this.category = category;
		this.price = price;
	}


	public Integer getBookno() {
		return bookno;
	}
	public void setBookno(Integer bookno) {
		this.bookno = bookno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}


	public Author getAuthor() {
		return author;
	}


	public void setAuthor(Author author) {
		this.author = author;
	}
	 
	 
}
