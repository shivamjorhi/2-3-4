package com.cg.daos;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.cg.entities.Product;

@Repository
public class ProductDAO {
	
	
private List<Product> books = new ArrayList<>();
	
	@PostConstruct
	public void init() {
		books.add(new Product(101, "Laptop", "45678.34"));
		books.add(new Product(102,"IPad","65678.84"));
		books.add(new Product(103,"IPhone","88678.84"));
	}

	public void create(Product book) {
		books.add(book);
	}
	
	public List<Product> getAll(){
		return books;
	}
}
