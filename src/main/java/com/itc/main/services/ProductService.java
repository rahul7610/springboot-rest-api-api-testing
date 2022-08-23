package com.itc.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itc.main.entity.Product;
import com.itc.main.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	
	public void save(Product product) {
		this.productRepository.save(product);
		
	}
	
	
	public List<Product> getAllProducts(){
		return this.productRepository.findAll();
		
	}
}
