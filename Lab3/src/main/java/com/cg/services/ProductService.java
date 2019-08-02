package com.cg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.daos.ProductDAO;
import com.cg.entities.Product;
import com.cg.exceptions.ApplicationException;

@Service
public class ProductService {
	
	@Autowired private ProductDAO dao;
	
	
	public void save(Product book) {
			dao.create(book);
	}
	
	public List<Product> getAll(){
		List<Product> books = dao.getAll();
		if(books == null || books.isEmpty()) {
			throw new ApplicationException("No books available yet!");
		}
		return books;
	}
}
