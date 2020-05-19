package com.example.microservices.catalogservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.catalogservice.ProductsRepository;


@RestController
public class ProductCatalogController {

	@Autowired
	private ProductsRepository repo;
	
		
	@GetMapping("Catalog")
	public List <Products> getEmployee(Model model) {
		
		List <Products> prodList = (List<Products>)repo.findAll();
		
		return prodList;
	}
	
	
}
