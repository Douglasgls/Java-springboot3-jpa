package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.services.ProductService;


@RestController
@RequestMapping(value = "/products")
public class ProductResources {

	@Autowired
	private ProductService service;
	
	
	@GetMapping
	public ResponseEntity<List<Product>> getCategories() {
		return ResponseEntity.ok().body(service.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> geProduct(@PathVariable Long id){
		Product Product = service.findById(id);
		return ResponseEntity.ok().body(Product);
		
	}
	
	
	
	
	
}
