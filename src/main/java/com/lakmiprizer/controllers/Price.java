package com.lakmiprizer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/price")
public class Price {
	@RequestMapping(method=RequestMethod.POST)
    public @ResponseBody void createPrice() {
        
    }
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public @ResponseBody void addProduct(@PathVariable Long id) {
        
    }
    
    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public @ResponseBody void deleteProduct(@PathVariable Long id) {
        
    }
    
    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody void getPrice() {
        
    }
}
