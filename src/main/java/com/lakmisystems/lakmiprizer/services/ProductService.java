package com.lakmisystems.lakmiprizer.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.lakmisystems.lakmiprizer.entity.Product;
import com.lakmisystems.lakmiprizer.repository.ProductRepository;

@Service("productService")
public class ProductService {
	@Autowired
	@Qualifier("productRepository")
	ProductRepository productRepository;
	
	public void create (Product product) {
		productRepository.save(product);
	}
	public void update (Product product) {
		productRepository.save(product);
	}
	public void delete (String id) {
		productRepository.deleteById(id);
	}
	public Product getOne (String id) {
		return productRepository.findById(id).get();
	}
	public List<Product> getAll () {
		return productRepository.findAll();
	}
}
