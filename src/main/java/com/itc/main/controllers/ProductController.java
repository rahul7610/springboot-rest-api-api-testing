package com.itc.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itc.main.entity.Product;
import com.itc.main.services.ProductService;

@RestController
@RequestMapping("/api/")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	//Handler Methods
	
	@PostMapping("product")
	public ResponseEntity<String> save(@RequestBody Product product){
		 this.productService.save(product);
		 return new ResponseEntity<String>("CREATED",HttpStatus.CREATED);
	}
	
	@GetMapping("products")
	public ResponseEntity<List<Product>> getAllProducts(){
		List<Product> list=this.productService.getAllProducts();
		
		return new ResponseEntity<List<Product>>(list, HttpStatus.OK);
	}
	
	
}
