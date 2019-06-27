package com.lakmisystems.lakmiprizer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/products")
public class Products {
 
    @RequestMapping(method=RequestMethod.POST)
    public @ResponseBody void addProduct() {
        
    }
    
    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public @ResponseBody void deleteProduct(@PathVariable Long id) {
        
    } 
 
}
