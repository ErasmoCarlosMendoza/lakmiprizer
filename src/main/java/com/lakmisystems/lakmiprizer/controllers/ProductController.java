package com.lakmisystems.lakmiprizer.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lakmisystems.lakmiprizer.entity.Product;
import com.lakmisystems.lakmiprizer.services.ProductService;

@Controller
@RequestMapping("/api")
public class ProductController {
	@Autowired
	@Qualifier("productService")
	ProductService productService;
 
	@RequestMapping(value="/product",method=RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Void> addProduct(@RequestBody Product product) {
    	productService.create(product);
    	return new ResponseEntity<Void>(HttpStatus.CREATED);
    } 
    
    @RequestMapping(value="/product/{id}", method=RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity<Void> deleteProduct(@PathVariable("id") String id) {
    	productService.delete(id);
    	return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
    
    @RequestMapping(value="/product/{id}", method=RequestMethod.GET)
    @ResponseBody	
    public ResponseEntity<Product> getProduct(@RequestBody String id) {
    	Product product = productService.getOne(id);
    	return new ResponseEntity<Product>(product, HttpStatus.OK);
    }
    
    @RequestMapping(value="/products", method=RequestMethod.GET)
    public ResponseEntity<List<Product>> getProducts() {
    	List<Product> product = productService.getAll();
    	return new ResponseEntity<List<Product>>(product, HttpStatus.OK);
    }
    
    @RequestMapping(value="/product",method=RequestMethod.PUT)
    @ResponseBody
    public ResponseEntity<Void> updateProduct(@RequestBody Product product) {
    	productService.create(product);
    	return new ResponseEntity<Void>(HttpStatus.OK);
    } 
   
 
}
